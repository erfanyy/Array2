import java.util.Scanner;

public class BioskopWithMenu14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, next;
        
        String[][] penonton = new String[4][2];

        do {
            System.out.println("Menu:");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        while (true) {
                            
                            while (true) {
                                System.out.print("Masukkan Baris (1-4): ");
                                baris = sc.nextInt();
                                if (baris < 1 || baris > 4) {
                                    System.out.println("Nomor baris tidak tersedia. Silakan masukkan nomor baris antara 1 dan 4.");
                                } else {
                                    break;
                                }
                            }

                            
                            while (true) {
                                System.out.print("Masukkan Kolom (1-2): ");
                                kolom = sc.nextInt();
                                if (kolom < 1 || kolom > 2) {
                                    System.out.println("Nomor kolom tidak tersedia. Silakan masukkan nomor kolom antara 1 dan 2.");
                                } else {
                                    break;
                                }
                            }

                            sc.nextLine(); 

                            
                            if (penonton[baris-1][kolom-1] != null) {
                                System.out.println("Kursi pada baris " + baris + " dan kolom " + kolom + " sudah terisi. Silakan pilih kursi lain.");
                            } else {
                                break;
                            }
                        }

                        penonton[baris-1][kolom-1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("Baris %d, Kolom %d: %s\n", i+1, j+1, penonton[i][j]);
                            } else {
                                System.out.printf("Baris %d, Kolom %d: ***\n", i+1, j+1);
                            }
                        }
                    }
                    break;
                case 3:
                    
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);

        sc.close();
    }
}
