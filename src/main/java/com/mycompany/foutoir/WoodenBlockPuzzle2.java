package com.mycompany.foutoir;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class WoodenBlockPuzzle2 {
    public static void main(String[] args) {

        String[] grid = {"XXX","X00","XXX"};
        String[] grid1 = {"XXX","X01","XXX"};
        String[] grid2 = {"XXXX","X011", "X010","XXXX"};
        String[] grid3 = {"XXXX","X01.", "X01.","XXXX"};
        String[] grid4 = {"XXXX","X011", "X01X","XXXX"};
        String[] grid5 = {"XXXXXXXXXXX","X53460000..","X53460111..","X5346612222","X53447668889","X5557778999","XXXXXXXXXXX"};
        String[] grid6 = {"XXXXXXXXXXX","X53460000..","X53460111..","X534661....","X53447668889","X5557778999","XXXXXXXXXXX"};
        String[] grid7 = {"XXXXXXXXXXX","X53460000..","X53460.....","X53466.....","X53447668889","X5557778999","XXXXXXXXXXX"};
        String[] grid8 = {"XXXXXXXXXXX","X5346......","X5346......","X53466.....","X53447668889","X5557778999","XXXXXXXXXXX"};
        String[] grid9 = {"XXXXXXXXXXX","X5346......","X5346......","X53466.....","X5344766888.","X5557778...","XXXXXXXXXXX"};
        String[] grid10 = {"XXXXXXXXXXX","X5346......","X5346......","X53466.....","X5344766....","X555777....","XXXXXXXXXXX"};
        String[] grid11 = {"XXXXXXXXXXX","X534.......","X534.......","X534.......","X53447......","X555777....","XXXXXXXXXXX"};
        String[] grid12 = {"XXXXXXXXXXX","X534.......","X534.......","X534.......","X5344.......","X555.......","XXXXXXXXXXX"};
        String[] grid13 = {"XXXXXXXXXXX","X53........","X53........","X53........","X53.........","X555.......","XXXXXXXXXXX"};
        String[] grid14 = {"XXXXXXXXXXX","X5.........","X5.........","X5.........","X5..........","X555.......","XXXXXXXXXXX"};

//        System.out.println(solve(3, 3, 1, grid));//Should return 0
//        System.out.println(solve(3, 3, 2, grid1));//return 1
//        System.out.println(solve(4, 4, 2, grid2));//return -1
//        System.out.println(solve(4, 4, 2, grid3));//return 1
//        System.out.println(solve(4, 4, 2, grid4));//return -1
        System.out.println(solve(11, 7, 10, grid5));//return 2
        System.out.println(solve(11, 7, 10, grid6));//return 1
        System.out.println(solve(11, 7, 10, grid7));//return 0
        System.out.println(solve(11, 7, 10, grid8));//return 9
        System.out.println(solve(11, 7, 10, grid9));//return 8
        System.out.println(solve(11, 7, 10, grid10));//return 6
        System.out.println(solve(11, 7, 10, grid11));//return 7
        System.out.println(solve(11, 7, 10, grid12));//return 4
        System.out.println(solve(11, 7, 10, grid13));//return 3
        System.out.println(solve(11, 7, 10, grid14));//return 5


    }

    public static int solve(int width, int height, int nbBlocks, String[] grid) {
        // Convert the grid into a 2D char array
        char[][] puzzle = new char[height][width];
        for (int i = 0; i < height; i++) {
            puzzle[i] = grid[i].toCharArray();
        }

        // List to store the possible moves
        List<Integer> possibleMoves = new ArrayList<>();

        // Iterate through each block to find possible moves
        for (int blockNumber = 0; blockNumber < nbBlocks; blockNumber++) {
            // Check if the current block can be moved to the right on any row
            boolean canMoveRight = true;
            boolean foundNumber = false;

            // Iterate through the grid to find the current block
            for (int row = 1; row < height-1; row++) {
                for (int col = 0; col < width; col++) {
                    if (puzzle[row][col] == (char) ('0' + blockNumber)) {
                        foundNumber = true;
                        // Check if moving right is possible for this block on this row
                        if (!canMoveRight(row, col, puzzle, blockNumber)) {
                            canMoveRight = false; // Can move right on at least one row
                            break;
                        }
                    }
                }
                if (!canMoveRight) {
                    break; // If we can't move right on one row, no need to check other rows
                }
            }
            if (canMoveRight && foundNumber) {
                possibleMoves.add(blockNumber);
            }
        }

        // If there are possible moves, choose the first one; otherwise, return -1 (defeat)
        if (!possibleMoves.isEmpty()) {
            return possibleMoves.get(0);
        } else {
            return -1; // No possible moves, the game is lost
        }
    }

    // Helper function to check if a block can be moved to the right on a specific row
    private static boolean canMoveRight(int row, int col, char[][] puzzle, int blockNumber) {
        int width = puzzle[0].length;

        // Check if the block is already touching the right border
        if (col == width - 1) {
            return true;
        }

        // Check if there are only empty spaces ('.') or blocks with the same number to the right
        for (int i = col + 1; i < width; i++) {
            if (puzzle[row][i] == 'X' || (puzzle[row][i]) != '0' + blockNumber && (puzzle[row][i]) != '.') {
                return false; // Blocked by a wall or another block
            }
        }
        return true; // Can move right if it's the same block number or '.'
    }
}
