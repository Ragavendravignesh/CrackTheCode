import java.io.*;
import java.util.*;

class StringyBuild {
    public static void main(String args[]) {
        System.out.println("This will perform string concatenation");

        String InputStrings[] = {"Ragav", "Madhan", "Rahul"};
        String result = joinStrings(InputStrings);
        System.out.println("Result:"+ result);
    }   
    public static String joinStrings(String input[]) {
        StringBuilder st = new StringBuilder();

        for(String s: input) {
            st.append(s+ " ");
        } 

        return st.toString();
    }
}