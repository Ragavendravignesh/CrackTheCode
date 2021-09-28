public class E3_Replace {
    public static void main(String args[]) {
        String input = "Mr John Smith     ";

        stringReverse(input.toCharArray(), 13);
    }

    public static void stringReverse(char[] arr, int length) {

        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] == ' ')
                spaceCount++;
        }

        System.out.println(spaceCount);

        int index = length + spaceCount * 2;

        System.out.println(index);
        
        if (length < arr.length) arr[length] = '\0';

        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                arr[index - 1] = '0';
                arr[index - 2] = '2';
                arr[index - 3] = '%';
                index = index - 3;
            } else {
                arr[index - 1] = arr[i];
                index = index - 1;
            }
        }
        System.out.println(arr);
    }
}
