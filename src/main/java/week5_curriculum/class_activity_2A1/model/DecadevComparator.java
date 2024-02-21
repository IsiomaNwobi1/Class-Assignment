package week5_curriculum.class_activity_2A1.model;

import java.util.Comparator;

public class DecadevComparator implements Comparator<Decadevs> {
    @Override
    public int compare(Decadevs d1, Decadevs d2) {
        if(d1.isFemale() && !d2.isFemale()){
            return -1;
        } else if (!d1.isFemale() && d2.isFemale()) {
            return 1;
        } else if (d1.isMale() && !d2.isMale()) {
            return -1;
        } else if (!d1.isMale() && d2.isMale()) {


        }
        return 0;
    }
}
