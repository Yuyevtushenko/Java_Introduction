package homeWorks.homeWork12;

import java.util.Comparator;

public class CompareEmploees implements Comparator<NewEmploee> {
    @Override
    public int compare(NewEmploee o1, NewEmploee o2) {
        if(o1.getSalarySum() >= o2.getSalarySum()){
            return 1;
        }else{
            return -1;
        }
    }
}
