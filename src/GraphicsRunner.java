//Name - Rylan Hughey
//Date -10/7/22

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class GraphicsRunner extends JFrame
{
    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;

    public GraphicsRunner()
    {
        super("Haunted House");

        setSize(WIDTH,HEIGHT);

        getContentPane().add(new Haunted_House());

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main( String[] args )
    {
        GraphicsRunner run = new GraphicsRunner();
    }
}
