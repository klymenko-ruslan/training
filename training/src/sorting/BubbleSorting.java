package sorting;

import java.util.Arrays;

/**
 * Created by klymenko.ruslan on 18.04.2015.
 */
public class BubbleSorting extends ComparisonSorting {

    @Override
    protected void sortAsc() {
        for(int i = 0; i < data.length - 1; i++) {
            for(int j = data.length - 1; j > i; j--) {
                if (data[i].compareTo(data[j]) > 0) {
                    swap(data, i, j);
                }
             }
        }
    }

    @Override
    protected void sortDesc() {
        for(int i = 0; i < data.length - 1; i++) {
            for(int j = data.length - 1; j > i; j--) {
                if (data[i].compareTo(data[j]) < 0) {
                    swap(data, i, j);
                }
            }
        }
    }
}
