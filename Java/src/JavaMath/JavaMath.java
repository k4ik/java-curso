public class JavaMath {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));

        int raizQ = 121;
        System.out.println(Math.sqrt(raizQ)); 

        System.out.println(Math.abs(-6));

        int randomNum = (int)(Math.random() * 11);
        System.out.println(randomNum);
    }
} 
