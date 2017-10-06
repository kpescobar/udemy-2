package edu.cnm.deepdive;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Block extends Rectangle {
  Image pic;
  Block(int a, int b, int w, int h, String str) {
    x = a;
    y = b;
    width = w;
    height = h;
    pic = Toolkit.getDefaultToolkit().getImage(str);
  }
  
  public void draw(Graphics g, Component c) {
    g.drawImage(pic, x, y, width, height, c);
  }

}
