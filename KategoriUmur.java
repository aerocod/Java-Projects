import java.util.Scanner;
public class KategoriUmur {
    private static Scanner input;
    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Program Kategori Umur");
        input=new Scanner(System.in);
        int umur;

        System.out.println("Masukan Umur Kamu: ");
        umur=input.nextInt();

        if (umur>=0 & umur<=1){
            System.out.println("Kategori Umur Anda Bayi");
        }else if (umur>=1 & umur<=3){
            System.out.println("Kategori Umur Anda Balita");
        }else if (umur>=3 & umur<=11){
            System.out.println("Kategori Umur Anda Anak-anak");
        }else if (umur>=11 & umur<=17){
            System.out.println("Kategori Umur Anda Remaja");
        }else if (umur>=17 & umur<=24){
            System.out.println("Kategori Umur Anda Remaja Dewasa");
        }else if (umur>=24 & umur<=60){
            System.out.println("Kategori Umur Anda Dewasa");
        }else if (umur>=60 & umur<=150){
            System.out.println("Kategori Umur Anda Lansia");
        }else{
            System.out.println("Harap Masukan Angka Yang Benar 0-150");
        }
        
    }   
}
