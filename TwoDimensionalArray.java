public class TwoDimensionalArray {
    public static void main(String[] args) {

        String[][] table = new String[11][5];
        // int[][] table = {
        //     { 3, 4, 2, 5, 12 },
        //     { 8, 11, 23, 2, 3 },
        //     { 20, 1, 19, 7, 6 },
        //     { 15, 10, 6, 17, 3 }
        // };
        
        for (int row = 1; row <= 10; row++) {

            for (int col = 1; col <= 4; col++) {
                table[row][col] = "hello";
                System.out.print(table[row][col] + "\t");
            }
            
            System.out.println();
        }
    }
}
