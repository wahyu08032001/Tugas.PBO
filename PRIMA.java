package BilanganPrima;
import java.util.Scanner;

public class BilPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Masukan Bilangan  :");
        angka= input.nextInt();
        int hitung;
        boolean prima = true;


        for(int pembagi = 2; pembagi <= angka / 2; pembagi++){

            hitung = angka % pembagi;

            if(hitung == 0){

                prima = false;
                break;

            }

        }
        if(prima && ((angka > 0)&&(angka != 1)))
            System.out.println(angka + " adalah bilangan prima");
        else
            System.out.println(angka + " bukanlah bilangan prima");

    }
}