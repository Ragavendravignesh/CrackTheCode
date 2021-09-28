import java.io.*;
import java.util.*;

public class E6_Compression {
    public static void main(String args[]) {
        String input = "aabcccccaaaa";
        String output = "";

        int count = 0;
        for(int i = 0; i < input.length()-1; i++) { 
            count++;
            if(input.charAt(i) != input.charAt(i+1) || i == input.length() -2) {
                output+=input.charAt(i)+""+count;
                count= 0;
            }    
        }

        System.out.println(output);
    }
}
