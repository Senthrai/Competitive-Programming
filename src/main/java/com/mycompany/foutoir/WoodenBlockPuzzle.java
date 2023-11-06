package com.mycompany.foutoir;

import java.util.ArrayList;
import java.util.List;


public class WoodenBlockPuzzle {
    public static void main(String[] args) {
        String[] grid = {"XXX","X01","XXX"};
        System.out.println(Solve(3, 3, 2, grid));

        String[] grid1 = {"XXX","X0.","XXX"};
        System.out.println(Solve(3, 3, 2, grid1));
    }

    public static int Solve(int width, int height, int nbBlocks, String[] grid) {
        // Convert the grid into a 2D char array
        char[][] puzzle = new char[height][width];
        for (int i = 0; i < height; i++) {
            puzzle[i] = grid[i].toCharArray();
        }

        // List to store the possible moves
        List<Integer> possibleMoves = new ArrayList<>();

        // Iterate through each block to find possible moves
        for (int blockNumber = 0; blockNumber < nbBlocks; blockNumber++) {
            // Check if the current block can be moved to the right on every row
            boolean canMoveRight = true;

            // Iterate through the grid to find the current block
            for (int row = 0; row < height; row++) {
                boolean blockFound = false; // Track if the block is found on this row
                for (int col = 0; col < width; col++) {
                    if (puzzle[row][col] == (char) ('0' + blockNumber)) {
                        blockFound = true;

                        // Check if moving right is possible for this block on this row
                        if (!canMoveRight(row, col, puzzle)) {
                            canMoveRight = false; // Cannot move right on this row
                            break;
                        }
                    }
                }

                if (!blockFound) {
                    // The block is not on this row, so we skip checking this row
                    continue;
                }
            }

            if (canMoveRight) {
                possibleMoves.add(blockNumber);
            }
        }

        // If there are possible moves, choose the first one; otherwise, return -1 (defeat)
        if (!possibleMoves.isEmpty()) {
            return possibleMoves.get(0);
        } else {
            return -1;
        }
    }

    // Helper function to check if a block can be moved to the right on a specific row
    // Helper function to check if a block can be moved to the right on a specific row
    private static boolean canMoveRight(int row, int col, char[][] puzzle) {
        int width = puzzle[0].length;

        // Check if the block is already touching the border
        if (col == width - 1) {
            return true;
        }

        // Check if there are only empty spaces ('.') between the block and the border
        for (int i = col + 1; i < width; i++) {
            if (puzzle[row][i] == 'X' || (puzzle[row][i] >= '0' && puzzle[row][i] <= '9')) {
                return false; // Blocked by a wall or another block
            }
        }

        return true;
    }
}