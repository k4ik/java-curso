package Array;

public class Array {
    public static void main(String[] args) {
        char[] letras = {'A', 'B', 'C'};
        /*System.out.println(letras[0]);
        System.out.println(letras);
        System.out.println(letras.length);*/

        for(int x = 0; x < letras.length; x++){
            System.out.println(letras[x]);
        }

        for (char i : letras) {
            System.out.println(i);
          }
                  
        // Multidimensional Arrays
        int[][] myNumbers = {{1,2,3,4,5}, {6,7,8}};
        System.out.println(myNumbers[1][2]);
    }
}
