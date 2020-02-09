package onlineCaveOfProgramming;

public class Cave_16_Multi_Dimensional_Arrays {
    public static void main(String[] args) {

        int [] values = {3, 5, 2343};
        System.out.println(values[2]);

        int[][] grid = {
                {3, 5, 2343},
                {2, 4},
                {1, 2, 3, 4}
        };
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);
        System.out.println(grid[2][3]);

        String[][] text = new String[2][3];

        text [0][1] = "Hello there";
        System.out.println(text[0][1]);

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

        // will give null since column is empty
        String[][]words = new String[2][];
        System.out.println(words[0]);

        words[0] = new String[3];

        words[0][1] = "hi there";
        System.out.println(words[0][1]);
    }
}
