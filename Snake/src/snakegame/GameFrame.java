package snakegame;

import javax.swing.JFrame;
import java.awt.FlowLayout;

public class GameFrame extends JFrame {

    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Use a layout manager (FlowLayout)
        this.setLayout(new FlowLayout());

        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
