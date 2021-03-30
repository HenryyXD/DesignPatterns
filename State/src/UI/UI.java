package UI;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI{
    private Player player;

    public UI(Player player){
        this.player = player;
    }

    public void init(){
        JFrame jf = new JFrame();
        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        jf.getContentPane().add(jp);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField txt = new JTextField();
        jp.add(txt);
        jp.add(buttons);

        JButton play = new JButton("Play");
        play.addActionListener(e -> txt.setText(player.getState().onPlay()));
        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> txt.setText(player.getState().onLock()));
        JButton next = new JButton("Next");
        next.addActionListener(e -> txt.setText(player.getState().onNext()));
        JButton prev = new JButton("Prev");
        prev.addActionListener(e -> txt.setText(player.getState().onPrevious()));

        buttons.add(play);
        buttons.add(stop);
        buttons.add(prev);
        buttons.add(next);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300, 100);
        jf.setVisible(true);    
    }
}