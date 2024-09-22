
import java.util.Scanner;

public class kelipatan2 {
    public static void main(String[] args) {
        int bilanganAwal = 6;
        int bilanganAkhir = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan bilangan awal: ");
        bilanganAwal = input.nextInt();
        System.out.println("masukkan bilangan akhir: ");
        bilanganAkhir = input.nextInt();
        System.out.println("------------------------");

        while(bilanganAwal <= bilanganAkhir){
            System.out.println(bilanganAwal+",");
            bilanganAwal+=6;
        }
    }
    
}
