package Main;

/**
 * Created by Шпакулева on 12.10.2016.
 */
import javax.swing.JFrame;
public class Game {
    public static void main(String [] args){
        JFrame window = new JFrame("The Christmas adventure");
        window.setContentPane(new GamePanel());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setVisible(true);

    }
}
