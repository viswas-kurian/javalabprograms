import java.util.Scanner;

public class Pgm9 {

    // Function to display the 4x4 puzzle grid
    public static void display(int[][] grid) {
        System.out.println("\nCurrent Puzzle:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grid[i][j] == 0)
                    System.out.print("_\t");
                else
                    System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Function to find the empty space (0)
    public static int[] findEmpty(int[][] grid) {
        int[] pos = new int[2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grid[i][j] == 0) {
                    pos[0] = i;
                    pos[1] = j;
                    return pos;
                }
            }
        }
        return pos;
    }

    // Function to slide tile into empty space
    public static void move(int[][] grid, int tile) {
        int er = -1, ec = -1;
        int tr = -1, tc = -1;

        // Find empty space and tile
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grid[i][j] == 0) {
                    er = i;
                    ec = j;
                }
                if (grid[i][j] == tile) {
                    tr = i;
                    tc = j;
                }
            }
        }

        // Check if tile is adjacent to empty space
        if ((Math.abs(er - tr) == 1 && ec == tc) || (Math.abs(ec - tc) == 1 && er == tr)) {
            // Swap
            grid[er][ec] = tile;
            grid[tr][tc] = 0;
        } else {
            System.out.println("Invalid move! Tile not adjacent to empty space.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial correct puzzle layout
        int[][] grid = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 0 }
        };

        while (true) {
            display(grid);

            System.out.print("\nEnter tile number to slide (0 to exit): ");
            int tile = sc.nextInt();

            if (tile == 0) {
                break;
            }

            if (tile < 1 || tile > 15) {
                System.out.println("Invalid tile!");
                continue;
            }

            move(grid, tile);
        }

        System.out.println("Exiting Puzzle.");
        sc.close();
    }
}
