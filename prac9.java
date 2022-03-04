class mythread extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<3){
            System.out.println("Hey doing threading");
            i++;
        }


    }
}
class mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<3){
            System.out.println("Hey doing another threading");
            i++;
        }


    }
}




public class prac9 {
    public static void main(String args[])
{
    mythread mt1=new mythread();
    mythread1 mt2=new mythread1();  

    mt1.start();
    mt2.start();
}    
    
}
