import java.util.*;
import java.io.*;

public class C1_Arrays {
    public static void main(String args[]) {
        int numbers[] =  new int[10];
        System.out.println("Enter array elements:");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< numbers.length; i++ ){
            numbers[i] = sc.nextInt();
        }
        System.out.println("This is the array elements you have entered:");
        for(int number: numbers) {
            System.out.print(number+ " ");
        }
        System.out.println("");

        System.out.println("Initialised Array");
        //Initialised array
        String names[] = {"Ragav", "Madhan", "Gopal"};
        for(String name: names) {
            System.out.println("Name: "+ name);
        }


        //Dynamic array
        ArrayList<Integer> dynamicArray = new ArrayList<Integer>();

        dynamicArray.add(1);
        dynamicArray.add(4);
        dynamicArray.add(3);
        dynamicArray.add(2);

        Collections.sort(dynamicArray);
        System.out.println("Sorted array:");
        for(Integer number: dynamicArray) {
            System.out.print(number+ " ");
        }
    }
}
