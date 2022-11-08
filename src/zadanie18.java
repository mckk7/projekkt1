public class zadanie18 {
    public static void main(String[] args) {
        double iloscakcji=600;
        double cenaakcji=21.77;

        double akcje=iloscakcji*cenaakcji;
        double prowizja=0.02*akcje;
        double calosc = akcje+prowizja;

        System.out.println("akcje: "+ akcje);
        System.out.println("Kwota prowizjii: "+prowizja);
        System.out.println("Kwota całości: " + calosc);


    }
}


