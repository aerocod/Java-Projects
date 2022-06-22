import java.util.Scanner;

class ProgramLuasSegitiga {
    private static Scanner input;

    public static void main(String[] args) {
        System.out.println("Welcome To Luas Segitiga Program");
        input = new Scanner(System.in);
        double luas,alas,tinggi;

        System.out.println("Please Input Alas: ");
        alas=input.nextDouble();

        System.out.println("Please Input Height");
        tinggi=input.nextDouble();

        luas=0.5*alas*tinggi;

        System.out.println("Luas Segitiga= "+luas+"Cm");
    }
    
}