import java.util.Scanner;

public class simpcalc {
    private static Scanner input;
    public static void main(String[] args) {
        input=new Scanner(System.in);
        double mode,x,y,xy;

        System.out.println("Welcome To SImple Calculator Program");
        System.out.println("Please Select The Calculator Mode");
        System.out.println("1. Plus");
        System.out.println("2. Subtract");
        System.out.println("3. Times");
        System.out.println("4. Divide");
        System.out.println("Input Mode By Number Given: ");
        mode=input.nextDouble();
        

        if(mode==1){
            System.out.println("Please Input The First Number: ");
            x=input.nextDouble();
            System.out.println("Please Input Thw Second Number: ");
            y=input.nextDouble();
            xy=x+y;
            System.out.println(x+"+"+y+"="+xy);
        } else if(mode==2){

            System.out.println("Please Input The First Number: ");
            x=input.nextDouble();
            System.out.println("Please Input Thw Second Number: ");
            y=input.nextDouble();
            xy=x-y;
            System.out.println(x+"-"+y+"="+xy);
        } else if(mode==3){

            System.out.println("Please Input The First Number: ");
            x=input.nextDouble();
            System.out.println("Please Input Thw Second Number: ");
            y=input.nextDouble();
            xy=x*y;
            System.out.println(x+"x"+y+"="+xy);
        }else if(mode==4){

            System.out.println("Please Input The First Number: ");
            x=input.nextDouble();
            System.out.println("Please Input Thw Second Number: ");
            y=input.nextDouble();
            xy=x/y;
            System.out.println(x+":"+y+"="+xy);
        }else{
            System.out.println("Please Input The Valid Number Given ");
        }
            
    }  
}
