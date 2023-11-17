import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        //Any grade less than 38 is a failing grade. do not round
        //If the difference between the grade and the next multiple of 5 is < 3, round
        //If the difference between the grade and the next multiple of 5 is >= 3, do not round

        List<Integer> grades= new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> res= new ArrayList<>();
        res=gradingStudents(grades);
       for(int g:gradingStudents(grades)){
        System.out.println(g);
       }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int nextMultiple=0;
        int g=0;
        for(int j=0; j<grades.size(); j++){
            g=grades.get(j);
            if(g>=38){
                for(int i=g; i<=g+5; i++){
                    if(i%5==0){
                        nextMultiple=i;
                        break;
                    }
                }
                if(nextMultiple-g<3){
                    grades.set(j, nextMultiple);
                }
            }
            nextMultiple=0;
        }
        return grades;
}
    
}