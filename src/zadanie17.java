import java.util.Scanner;
public class zadanie17{
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        Double cena;

        System.out.println("Cena posiłku: ");
        cena = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double podatek;
        podatek = 0.0675*cena;
        Double napiwek;
        napiwek = 0.20*(cena+podatek);
        Double laczna;
        laczna = cena+podatek+napiwek;

        System.out.println("cena posiłku: " +  cena);
        System.out.println("podatek: " +  podatek);
        System.out.println("napiwek " +  napiwek);
        System.out.println("laczna kwota " +  laczna);
    }
}