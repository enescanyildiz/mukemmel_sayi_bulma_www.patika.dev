import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;
        for (int i = 0; i == i; i++) {


            System.out.print("Bir tam sayı giriniz: ");
            sayi = input.nextInt();


            for (int a = 1; a < sayi; a++) {
                if (sayi % a == 0) {
                    toplam = toplam + a; //toplam+=a;
                }
            }
            if (toplam == sayi) {
                System.out.println(sayi + " Mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }
        }
    }
}