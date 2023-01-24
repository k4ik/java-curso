package Loop.While;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while ( i < 11 ) {
            System.out.println(i * 2);
            i++;
        }

        int x = 0;
        do {
            System.out.println(x);
            x++;
        }
        while(x < 11);
    }
}
