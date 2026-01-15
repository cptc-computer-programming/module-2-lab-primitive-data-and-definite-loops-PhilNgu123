package day2.part03_pattern_section;

public class PatternSection {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        // TODO: Call each method below in this order:
        // printEdge();
        // printDiamondTop();
        // printDiamondBottom();
        // printEdge();
        printEdge();
        printDiamondTop();
        printDiamondBottom();
        printEdge();

    }

    // TODO: Print the edge line that fits the width for SIZE.
    // Format: + followed by repeating "=*" and ending with +
    // Example for SIZE=2: +=*=*=*=*+
    public static void printEdge() {
        // Print a +
        System.out.print("+");
        // write a loop to print =* a variable number of times
        for (int n = 0; n < SIZE * 2; n ++) {
            System.out.print("=*");
        }
        // print a
        System.out.println("+");
    }

    // TODO: Print the top half of the “double-diamond” section.
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots decrease while "/\" pairs increase, then dots again
    // - use SIZE in all loop bounds (no magic numbers except 0/1)
    public static void printDiamondTop() {

        for(int row = 0; row < SIZE * 2; row ++) {
            System.out.print("|");

            int dots = (SIZE * 2 - 1) - row;
            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            int triangles = row + 1; 
            for(int i = 0; i < triangles; i ++){
                System.out.print("/\\");
            }

            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            

            System.out.println("|");
        }
    }

    // TODO: Print the bottom half (mirror/inverse of the top half).
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots increase while "\/" pairs decrease, then dots again
    // - use SIZE in all loop bounds
    public static void printDiamondBottom() {
        for(int row = 0; row < SIZE * 2; row ++) {
            System.out.print("|");
        
            int dots = row;
            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            int triangles = SIZE * 2 - row; 
            for(int i = 0; i < triangles; i ++){
                System.out.print("\\/");
            }

            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            

            System.out.println("|");
        }


    }
    
}

/* 

+=*=*=*=*=*=*+
|...../\.....|
|..../\/\....|
|.../\/\/\...|
|../\/\/\/\..|
|./\/\/\/\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/\/\/\/.|
|..\/\/\/\/..|
|...\/\/\/...|
|....\/\/....|
|.....\/.....|
+=*=*=*=*=*=*+

*/