import java.util.Scanner;

public class PorseniAtlet15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Politeknik yang mendaftar: ");
        int jumlahPoliteknik = util.nextInt();
        util.nextLine();

        final int jumlahAtletPerCabor = 5;
        final int jumlahCabor = 4;

        String[] namaPoliteknik= new String[jumlahPoliteknik];
        String[][][] atlet = new String[jumlahPoliteknik][jumlahCabor][jumlahAtletPerCabor];

        String[] namaCabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.print("Masukkan nama Politeknik " + (i + 1) + ": ");
            namaPoliteknik[i] = util.nextLine();
        }

        for (int i = 0; i < jumlahPoliteknik; i++){
            System.out.println("Politeknik " + namaPoliteknik[i] + ":");
            for (int j = 0; j < jumlahCabor; j++) {
                System.out.println("Masukkan nama " + jumlahAtletPerCabor + " atlek untuk " + namaCabor[j]+ ":");
                for (int k = 0; k < jumlahAtletPerCabor; k++) {
                    System.out.print("Atlet " + (k + 1) + ": ");
                    atlet[i][j][k] = util.nextLine();
                }
            }
        }
    }
}
