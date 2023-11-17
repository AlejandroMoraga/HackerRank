import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        List<Integer> r=breakingRecords(scores);
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int min=scores.get(0);
        int max =scores.get(0);

        List<Integer> res = new ArrayList<>();
        res.add(0);
        res.add(0);

        for(int s:scores){
            if(s<min){
                min=s;
                res.set(1,res.get(1)+1);
            }
            if(s>max){
                max=s;
                res.set(0,res.get(0)+1);
            }
        }


    return res;
    }
}