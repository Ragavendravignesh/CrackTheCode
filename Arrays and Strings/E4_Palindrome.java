import java.io.*;
import java.util.*;

public class E4_Palindrome {
    public static void main(String[] args) {
        String input = "tact coa";
        int letters [] = new int[128];

        for(int i = 0; i < input.length(); i++) {
            char val = input.charAt(i);

            letters[val]++;
        }

        System.out.println(checkPalindrome(letters));
    }

    public static boolean checkPalindrome(int[] letters) {
        for(int i = 0; i < letters.length; i++ ){
            boolean oddCount = false;

            if(letters[i] % 2 == 0) {

                if(oddCount) {
                    return false;
                }

                oddCount = true;
            }
        }
        return true;
    }
}
