import java.util.Scanner;

public class PersegiAngka15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N (minimal 3)");
        int N = util.nextInt();

        // Validasi input N
        if (N < 3){
            System.out.println("N harus minimal 3.");
            return;
        }
        // Mencetak persegi dengan angka di tepi
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
