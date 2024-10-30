import java.util.Scanner;

/**
 * Program Kalkulator Sederhana yang dapat melakukan operasi penjumlahan,
 * pengurangan, perkalian, dan pembagian antara dua angka.
 */
class KalkulatorSederhana {

    /**
     * Metode utama untuk menjalankan program kalkulator sederhana.
     * Mengambil input angka pertama, operator, dan angka kedua dari pengguna,
     * serta menampilkan hasil operasi.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Masukkan angka pertama: ");
        num1 = input.nextDouble();

        System.out.println("Masukkan operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.println("Masukkan angka kedua: ");
        num2 = input.nextDouble();

        if (!isValidOperator(operator)) {
            System.out.println("Operator tidak valid!");
            return;
        }

        if (operator == '/' && num2 == 0) {
            System.out.println("Error: Pembagi tidak boleh nol.");
            return;
        }

        double hasil = hitung(num1, num2, operator);
        System.out.println("Hasil: " + hasil);
    }

    /**
     * Melakukan operasi perhitungan berdasarkan operator yang dipilih.
     *
     * @param num1     angka pertama
     * @param num2     angka kedua
     * @param operator operator yang dipilih oleh pengguna
     * @return hasil dari operasi yang dilakukan
     */
    public static double hitung(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }

    /**
     * Memvalidasi apakah operator yang dimasukkan oleh pengguna adalah valid.
     *
     * @param operator operator yang dimasukkan oleh pengguna
     * @return true jika operator valid, false jika tidak
     */
    public static boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }
}
