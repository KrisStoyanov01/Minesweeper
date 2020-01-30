import javax.swing.*;
import java.util.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI() {
        this.setTitle("Minesweeper");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Application will close after pressing x at the top right corner
        this.setVisible(true);
        this.setResizable(false);
    }
}
