import java.util.Scanner;

public class operatoraritmatika {
    private static Scanner input;
    public static void main(String[] args) {
        Double angka1,angka2,hasil;
        System.out.println("Test Operator Aritmatika");
        input=new Scanner(System.in);

        //Penjumlahan
        System.out.println("Program Penjumlahan");
        System.out.println("Mohon Masukan Angka Ke-1");
        angka1=input.nextDouble();
        System.out.println("Masukan Angka Ke-2: ");
        angka2=input.nextDouble();

        hasil=angka1+angka2;
        System.out.println(angka1+"+"+angka2+"="+hasil);

        //Pengurangan
        System.out.println("Program Pengurangan");
        System.out.println("Mohon Masukan Angka Ke-1");
        angka1=input.nextDouble();
        System.out.println("Masukan Angka Ke-2: ");
        angka2=input.nextDouble();

        hasil=angka1-angka2;
        System.out.println(angka1+"-"+angka2+"="+hasil);

        //Perkalian
        System.out.println("Program Perkalian");
        System.out.println("Mohon Masukan Angka Ke-1");
        angka1=input.nextDouble();
        System.out.println("Masukan Angka Ke-2: ");
        angka2=input.nextDouble();

        hasil=angka1*angka2;
        System.out.println(angka1+"x"+angka2+"="+hasil);

        //Pembagian
        System.out.println("Mohon Masukan Angka Ke-1");
        angka1=input.nextDouble();
        System.out.println("Masukan Angka Ke-2: ");
        angka2=input.nextDouble();

        hasil=angka1/angka2;
        System.out.println(angka1+"/"+angka2+"="+hasil);

        //Sisa Bagi
        System.out.println("Mohon Masukan Angka Ke-1");
        angka1=input.nextDouble();
        System.out.println("Masukan Angka Ke-2: ");
        angka2=input.nextDouble();

        hasil=angka1%angka2;
        System.out.println(angka1+"%"+angka2+"="+hasil);
    }
    
}
