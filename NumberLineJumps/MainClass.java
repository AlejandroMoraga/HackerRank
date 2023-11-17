
public class MainClass {

    public static void main(String[] args) {
        int x1=21;
        int v1=6; 
        int x2=47; 
        int v2=3;

        System.out.println(kangaroo(x1, v1, x2, v2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String r="NO";
        Double a=(double) (x2-x1)/(double)(v1-v2);
        if(a%1==0.0 && a>0){
            r="YES";
        }
        System.out.println(a%1);
        System.out.println(a);
        return r;
    }
    
}