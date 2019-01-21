package a2basics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel {

    private Image bardejov;

    public Board() {

        initBoard();
    }
    
    private void initBoard() {
        
        loadImage();
        
        int w = bardejov.getWidth(this);
        int h =  bardejov.getHeight(this);
        setPreferredSize(new Dimension(w, h));        
    }
    
    private void loadImage() {
        
        ImageIcon ii = new ImageIcon("src/resources/bardejov.png");
        bardejov = ii.getImage();        
    }

    @Override
    public void paintComponent(Graphics g) {       
        g.drawImage(bardejov, 0, 0, null);
    }
}
