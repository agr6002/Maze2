package app3d.model;

import java.util.ArrayList;

import app3d.App3d;
import app3d.utilities.Loader;

public class Model {

  public final String MAP_URL = "app3d/resources/map.txt";

  public final Camera camera;
  // public final int mapWidth = 15;
  // public final int mapHeight = 15;
  // public final int[][] map = { { 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2 },
  // { 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2 }, { 1, 0, 3, 3, 3, 3, 3, 0, 0,
  // 0, 0, 0, 0, 0, 2 },
  // { 1, 0, 3, 0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 0, 2 }, { 1, 0, 3, 0, 0, 0, 3, 0, 2,
  // 2, 2, 0, 2, 2, 2 },
  // { 1, 0, 3, 0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 0, 2 }, { 1, 0, 3, 3, 0, 3, 3, 0, 2,
  // 0, 0, 0, 0, 0, 2 },
  // { 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2 }, { 1, 1, 1, 1, 1, 1, 1, 1, 4,
  // 4, 4, 0, 4, 4, 4 },
  // { 1, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 4 }, { 1, 0, 0, 0, 0, 0, 1, 4, 0,
  // 0, 0, 0, 0, 0, 4 },
  // { 1, 0, 0, 0, 0, 0, 1, 4, 0, 3, 3, 3, 3, 0, 4 }, { 1, 0, 0, 0, 0, 0, 1, 4, 0,
  // 3, 3, 3, 3, 0, 4 },
  // { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4 }, { 1, 1, 1, 1, 1, 1, 1, 4, 4,
  // 4, 4, 4, 4, 4, 4 } };
  // public ArrayList<ArrayList<Integer>> testMap =
  // Loader.load2dIntegerArray(MAP_URL);
  public int[][] map = Loader.load2dIntegerArray(MAP_URL);
  public final int mapHeight = map.length;
  public final int mapWidth = map[0].length;

  public Model(App3d app) {
    System.out.println("Constructing Model");
    camera = new Camera(app, 1, 1, 1, 0, 0, -0.66);
    // printMap();
  }

  // // for testing only
  // private void printMap() {
  // for (ArrayList<Integer> row : map) {
  // for (Integer c : row) {
  // System.out.print(c);
  // }
  // System.out.println();
  // }
  // }

}
