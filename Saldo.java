import java.util.Scanner;

public class Jumlah_Saldo{
    static int saldoAkhir;
    static void hitung(int a, int b){
        saldoAkhir = (a + (a*b/100));
    }

    public static void main(String[] args) {

        int saldoAwal;
        int bunga;
        int lamaMenabung;
        int banyakBulan;


        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan saldo awal= ");
        saldoAwal = in.nextInt();
        System.out.print("Masukkan bunga (dalam %)= ");
        bunga = in.nextInt();
        System.out.print("Masukkan lama menabung (dalam bulan)= ");
        banyakBulan = in.nextInt();

        for (lamaMenabung=1; lamaMenabung<=banyakBulan; lamaMenabung++) {
            hitung(saldoAwal,bunga);
            System.out.println("Bulan ke "+lamaMenabung);
            System.out.println("Saldo awal= "+saldoAwal);
            System.out.println("Bunga= "+bunga+"% per bulan, jadi bunga yang anda dapat= "+saldoAwal*bunga/100);
            System.out.println("Saldo akhir anda adalah= "+saldoAkhir);
            saldoAwal = saldoAkhir;
        }
    }
}