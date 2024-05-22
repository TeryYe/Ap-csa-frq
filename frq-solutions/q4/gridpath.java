import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
 public Location getNextLoc(int row, int col) {
   Location belowLoc = new Location(row + 1, col);
   Location rightLoc = new Location(row, col + 1);

   if(row == grid.length - 1)
       return rightLoc;

   if(col == grid[0].length - 1)
       return belowLoc;

   if(grid[row + 1][col] < grid[row][col + 1])
       return belowLoc;
   else
       return rightLoc;

 }

  
  // PART B
    public int sumPath(int row, int col) {
        int sum = grid[row][col];
        Location loc = getNextLoc(row, col);
        while(loc != null){
            sum += grid[loc.getRow()][loc.getCol()];
            if(loc.getRow() < grid.length - 1 ||
                    loc.getCol() < grid[0].length - 1)
                loc = getNextLoc(loc.getRow(), loc.getCol());
            else
                loc = null;
        }
      return sum;
    }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
