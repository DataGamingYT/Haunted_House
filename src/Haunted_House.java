import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Haunted_House extends Canvas
{
    public Haunted_House()  //constructor - sets up the class
    {
        setSize(1920,1080);
        setBackground(Color.darkGray);
        setVisible(true);
    }

    public void theHouse ( Graphics theHouse )
    {
        theHouse.setColor(Color.BLACK);
        theHouse.fillRect(200, 200, 500, 300);
        theHouse.drawRect(200, 200, 500, 300);
        //call theHouse
        //roof
        //theHouse.setColor(Color.DARK_GRAY);
        //theHouse.fillRect(100, 100, 200, 300);
        //theHouse.drawRect(100, 100, 200, 300);
    }

    public void roof ( Graphics roof )
    {
        roof.setColor(Color.ORANGE);

        roof.drawString( "HAPPY HALLOWEEN!!", 50, 50 );

        roof.setColor(Color.ORANGE);

        roof.fillRect( 200, 200, 400, 400 );

    }
}