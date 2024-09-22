
import java.util.Scanner;

public class ratarataNilai {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("jumlah siswa: ");
        int jumlahSiswa = r.nextInt();
        double totalNilai =0;

        for (int i = 1; i <= jumlahSiswa; i++){
            System.out.println("masukkan nilai siswa ke-" + i + ": ");
            double nilai = r.nextDouble();
            totalNilai += nilai;
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("rata rata nilai dari " + jumlahSiswa + "siswa adalah: " + rataRata );
    }
    
}
