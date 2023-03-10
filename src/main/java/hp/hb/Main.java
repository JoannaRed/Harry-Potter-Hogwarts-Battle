package hp.hb;

import hp.hb.client.GameEngine;
import hp.hb.client.Gameplay;
import hp.hb.client.controller.MouseManager;
import hp.hb.client.view.Display;

public class Main {
    public static void main(String[] args) {
        Display display = new Display("Harry Potter Game");
        Gameplay gameplay = new Gameplay();
        GameEngine ge = new GameEngine(display, gameplay);
        // 1. start  2. start odpala run

        ge.start();

        MouseManager mouseManager = new MouseManager();
        display.addListener(mouseManager);
    }
}
