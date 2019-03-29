import javax.swing.*;
import java.awt.*;

public class RPSView
{
   JFrame frame;
   JPanel panel;
   JLabel welcome;
   JButton classic;
   JButton strike;
   JButton highscore;
   JButton exit;

   public RPSView()
   {
      //initializing frame
      frame = new JFrame("Medieval Rock Paper Scissors");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //initializing panel
      panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panel.setPreferredSize(new Dimension(250,210));

      //initializing label
      welcome = new JLabel("Welcome Player!");
      welcome.setAlignmentX(panel.CENTER_ALIGNMENT);

      //initializing buttons
      classic = new JButton("Classic");
      classic.setMaximumSize(new Dimension(200, 50));
      classic.setAlignmentX(panel.CENTER_ALIGNMENT);

      strike = new JButton("Strike");
      strike.setMaximumSize(new Dimension(200, 50));
      strike.setAlignmentX(panel.CENTER_ALIGNMENT);

      highscore = new JButton("Highscores");
      highscore.setMaximumSize(new Dimension(200, 50));
      highscore.setAlignmentX(panel.CENTER_ALIGNMENT);

      exit = new JButton("Exit");
      exit.setMaximumSize(new Dimension(200, 50));
      exit.setAlignmentX(panel.CENTER_ALIGNMENT);

      //adding everything to panel
      panel.add(welcome);
      panel.add(classic);
      panel.add(strike);
      panel.add(highscore);
      panel.add(exit);

      //add to frame and make visible
      frame.setContentPane(panel);
      frame.pack();
      frame.setVisible(true);
   }
}
