package mystudents;

import java.util.Comparator;

public class AverageComparison implements StudentComparator {
    @Override
    public int compare(Student left, Student right) {
        return Double.compare(left.getAverage(),right.getAverage());
    }
}
