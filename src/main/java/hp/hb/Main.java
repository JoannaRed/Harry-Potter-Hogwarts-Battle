package hp.hb;

public class Main {
    public static void main(String[] args) {
        Display display = new Display("Harry Potter Game");
        Gameplay gameplay = new Gameplay();
        GameEngine ge = new GameEngine(display, gameplay);
        // 1. start  2. start odpala run

        ge.start();
    }
}
