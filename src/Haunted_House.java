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

    public void paint( Graphics door )
    {
        door.setColor(Color.BLACK);
        door.fillRect(200, 200, 50, 50);
        door.drawRect(200, 200, 50, 50);
        //call theHouse
    }

    public void theHouse( Graphics window )
    {
        window.setColor(Color.ORANGE);

        window.drawString( "HAPPY HALLOWEEN!!", 50, 50 );

        window.setColor(Color.ORANGE);

        window.fillRect( 200, 200, 400, 400 );

    }
}