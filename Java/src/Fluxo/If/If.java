package Fluxo.If;

public class If {
    public static void main(String[] args) {
        float primeiraNota = 8.2f;
        float segundaNota = 7.4f;
        float terceiraNota = 9.1f;
        float media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media <= 5) {
            System.out.println("Reprovado");
        } else if (media == 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
        System.out.println(media);


        int hora = 5;
        String resultado = (hora > 12) ? "Boa tarde" : "Bom dia";
        System.out.println(resultado);
    }
}
