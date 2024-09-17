import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);  //Places window at centre of screen
        frame.setResizable(false); // Player cant resize the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack(); // to exclude the top area , the main game is the w x h;
        frame.setVisible(true);

    }
}
