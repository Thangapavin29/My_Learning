import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Your Operation \n1.Addition \n2.Subtraction\n3.Multiplication\n4.Division\n5.Reminder");
        double a = sc.nextDouble();
        System.out.println("Enter the First number");
        double b = sc.nextDouble();
        System.out.println("Enter the Second number");
        double c = sc.nextDouble();

        if(a==1){
            a=b+c;
            System.out.println("Addition of "+b+" + "+c+" = "+a);
        }
        else if(a==2){
            a=b-c;
            System.out.println("Subtraction of "+b+" - "+c+" = "+a);
        }
        else if(a==3){
            a=b*c;
            System.out.println("Multiplication of "+b+" * "+c+" = "+a);
        }
        else if(a==4){
            a=b/c;
            System.out.println("Division of "+b+" / "+c+" = "+a);
        }
        else if(a==5){
            a=b%c;
            System.out.println("Reminder of "+b+" % "+c+" = "+a);
        }
        else {
            System.out.println("Invalid Selection..!");
        }
    }
}