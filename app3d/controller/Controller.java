package app3d.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {

  public boolean left, right, forward, back, pressedSpace;

  @Override
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_LEFT:
        left = true;
        break;
      case KeyEvent.VK_RIGHT:
        right = true;
        break;
      case KeyEvent.VK_UP:
        forward = true;
        break;
      case KeyEvent.VK_DOWN:
        back = true;
        break;
      case KeyEvent.VK_SPACE:
        pressedSpace = true;
        break;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_LEFT:
        left = false;
        break;
      case KeyEvent.VK_RIGHT:
        right = false;
        break;
      case KeyEvent.VK_UP:
        forward = false;
        break;
      case KeyEvent.VK_DOWN:
        back = false;
        break;
      case KeyEvent.VK_SPACE:
        pressedSpace = false;
        break;
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub

  }

}
