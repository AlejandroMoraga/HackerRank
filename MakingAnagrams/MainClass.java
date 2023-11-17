
public class MainClass {

    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b ="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        a="tttttttttttttttttttttttttttttttttttttsssssssssssssssss";
        b="sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
        System.out.println(makeAnagram(a,b));
    }

    public static int makeAnagram(String a, String b) {
        // Write your code here
        String[] aa =a.split("");
        String[] bb =b.split("");
        int count=0;

        for(String sa:aa){
            if(!b.contains(sa)){
                count=count+1;
                System.out.print(sa);
            }
        }
        System.out.println();
        for(String sb:bb){
            if(!a.contains(sb)){
                count=count+1;
                System.out.print(sb);
            }
        }
        System.out.println();
        return count;
    }
    
    
}