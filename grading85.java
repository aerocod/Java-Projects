import java.util.Scanner;

public class grading85 {
    private static Scanner input;
    public static void main(String[] args) {
        int nilai;
        input=new Scanner(System.in);

        while (true){
            System.out.println("Harap Masukan Nilai: ");
            nilai=input.nextInt();
            if(nilai>=85){
                System.out.println("Selamat Anda Lulus Grade A");
            }else if (nilai>=75 & nilai<=85){
                System.out.println("Selamat Anda Lulus Grade B");
            }else if (nilai>=65 & nilai <=75){
                System.out.println("Selamat Anda Lulus Grade C");
            }else if(nilai<=65){
                System.out.println("Anda Dinyatakan Tidak Lulus Grade D");
            }else{
                System.out.println("Mohon Masukan Angka Dengan Benar");
            }
        }
    }
        }
        