import java.util.Scanner;

public class RataNilai15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        
        int j,i,nilaiMhs;
        float nilai, totalNilai = 0, rataNilai;

        for(i=1; i<=5; i++){
            System.out.println("Input Nilai Mahasiswa ke " +  i);
            totalNilai = 0;
            for(j=1; j<=5; j++) {
                System.out.print("Nilai ke-" +j + " = ");
                nilaiMhs = util.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("Rata-rata nilai Mahasiswa ke " + i + " adalah " + rataNilai);
        }
    }
}
