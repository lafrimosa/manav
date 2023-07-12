import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner tutu = new Scanner(System.in);
        System.out.println(" kaç kilo patlıcan aldınız? ");
       int patlican = tutu.nextInt();

        System.out.println(" kaç kilo muz aldınız? ");
       double muz = tutu.nextDouble();

        System.out.println(" kaç kilo domates aldınız? ");
        double domates = tutu.nextDouble();

        System.out.println(" kaç kilo elma aldınız? ");
        double elma = tutu.nextDouble();

        System.out.println(" kaç kilo armut aldınız? ");
        double armut = tutu.nextDouble();

        double fatura = ((armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95 )+ (patlican * 5.00));
        System.out.print(" faturanız: " + fatura + "TL");

    }
}