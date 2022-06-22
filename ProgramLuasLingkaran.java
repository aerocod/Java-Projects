import java.util.Scanner;

class ProgramLuasLingkaran {
    private static Scanner input;

    public static void main(String[] args) {
        System.out.println("Welcome To Luas Lingkaran Program");
        input = new Scanner(System.in);
        double luas,phi,r;

        System.out.println("Please Input r: ");
        r=input.nextDouble();
        phi=3.14;
        luas=phi*r*r;

        System.out.println("Luas Lingkaran= "+luas+"Cm");
    }
    
}
