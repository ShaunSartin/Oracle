/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summerstudy2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shaun
 */
public class Player extends JPanel{
    
    private BufferedImage image;
    private BufferedImage frontImage;
    public Player() {
       try {                
          image = ImageIO.read(new File("C:\\Users\\Shaun\\Desktop\\link_resized.png"));
          frontImage = ImageIO.read(new File("C:\\Users\\Shaun\\Desktop\\link_front_resized.png"));
       } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot find image", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters   
        g.drawImage(frontImage, 90, 0, null);
    }
}
