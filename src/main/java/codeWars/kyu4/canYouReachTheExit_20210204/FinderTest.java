package codeWars.kyu4.canYouReachTheExit_20210204;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinderTest {

  @Test
  public void testWhenMazeSizeIs1x1() {
    String maze = ".";
    assertTrue(Finder.pathFinder("."));
    assertFalse(Finder.pathFinder("W"));
  }

  @Test
  public void testWhenMazeSizeIs2x2() {
    String maze1 = "..\n"
        + "..";
    String maze2 = ".W\n"
        + "W.";
    String maze3 = ".W\n"
        + ".W";
    String maze4 = ".W\n"
        + "..";

    assertTrue(Finder.pathFinder(maze1));
    assertFalse(Finder.pathFinder(maze2));
    assertFalse(Finder.pathFinder(maze3));
    assertTrue(Finder.pathFinder(maze4));
  }

  @Test
  public void testWhenMazeSizeIs3x3() {
    String maze1 = ".W.\n"
                 + ".W.\n"
                 + "...\n";

    String maze2 = ".W.\n"
                 + ".W."
                 + "W..";

    String maze3 = "...\n"
                 + ".WW\n"
                 + "W..";

    String maze4 = "..W\n"
                 + "..W\n"
                 + "...";

    assertTrue(Finder.pathFinder(maze1));
    assertFalse(Finder.pathFinder(maze2));
    assertFalse(Finder.pathFinder(maze3));
    assertTrue(Finder.pathFinder(maze4));
  }
}