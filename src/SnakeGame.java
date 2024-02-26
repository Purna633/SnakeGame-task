import javax.swing.*;
public class SnakeGame{
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;
        JFrame f = new JFrame("SnakeGame");
        f.setVisible(true);
        f.setSize(boardWidth, boardHeight);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Snake snake=new Snake(boardWidth, boardHeight);
        f.add(snake);
        snake.requestFocus();
        f.pack();


    }
}

