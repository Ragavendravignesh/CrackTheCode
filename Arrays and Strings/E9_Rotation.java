import java.util.*;

public class E9_Rotation {
    public static void main(String args[]) {
        String input1 = "waterbottle";
        String input2 = "erbottlewat";

        String newString = "";
        if(input1.length() == input2.length()) {
            newString = input1 + input1;
        }

        System.out.println(newString.contains(input2));
    }
}
