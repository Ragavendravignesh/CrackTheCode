public class E5_Oneaway {
    public static void main(String args[]) {
        String input1 = "pale";
        String input2 = "ple";

        if(input1.length() == input2.length()) 
            System.out.println(replaceString(input1, input2));
        if(input1.length() < input2.length()) 
            System.out.println(insertString(input1,input2));    
        if(input1.length() > input2.length())
            System.out.println(insertString(input2, input1));
    }

    public static boolean replaceString(String input1, String input2) {
        boolean replaceFound = false;

        for(int i =0; i < input1.length(); i++) {
            if(input1.charAt(i) != input2.charAt(i)) {
                if(replaceFound)
                    return false;
                
                replaceFound = true;
            }
        }
        return true;
    }

    public static boolean insertString(String value1, String value2) {
        int index1 = 0, index2= 0;

        while(index1 < value1.length() && index2 < value2.length()) {
            if(value1.charAt(index1) != value2.charAt(index2)) {
                if(index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}
