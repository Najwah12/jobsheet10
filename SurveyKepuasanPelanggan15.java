import java.util.Scanner;
public class SurveyKepuasanPelanggan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahResponden = 10; 
        int jumlahPertanyaan = 6; 
        int[][] hasilSurvei = new int[jumlahResponden][jumlahPertanyaan];

        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Input hasil survei untuk responden ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                do {
                    System.out.print("Pertanyaan " + (j + 1) + " (nilai 1-5): ");
                    hasilSurvei[i][j] = sc.nextInt();
                } while (hasilSurvei[i][j] < 1 || hasilSurvei[i][j] > 5);
            }
        }
        System.out.println("\nRata-rata nilai untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalPerResponden += hasilSurvei[i][j];
            }
            double rataRataResponden = totalPerResponden / jumlahPertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rataRataResponden);
        }
        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPerPertanyaan += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = totalPerPertanyaan / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }
        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata nilai secara keseluruhan: " + rataRataKeseluruhan);

        sc.close();
    }
}
