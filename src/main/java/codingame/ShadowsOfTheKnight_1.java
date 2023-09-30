package codingame;

import java.util.Scanner;

public class ShadowsOfTheKnight_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int bottomIntervalX=0;
        int maxIntervalX=W-1;
        int bottomIntervalY=0;
        int maxIntervalY=H-1;

        System.err.println("Max turns : " + N);
        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            System.err.println(bombDir);
            switch(bombDir){
                case"D"-> bottomIntervalY = Y0 + 1;
                case"U"-> maxIntervalY= Y0-1;
                case"R"-> bottomIntervalX=X0+1;
                case"L"-> maxIntervalX=X0-1;
                case"UR"->{
                    maxIntervalY= Y0-1;
                    bottomIntervalX=X0+1;
                }
                case"UL"->{
                    maxIntervalY= Y0-1;
                    maxIntervalX=X0-1;
                }
                case"DR"->{
                    bottomIntervalY = Y0 + 1;
                    bottomIntervalX=X0+1;
                }
                case"DL"->{
                    bottomIntervalY = Y0 + 1;
                    maxIntervalX=X0-1;
                }
            }


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            Y0 = (bottomIntervalY+maxIntervalY)/2;
            X0 = (bottomIntervalX+maxIntervalX)/2;
            // the location of the next window Batman should jump to.
            System.out.println(X0+ " " + Y0);
        }
    }
}
