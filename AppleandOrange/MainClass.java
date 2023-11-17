import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        int s=7; 
        int t=11; 
        int a=5; 
        int b=15;
        List<Integer> apples=new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        List<Integer> oranges=new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);
  //a + apples(i)>=s
  //b + oranges(i)<=t
        countApplesAndOranges(s,t,a,b,apples,oranges);

    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here

        int apples_count=0;
        int oranges_count=0;
        for(int ap:apples){
            if(a+ap>=s && a+ap<=t){
                apples_count=apples_count+1;
            }
        }
        for(int or:oranges){
            if(b+or<=t && b+or>=s){
                oranges_count=oranges_count+1;
            }
        }

        System.out.println(apples_count);
        System.err.println(oranges_count);
    }
    
}