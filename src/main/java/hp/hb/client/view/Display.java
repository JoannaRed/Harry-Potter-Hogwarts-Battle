package hp.hb.client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

//manages game frame and canvas
public final class Display {

    private static final int DEFAULT_WIDTH = 1800;
    private static final int DEFAULT_HEIGHT =800;

    private static int width;
    private static int height;

    private JFrame frame;
    private Canvas canvas;

    private String title;
    private Dimension size;

    public Display(String title) {
        this.title = title;
        width = DEFAULT_WIDTH;
        height = DEFAULT_HEIGHT;
        size = new Dimension(width, height);

        createAndSetupFrame();
        createAndSetupCanvas();
        frame.pack();
    }

    private void createAndSetupFrame() {
        frame = new JFrame(title);

        frame.setSize(size);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //frame.setLocationRelativeTo(null);
        frame.setLocation(2000,50);
        frame.setResizable(false);
    }

    private void createAndSetupCanvas() {
        canvas = new Canvas();

        canvas.setPreferredSize(size);
        canvas.setMaximumSize(size);
        canvas.setMinimumSize(size);
        frame.add(canvas);

        canvas.setFocusable(true);
        canvas.requestFocusInWindow();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public static int getHeight() {
        return height;
    }

    public static int getHeight(double percent) {
        return (int)(height*percent);
    }
    public static int getWidth() {
        return width;
    }
    public static int getWidth(double percent) {
        return (int)(width*percent);
    }
    public void addListener(MouseListener listener) {
        canvas.addMouseListener(listener);
    }

    public void showGame() {
        frame.setVisible(true);
    }


}
