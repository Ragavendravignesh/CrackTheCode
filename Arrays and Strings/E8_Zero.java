public class E8_Zero {
    public static void main(String args[]) {
        int Array[][] = { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        int zeroArray[][] = makeZero(Array);
        for (int i = 0; i < zeroArray.length; i++) {
            for (int j = 0; j < zeroArray.length; j++) {
                System.out.print(zeroArray[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] makeZero(int[][] arr) {
        boolean rows[] = new boolean[arr.length];
        boolean cols[] = new boolean[arr[0].length];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for(int k = 0; k < rows.length; k++) {
            if(rows[k]) nullifyRows(arr, k); 
        }

        for(int j = 0; j < cols.length; j++) {
            if(cols[j]) nullifyCols(arr, j); 
            }
            return arr;
        }

        static void nullifyRows(int[][] arr, int row) {
            for(int i =0 ; i < arr.length; i++) {
                arr[row][i] = 0;
            }
        }

        static void nullifyCols(int[][] arr, int col) {
            for(int i =0 ; i < arr.length; i++) {
                arr[i][col] = 0;
            }
        }
}
