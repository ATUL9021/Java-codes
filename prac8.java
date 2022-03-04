import java.util.*;
public class prac8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first and second Number");
        int firstNumber=input.nextInt(),secondNumber=input.nextInt();
        try{
            int answer=firstNumber/secondNumber;
            System.out.println("answer is "+answer);
        }
        catch(ArithmeticException e){
            System.out.println("Divide  by zero is not possible");
        }

    }
}
