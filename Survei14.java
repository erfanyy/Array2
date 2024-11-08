import java.util.Scanner;
public class Survei14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukan hasil survei untuk responden ke-" + (i+1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan ke-" + (j+1) + ": ");
                hasilSurvei[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rata rata nilai per responden:");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += hasilSurvei[i][j];
            }
            double rataRata = (double) total / 6;
            System.out.println("Responden ke-" + (i+1) + ": " + rataRata);
        }
        System.out.println("Rata rata nilai per pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += hasilSurvei[i][j];
            }
            double rataRata = (double) total / 10;
            System.out.println("Pertanyaan ke-" +(j+1)+ ": " + rataRata);
        }
        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalKeseluruhan / (10 * 6);
        System.out.println("Rata rata nilai keseluruhan: " + rataRataKeseluruhan);
    }
}