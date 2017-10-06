package edu.cnm.deepdive;

public class Animate implements Runnable {
  BlockBreakerPanel bp;
  
  Animate(BlockBreakerPanel b) {
      bp = b;
  }
  
  public void run() {
    while(true) {
      bp.update();
      try {
        Thread.sleep(10);
      } catch (InterruptedException ex) {
        // TODO Auto-generated catch block
        ex.printStackTrace();
      }
    }
  }
  
}
