import java.util.Scanner;

class operatorpenugasan{
    private static Scanner input;
    public static void main(String[] args) {
        double a,b,c;
        input=new Scanner(System.in);

        System.out.println("Operator +=");
        System.out.println("Harap Masukan Angka Di Var a: ");
        System.out.println("Harap Masukan Angka Di Var B: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=b+=a;
        System.out.println("Hasil Dari Operator b+=a: "+c);
        // Jadi Misalkan a=10 b =5, b+=a, maka 5+10 jadi 15 berlaku utk yglaen

        System.out.println("Operator -=");
        System.out.println("Harap Masukan Angka Di Var A: ");
        System.out.println("Harap Masukan Angka Di Var b: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=b-=a;
        System.out.println("Hasil Dari Operator b-=a: "+c);

        System.out.println("Operator *=");
        System.out.println("Harap Masukan Angka Di Var A: ");
        System.out.println("Harap Masukan Angka Di Var b: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=b*=a;
        System.out.println("Hasil Dari Operator b*=a: "+c);

        System.out.println("Operator /=");
        System.out.println("Harap Masukan Angka Di Var A: ");
        System.out.println("Harap Masukan Angka Di Var b: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=b/=a;
        System.out.println("Hasil Dari Operator b/=a: "+c);

        System.out.println("Operator %=");
        System.out.println("Harap Masukan Angka Di Var A: ");
        System.out.println("Harap Masukan Angka Di Var b: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=b%=a;
        System.out.println("Hasil Dari Operator b%=a: "+c);
    }
}