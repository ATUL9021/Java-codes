import java.util.*;

public class prac4{

    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter your age\n");
        short age=input.nextByte();

        if(age<18){
            System.out.println("You are under 18");
        }
        else if(age>18 && age < 30){
            System.out.printf("You are so young\n");
        }
        else if(age >30 && age<60){
            System.out.println("you are good to go");
        }
        else {
            System.out.println("Please enter age as per standard");
        }
    }
}