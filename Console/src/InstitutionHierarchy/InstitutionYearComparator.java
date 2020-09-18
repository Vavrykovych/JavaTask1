package InstitutionHierarchy;

import java.util.Comparator;

public class InstitutionYearComparator implements Comparator<Institution> {

    @Override
    public int compare(Institution o1, Institution o2) {
        if(o1.getFoundationYear() < o2.getFoundationYear()){
            return -1;
        }
        else if(o1.getFoundationYear() > o2.getFoundationYear()){
            return 1;
        }
        return 0;
    }
}
