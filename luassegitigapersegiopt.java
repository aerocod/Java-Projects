import java.util.Scanner;

public class luassegitigapersegiopt {
    private static Scanner input;
    public static void main(String[] args) {
        double luas,alas,tinggi,panjang,lebar,option,lagi;
        input=new Scanner(System.in);

        while (true){
            System.out.println("Selamat Datang Di Program Menghitung Luas Segitiga dan Persegi");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung Luas Segitiga");
            System.out.println("Harap Masukan Nomor Untuk Menghitung Rumus: ");
            option=input.nextDouble();

            if (option==1){
                System.out.println("Harap Masukan Panjang Persegi: ");
                panjang=input.nextDouble();

                System.out.println("Harap Masukan Lebar Persegi: ");
                lebar=input.nextDouble();

                luas=panjang*lebar;

                System.out.println("Luas Persegi Adalah: "+luas+"Cm^2");
                System.out.println("Ingin Mencoba Lagi? ");
                System.out.println("Tekan 1 Untuk Mencoba Lagi, Tekan Angka Lain Jika Ingin Berhenti");
                lagi=input.nextDouble();
                if (lagi==1){
                    continue;
                }else{
                    System.out.println("Terima Kasih Sudah Menggunakan Program Ku");
                    break;
                }
             
            }else if (option==2){
                System.out.println("Harap Masukan Alas: ");
                alas=input.nextDouble();

                System.out.println("Harap Masukan Tinggi: ");
                tinggi=input.nextDouble();

                luas=0.5*alas*tinggi;

                System.out.println("Luas Segitiga Adalah: "+luas+"Cm^2");
                System.out.println("Ingin Mencoba Lagi? ");
                System.out.println("Tekan 1 Untuk Mencoba Lagi, Tekan Angka Lain Jika Ingin Berhenti");
                lagi=input.nextDouble();
                if (lagi==1){
                    continue;
                }else{
                    System.out.println("Terima Kasih Sudah Menggunakan Program Ku");
                    break;
                }
            }else{
                System.out.println("Mohon Masukan Angka/Pilihan Yang Benar");
                System.out.println("Ingin Mencoba Lagi? ");
                System.out.println("Tekan 1 Untuk Mencoba Lagi, Tekan Angka Lain Jika Ingin Berhenti");
                lagi=input.nextDouble();
                if (lagi==1){
                    continue;
                }else{
                    System.out.println("Terima Kasih Sudah Menggunakan Program Ku");
                    break;
                }
            }
        }   
    }
}
