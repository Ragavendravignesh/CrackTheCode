import java.io.*;
import java.util.*;


public class C2_HashTable {
    public static void main(String args[]) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(0, "Jack");
        ht.put(1, "Joseph");
        ht.put(2, "Jill");

        for(Map.Entry<Integer, String> mp: ht.entrySet()) {
            System.out.println(mp.getKey()+ "-"+ mp.getValue());
        }
    }
}
