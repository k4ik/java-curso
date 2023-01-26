package Loop.Continue;

public class Continue {
    public static void main(String[] args) {
        for (int x = 0; x < 11; x++) {
            if(x == 4){
                continue;
            }
            System.out.println(x);
        }
    }
}
