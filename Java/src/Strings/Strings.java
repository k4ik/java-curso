package Strings;

public class Strings {
    public static void main(String[] args) {
        // String Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());

        // toUpperCase toLowerCase
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        // IndexOf
        String txt3 = "Start where you are. Use what you have. Do what you can.";
        System.out.println(txt3.indexOf("Use"));

        // charAt
        String txt4 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(txt4.charAt(11));


        // String Concatenation
        String firstName = "Roberto";
        String lastName = "Alvez";
        System.out.println(firstName.concat(lastName));
    }
}
