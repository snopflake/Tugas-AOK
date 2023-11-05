import java.util.Scanner;

    //Nama  : Nofa Nisrina Salsabila
    //NIM   : 235150700111005
    //Prodi : Teknologi Informasi (A)

    //Program Konversi Bilangan
    //Arsitektur dan Organisasi Komputer (AOK)

public class Konversi_Bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM KONVERSI BILANGAN");
        System.out.println("-----------------------------");

        System.out.println("Pilih operasi konversi:");
        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Heksadesimal");
        System.out.println("4. Heksadesimal ke Biner");
        System.out.println("5. Desimal ke Heksadesimal");
        System.out.println("6. Heksadesimal ke Desimal");
        System.out.println("");
        System.out.print("Masukkan pilihan (1-6): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1: // Biner --> Desimal
                System.out.print("Masukkan bilangan biner: ");
                String biner = input.next();
                int desimal = Integer.parseInt(biner, 2);
                System.out.println("Hasil konversi ke desimal: " + desimal);
                break;
            case 2: // Desimal --> Biner
                System.out.print("Masukkan bilangan desimal: ");
                int desimalInput = input.nextInt();
                String binerOutput = Integer.toBinaryString(desimalInput);
                System.out.println("Hasil konversi ke biner: " + binerOutput);
                break;
            case 3: // Biner --> Heksadesimal
                System.out.print("Masukkan bilangan biner: ");
                String binerInput = input.next();
                int desimalOutput = Integer.parseInt(binerInput, 2);
                String heksadesimal = Integer.toHexString(desimalOutput).toUpperCase(); // Mengubah huruf menjadi kapital
                System.out.println("Hasil konversi ke heksadesimal: " + heksadesimal);
                break;
            case 4: // Heksadesimal --> Biner
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksaInput = input.next();
                heksaInput = heksaInput.toUpperCase(); // Mengubah huruf menjadi kapital
                int desimalFromHeks = Integer.parseInt(heksaInput, 16);
                String binerFromHeks = Integer.toBinaryString(desimalFromHeks);
                System.out.println("Hasil konversi ke biner: " + binerFromHeks);
                break;
            case 5: // Desimal --> Heksadesimal
                System.out.print("Masukkan bilangan desimal: ");
                int desimalInput2 = input.nextInt();
                String heksaOutput = Integer.toHexString(desimalInput2).toUpperCase(); // Mengubah huruf menjadi kapital
                System.out.println("Hasil konversi ke heksadesimal: " + heksaOutput);
                break;
            case 6: // Heksadesimal --> Desimal
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksaInput2 = input.next();
                heksaInput2 = heksaInput2.toUpperCase(); // Mengubah huruf menjadi kapital
                int desimalFromHeks2 = Integer.parseInt(heksaInput2, 16);
                System.out.println("Hasil konversi ke desimal: " + desimalFromHeks2);
                break;
            
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
