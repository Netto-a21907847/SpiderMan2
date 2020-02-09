package Netto.SpiderMan2;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class SpiderMan2 extends JFrame {

    ImageIcon fundoI = new ImageIcon(getClass().getResource("fundo1.jpg"));
    ImageIcon spiderI = new ImageIcon(getClass().getResource("sp.gif"));
    ImageIcon spiderI2 = new ImageIcon(getClass().getResource("sp1.gif"));
    ImageIcon ironI = new ImageIcon(getClass().getResource("iron.jpg"));

    JLabel fundo = new JLabel(fundoI);
    JLabel spider = new JLabel(spiderI);
    JLabel iron = new JLabel(ironI);

    URL url = getClass().getResource("ironMaiden.wav");
    AudioClip audio = Applet.newAudioClip(url);

    public SpiderMan2(){
        painel();
        editComp();
        spider.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                spider.setIcon(spiderI2);
                audio.play();
            }
            public void mousePressed(MouseEvent e) {
                spider.setIcon(spiderI);
                audio.stop();

            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        });

    }

    public void painel(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(287,250);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        add(spider);
        add(iron);
        add(fundo);
    }

    public void editComp(){
        fundo.setBounds(0,0,287,165);
        spider.setBounds(0,0,265,165);
        iron.setBounds(-5,160,287,85);
    }


    public static void main(String[] args) {
        new SpiderMan2();
    }
}
