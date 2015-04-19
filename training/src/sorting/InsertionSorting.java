package sorting;

/**
 * Created by klymenko.ruslan on 18.04.2015.
 */
public class InsertionSorting extends ComparisonSorting {

    @Override
    protected void sortAsc() {
        for(int i = 1; i < data.length; i++) {
            int previous = i - 1;
            Comparable current = data[i];
            while (previous >= 0 && data[previous].compareTo(current) > 0) {
                swap(data, previous, previous + 1);
                previous--;
            }
            data[previous + 1] = current;
        }
    }

    @Override
    protected void sortDesc() {
        for(int i = 1; i < data.length; i++) {
            int previous = i - 1;
            Comparable current = data[i];
            while (previous >= 0 && data[previous].compareTo(current) < 0) {
                swap(data, previous, previous + 1);
                previous--;
            }
            data[previous + 1] = current;
        }
    }
}
