import java.util.Comparator;
import java.lang.Integer;

public class VisitorComparator implements  Comparator<Visitor>{

    public int compare(Visitor v1, Visitor v2) {
        int ageCompare=Integer.compare(v1.getAge(), v2.getAge());
        if(ageCompare!=0){
            return ageCompare;
        }
        return v1.getName().compareTo(v2.getName());

    }



}
