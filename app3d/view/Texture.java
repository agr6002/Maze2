package app3d.view;

import java.util.ArrayList;
import app3d.utilities.Loader;

public class Texture {

  public static ArrayList<Texture> textures = new ArrayList<Texture>();

  static {
    textures.add(new Texture("app3d/resources/border.png", 64));
    textures.add(new Texture("app3d/resources/lava.png", 64));
    textures.add(new Texture("app3d/resources/water.png", 64));
    textures.add(new Texture("app3d/resources/door.png", 64));
    textures.add(new Texture("app3d/resources/normalwall.png", 64));
    textures.add(new Texture("app3d/resources/regeneration.png", 64));
    textures.add(new Texture("app3d/resources/slime.png", 64));
    textures.add(new Texture("app3d/resources/poison.png", 64));
    textures.add(new Texture("app3d/resources/exitEntrance.png", 64));
  }

  public final int[] pixels;
  public final int size;

  public Texture(String url, int size) {
    System.out.println("Constructing Texture from " + url);
    this.size = size;
    pixels = new int[size * size];
    Loader.loadAsBufferedImage(url).getRGB(0, 0, size, size, pixels, 0, size);
  }

}
