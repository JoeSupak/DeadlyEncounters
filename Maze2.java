
package maze.Maze2;

import javax.swing.*;
import maze.Board2;


public class Maze2 {
  public void display(){
        JFrame f = new JFrame();
        f.setTitle("Deadly Encounters");
        f.add(new Board2());
        f.setSize(528, 438);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }  
}
