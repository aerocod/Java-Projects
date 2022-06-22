import java.util.Scanner;
public class grading {
    private static Scanner input;
    public static void main(String[] args) {
        input=new Scanner(System.in);

        double nilai;
        System.out.println("Masukan Nilai Kamu: ");
        nilai=input.nextDouble();

        if (nilai>=0 & nilai<=40 ){
            System.out.println("Grade Is 'E'");
        } else if (nilai>=40 & nilai<=50){
            System.out.println("Grade Is 'D'");
        } else if (nilai>=50 & nilai<=60){
            System.out.println("Grade Is 'C'");
        } else if (nilai>=60 & nilai<=80){
            System.out.println("Grade Is 'B'");
        } else if (nilai>80 & nilai<=100){
            System.out.println("Grade Is'A'");
        } else{
            System.out.println("Please Input The Valid Number '0-100'");
        }
    }
}
