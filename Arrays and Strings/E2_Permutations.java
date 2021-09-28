import java.io.*;
import java.util.*;

public class E2_Permutations {
    public static void main(String args[]) {
        String input1 =  "Hunnd";
        String input2 =  "dnnuH";

        System.out.println(checkPermutation(input1, input2));
    }

    public static boolean checkPermutation(String input1, String input2) {
       if(input1.length() != input2.length()) return false;

       int letters[] = new int[128];

       for(int i = 0; i < input1.length(); i++) {
           letters[input1.charAt(i)]++;
       }

       for(int i = 0; i < input2.length(); i++ ) {
           letters[input2.charAt(i)]--;

           if(letters[input2.charAt(i)] < 0)
                return false;
       }

       return true;
    }
}
