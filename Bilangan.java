package bilangan;
import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        System.out.println("Masukan Bilangan : ");
        bil=input.nextInt();

        if (bil%2 ==0){
            System.out.println("Bilangan  " + bil + "  adalah Bilangan Genap");
        }else {
            System.out.println("Bilangan  " + bil + "  adalah bilangan Ganjil");
        }


    }
}
