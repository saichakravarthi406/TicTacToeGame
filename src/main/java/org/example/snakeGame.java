package org.example;

import javax.swing.JFrame;

public class snakeGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePanel panel = new GamePanel();

        frame.add(panel);
        frame.setTitle("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack(); // Adjusts frame to panel's preferred size
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // Center the window
    }
}

