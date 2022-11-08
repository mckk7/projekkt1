import java.util.Scanner;
public class zadanie21{
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        Double kwota;

        System.out.println("wplacasz: ");
        kwota = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double oprocentowanie1;


        System.out.println("oprocontewanie: ");

        oprocentowanie1 = klawiatura.nextDouble();

        klawiatura.nextLine();

        double oprocentowanie;

        oprocentowanie = oprocentowanie1/100;

        Double liczbaodsetek;

        System.out.println("odsetki w ciagu roku: ");

        liczbaodsetek = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double lata;
        System.out.println("liczba lat: ");
        lata = klawiatura.nextDouble();
        klawiatura.nextLine();

        double nt = lata * liczbaodsetek;

        double potega = Math.pow(1 + oprocentowanie / lata, nt);

        double wynik;
        wynik = kwota * potega;

        System.out.println("zdeponowana: " + kwota);

        System.out.println("oprocentowanie: " + oprocentowanie);

        System.out.println("odsetki w ciagu roku: " + liczbaodsetek);

        System.out.println("przez ile lat: " + kwota);

        System.out.println("kwota po latach: " + wynik);
    };
};