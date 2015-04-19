package sorting;

/**
 * Created by klymenko.ruslan on 18.04.2015.
 */
public class SelectionSorting extends ComparisonSorting {

    @Override
    protected void sortAsc() {
        for(int i = 0; i < data.length - 1; i++) {
            int localMinIndex = i;
            for(int j = i + 1; j < data.length; j++) {
                if(data[j].compareTo(data[localMinIndex]) < 0) localMinIndex = j;
            }
            swap(data, i, localMinIndex);
        }
    }

    @Override
    protected void sortDesc() {
        for(int i = 0; i < data.length - 1; i++) {
            int localMinIndex = i;
            for(int j = i + 1; j < data.length; j++) {
                if(data[j].compareTo(data[localMinIndex]) > 0) localMinIndex = j;
            }
            swap(data, i, localMinIndex);
        }
    }
}
