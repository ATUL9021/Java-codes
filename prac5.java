import java.util.*;
public class prac5 {
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int firstNumber,secondNumber;
       char operator,re;
       do{
           System.out.println("Enter first number");
           firstNumber=input.nextInt();
           System.out.println("Enter second Number");
           secondNumber=input.nextInt();
            System.out.println("Enter opeartion which you want to perform");
            operator=input.next().charAt(0);
            switch(operator){
                case '+':System.out.printf("%d + %d = %d\n",firstNumber,secondNumber,(firstNumber+secondNumber));
                         break;
                case '-':System.out.printf("%d - %d = %d\n",firstNumber,secondNumber,(firstNumber-secondNumber));
                         break;
                case '*':System.out.printf("%d * %d = %d\n",firstNumber,secondNumber,(firstNumber*secondNumber));
                         break;
                case '/':System.out.printf("%d / %d = %d\n",firstNumber,secondNumber,(firstNumber/secondNumber));
                         break;     
                default:
                    System.out.println("please enter appropriate operator\n");
                
            }
            System.out.println("for Recalculation enter r otherwise enter any keystroke");
            re=input.next().charAt(0);

       }while(re=='r');
   } 
}
