import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Practice_4
{
    int x = 0, y = 0;
    Practice_4 ()
    {
        JFrame jfrm = new JFrame("A Simple Swing Application");
        jfrm.setSize(400, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jfrm.setVisible(true);

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");

        jfrm.add(button1, BorderLayout.WEST);
        jfrm.add(button2, BorderLayout.EAST);

        JLabel jlab1 = new JLabel("Result: 0 X 0");
        JLabel jlab2 = new JLabel("Last Scorer: N/A");
        JLabel jlab3 = new JLabel("Winner: DRAW");
        jfrm.add(jlab1, BorderLayout.CENTER);
        jfrm.add(jlab2, BorderLayout.SOUTH);
        jfrm.add(jlab3, BorderLayout.NORTH);

        MouseListener mouseListener = new MouseListener()
	{
            @Override
            public void mouseClicked(MouseEvent e)
	    {
                x++;
                jlab1.setText("Result: " + x + " x " + y);
                jlab2.setText("Last Scorer: AC Milan");
                if(x > y) jlab3.setText("Winner: AC Milan");
                else if(y > x) jlab3.setText("Winner: Real Madrid");
                else jlab3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        button1.addMouseListener(mouseListener);

        MouseListener mouseListener2 = new MouseListener()
	{
            @Override
            public void mouseClicked(MouseEvent e)
	    {
                y++;
                jlab1.setText("Result: " + x + " x " + y);
                jlab2.setText("Last Scorer: Real Madrid");
                if (x > y) jlab3.setText("Winner: AC Milan");
                else if (y > x) jlab3.setText("Winner: Real Madrid");
                else jlab3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        button2.addMouseListener(mouseListener2);
    }

    public static void main(String args[])
    {
        SwingUtilities.invokeLater (new Runnable()
	{
            @Override
            public void run()
	    {
                new Practice_4();
            }
        });
    }

}