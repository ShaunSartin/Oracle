/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summerstudy2;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SummerStudy2 {

    private ImageIcon link;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Player screen = new Player();
        frame.setSize(800, 500);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setBackground(Color.blue);
        frame.add(screen);
        frame.setVisible(true);
    }
    
}
