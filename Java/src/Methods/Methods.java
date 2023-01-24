package Methods;

public class Methods {
    static void helloWorld() {
        System.out.println("Hello World!");
    }

    static void checkAge(int age) {
        if ( age < 18 ) {
            System.out.println("Menor de Idade");
        } else {
            System.out.println("Maior de Idade");
        }
    } 

    static int soma(int x, int y) {
        return x + y;
      }
    
      public static void main(String[] args) {
        int z = soma(5, 3);
        System.out.println(z);


        checkAge(56);
      }
}
