import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1: 
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris dan kolom harus dalam rentang yang valid.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Tempat sudah terisi, silakan pilih tempat lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan.");
                    }
                    break;

                case 2: 
                    System.out.println("\n=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                String status = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": Kosong");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}