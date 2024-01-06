import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Minta pengguna memasukkan daftar angka yang dipisahkan oleh spasi
            System.out.print("Masukkan daftar angka (pisahkan dengan spasi): ");
            String input = scanner.nextLine();

            // Pisahkan string input menjadi array string
            String[] angkaStr = input.split(" ");

            // Jika tidak ada angka yang dimasukkan, tampilkan pesan kesalahan
            if (angkaStr.length == 0) {
                throw new IllegalArgumentException("Tidak ada angka yang dimasukkan");
            }

            // Inisialisasi variabel untuk menghitung total dan jumlah angka
            double total = 0;
            int jumlahAngka = 0;

            // Lakukan iterasi melalui array angkaStr
            for (String angka : angkaStr) {
                try {
                    // Konversi string menjadi double
                    double nilaiAngka = Double.parseDouble(angka);
                    total += nilaiAngka;
                    jumlahAngka++;
                } catch (NumberFormatException e) {
                    System.out.println("Kesalahan: Masukkan bukan angka yang valid - " + angka);
                }
            }

            // Jika tidak ada angka yang valid, tampilkan pesan kesalahan
            if (jumlahAngka == 0) {
                throw new IllegalArgumentException("Tidak ada angka yang valid untuk dihitung rata-ratanya");
            }

            // Hitung rata-rata
            double rataRata = total / jumlahAngka;
            System.out.println("Rata-rata dari angka-angka tersebut adalah: " + rataRata);
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan: Pembagian oleh nol");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan yang tidak terduga: " + e.getMessage());
        }
}
}
