interface cycle{
    void dobreak(int  increment);
    void speed(int decrement);
}
class toycycle implements cycle{
    public void dobreak(int increment){
        System.out.println("Breaking");

    }
    public void speed(int decrement){
        System.out.println("Boosting");
    }
}


public class prac10 {
public static void main(String args[]){
    toycycle tc=new toycycle();
   tc.dobreak(2);
   tc.speed(343);
}
    
}
