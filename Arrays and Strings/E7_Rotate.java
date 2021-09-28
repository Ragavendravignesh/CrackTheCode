import java.util.*;
import java.io.*;

public class E7_Rotate {
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        int rotatedMatrix[][] = rotate(matrix);

        for(int i=0; i < rotatedMatrix.length; i++ ) {
            for(int j= 0; j < rotatedMatrix.length; j++ ) {
                System.out.print(rotatedMatrix[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    public static int[][] rotate(int[][] mat) {
        int n = mat.length;
        for(int layer = 0 ; layer < n/2; layer++) {
            int first = layer;
            int last = n- 1 - layer;

            for(int i = first; i< last; i++) {
                int offset = i - first;
                int top = mat[first][i];

                mat[first][i] = mat[last-offset][first];

                mat[last-offset][first] = mat[last][last-offset];

                mat[last][last-offset] = mat[i][last];

                mat[i][last] = top;
            }
        }
        return mat;
    }
}
