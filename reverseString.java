package BTArray;

public class reverseString {
    public static void main(String[] args) {
        reverseString("hello my friend");
    }
    public static void reverseString(String input){
        String rev = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
            rev = rev + input.charAt(i);
        }
        System.out.println(rev);
    }

}
