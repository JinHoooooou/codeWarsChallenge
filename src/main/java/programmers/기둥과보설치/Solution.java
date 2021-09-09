package programmers.기둥과보설치;

public class Solution {

  static final int CONSTRUCT = 1;
  static final int REMOVE = 0;
  static final int PILLAR = 0;
  static final int BEAM = 1;

  boolean[][] pillarTable;
  boolean[][] beamTable;

  public int[][] solution(int n, int[][] build_frame) {

    pillarTable = new boolean[n + 3][n + 3];
    beamTable = new boolean[n + 3][n + 3];
    int structureCount = 0;

    for (int[] buildData : build_frame) {
      int x = buildData[0] + 1;
      int y = buildData[1] + 1;
      int buildType = buildData[2];
      int operation = buildData[3];

      if (operation == CONSTRUCT) {
        if (buildType == PILLAR && canConstructPillar(x, y)) {
          pillarTable[x][y] = true;
          structureCount++;
        }
        if (buildType == BEAM && canConstructBeam(x, y)) {
          beamTable[x][y] = true;
          structureCount++;
        }
      } else if (operation == REMOVE) {
        if (buildType == PILLAR) {
          pillarTable[x][y] = false;
        } else if (buildType == BEAM) {
          beamTable[x][y] = false;
        }

        if (canDestruct(x, y, buildType, n)) {
          structureCount--;
          continue;
        }

        if (buildType == PILLAR) {
          pillarTable[x][y] = true;
        } else if (buildType == BEAM) {
          beamTable[x][y] = true;
        }
      }
    }

    int[][] result = new int[structureCount][3];
    int index = 0;

    for (int i = 1; i <= n + 1; i++) {
      for (int j = 1; j <= n + 1; j++) {
        if (pillarTable[i][j]) {
          result[index++] = new int[]{i - 1, j - 1, PILLAR};
        }
        if (beamTable[i][j]) {
          result[index++] = new int[]{i - 1, j - 1, BEAM};
        }
      }
    }
    return result;
  }

  private boolean canDestruct(int x, int y, int buildType, int n) {
    for (int i = 1; i <= n + 1; i++) {
      for (int j = 1; j <= n + 1; j++) {
        if (pillarTable[i][j] && !canConstructPillar(i, j)) {
          return false;
        }
        if (beamTable[i][j] && !canConstructBeam(i, j)) {
          return false;
        }
      }
    }

    return true;
  }

  private boolean canConstructBeam(int x, int y) {
    return pillarTable[x][y - 1]
        || pillarTable[x + 1][y - 1]
        || (beamTable[x - 1][y] && beamTable[x + 1][y]);
  }

  private boolean canConstructPillar(int x, int y) {
    return y == 1 || pillarTable[x][y - 1] || beamTable[x][y] || beamTable[x - 1][y];
  }
}