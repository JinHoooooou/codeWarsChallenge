package codeWars.kyu7.buildingBlocks_20201126;

public class Block {

  int width;
  int length;
  int height;

  public Block(int[] data) {
    this.width = data[0];
    this.length = data[1];
    this.height = data[2];
  }

  public int getWidth() {
    return this.width;
  }

  public int getLength() {
    return this.length;
  }

  public int getHeight() {
    return this.height;
  }

  public int getVolume() {
    return width * length * height;
  }

  public int getSurfaceArea() {
    return (width * length * 2) + (width * height * 2) + (length * height * 2);
  }

}
