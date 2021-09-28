import java.util.*;
import java.io.*;

class Unique {
    public static void main(String args[]) {
        String uniqueString = "orange";

        System.out.println("Unique:" + checkUnique(uniqueString));
    }

    public static boolean checkUnique(String input) {
        if (input.length() > 128)
            return false;

        boolean char_set[] = new boolean[128];

        for (int i = 0; i < input.length(); i++) {
            char val = input.charAt(i);
            if (char_set[val])
                return false;
            char_set[val] = true;
        }

        return true;
    }
}
