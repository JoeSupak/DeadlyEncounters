
package maze;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Player {
    private int tileX, tileY;
    
    private Image player;
    
    public Player(){
        
        ImageIcon img = new ImageIcon("H://1//Maze//src//maze//char1.png");
        player = img.getImage();
        
        
        tileX = 1;
        tileY = 1;
    }
    
    public Image getPlayer(){
        return player;
    }
    
    public int getTileX(){
        return tileX;
    }
    public int getTileY(){
        return tileY;
    }
    public void move(int dx, int dy){
        
       
       tileX += dx;
       tileY += dy;
       
    }
}
