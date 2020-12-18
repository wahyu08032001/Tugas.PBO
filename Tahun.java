package Tahun;
import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Tahun;
        System.out.println("Masukan Tahun   : ");
        Tahun= input.nextInt();
        boolean TahunKabisat = (Tahun%4==0 ||Tahun % 400 == 0) && (Tahun % 100 != 0);
        String cekTahun;
        if (TahunKabisat == true)
            cekTahun = "Iya";
        else
            cekTahun = "Bukan";
        System.out.print(Tahun + " adalah tahun kabisat? " + cekTahun);

    }
}