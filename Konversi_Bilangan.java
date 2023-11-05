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
                int desimal2= input.nextInt();
                String biner2 = Integer.toBinaryString(desimal2);
                System.out.println("Hasil konversi ke biner: " + biner2);
                break;
            case 3: // Biner --> Heksadesimal
                System.out.print("Masukkan bilangan biner: ");
                String biner3 = input.next();
                int desimal3 = Integer.parseInt(biner3, 2);
                String heksadesimal3 = Integer.toHexString(desimal3).toUpperCase(); // Mengubah huruf menjadi kapital
                System.out.println("Hasil konversi ke heksadesimal: " + heksadesimal3);
                break;
            case 4: // Heksadesimal --> Biner
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksadesimal4 = input.next();
                heksadesimal4= heksadesimal4.toUpperCase(); // Mengubah huruf menjadi kapital
                int desimal4 = Integer.parseInt(heksadesimal4, 16);
                String biner4 = Integer.toBinaryString(desimal4);
                System.out.println("Hasil konversi ke biner: " + biner4);
                break;
            case 5: // Desimal --> Heksadesimal
                System.out.print("Masukkan bilangan desimal: ");
                int desimal5 = input.nextInt();
                String heksadesimal5 = Integer.toHexString(desimal5).toUpperCase(); // Mengubah huruf menjadi kapital
                System.out.println("Hasil konversi ke heksadesimal: " + heksadesimal5);
                break;
            case 6: // Heksadesimal --> Desimal
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksadesimal6 = input.next();
                heksadesimal6 = heksadesimal6.toUpperCase(); // Mengubah huruf menjadi kapital
                int desimal6 = Integer.parseInt(heksadesimal6, 16);
                System.out.println("Hasil konversi ke desimal: " + desimal6);
                break;
            
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
