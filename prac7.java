class Let{
    int k;
    int j;
    public Let(){
        k=9;
        j=10;
    }
}

public class prac7 extends Let {
    public static void main(String args[]){
       prac7 pra=new prac7();
       pra.k=99;
       pra.j=100;
       System.out.println(pra.k+" "+pra.j); 
    }
}

