package edu.cnm.deepdive;

import javax.swing.JFrame;

/**
 * @author Kelly Escobar
 *
 */
public class BlockBreaker {

  /**
   * @param args
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame("Block Breaker");
    
    BlockBreakerPanel panel = new BlockBreakerPanel();
    
    frame.getContentPane().add(panel);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.setVisible(true);
    frame.setSize(490,600);
    frame.setResizable(false);

  }

}
