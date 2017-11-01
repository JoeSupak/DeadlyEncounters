


package maze;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Board2 extends JPanel implements ActionListener{
    private Timer timer2;
    
//    private Map2 m2;
    private Map2 m;
    private Player p;
    Map2 nextMap2 = new Map2();
    private String Message = "";
    
    public Board2(){
        
        m = new Map2();
//        m2 = new Board2();
        p = new Player();
        addKeyListener(new Al());
        setFocusable(true);
                
            
        timer2 = new Timer(30, this);
        timer2.start();
    }
    
    public void actionPerformed(ActionEvent e){
        if(m.getMap2(p.getTileX(), p.getTileY()).equals("s")){
//        add in Map2 here
//           board2.display();
        }
        if(m.getMap2(p.getTileX(), p.getTileY()).equals("g")){
//        add in Random encounter here
        }
        repaint();
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        for(int y = 0;y < 14; y++){
            for(int x = 0; x < 14; x++){
                if(m.getMap2(x, y).equals("s")){
                    g.drawImage(m.getStairs(), x * 32, y * 32, null);
                }
                if(m.getMap2(x, y).equals("g")){
                    g.drawImage(m.getGrass(), x * 32, y * 32, null);
                }
                
                if(m.getMap2(x, y).equals("w")){
                    g.drawImage(m.getWall(), x * 32, y * 32, null);
                }
                
            }
        }
        
        g.drawString(Message, 50, 50);
        
        g.drawImage(p.getPlayer(), p.getTileX() * 32, p.getTileY() * 32, null);
  
    }
    
    public class Al extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP){
                if(!m.getMap2(p.getTileX(), p.getTileY() - 1).equals("w"))
            p.move(0,-1);
                if(m.getMap2(p.getTileX(), p.getTileY() - 1).equals("g"))
            display();
            }
        if(keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN){
            if(!m.getMap2(p.getTileX(), p.getTileY() + 1).equals("w"))
            p.move(0, 1);
        }
        if(keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT){
            if(!m.getMap2(p.getTileX() - 1, p.getTileY()).equals("w"))
            p.move(-1, 0);
        }
        if(keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT){
            if(!m.getMap2(p.getTileX() + 1, p.getTileY()).equals("w"))
            p.move(1, 0);
        }
        }
        public void keyReleased(KeyEvent e){
            
        }
        public void keytyped(KeyEvent e){
            
        }

        private void display() {
      
        }
    }

}