package sorting;

import java.util.Arrays;

/**
 * Created by klymenko.ruslan on 18.04.2015.
 */
public class QuickSorting extends ComparisonSorting{

    @Override
    protected void sortAsc() {
        quickSort(data, 0, data.length - 1);
    }

    @Override
    protected void sortDesc() {
        quickSort(data, 0, data.length - 1);
    }

    public void quickSort(Comparable [] data, int i, int j) {
        if(i < j) {
            int tmp = partition(data, i, j);
            quickSort(data, i, tmp - 1);
            quickSort(data, tmp + 1, j);
        }
    }

    public int partition(Comparable [] data, int low, int top) {
        Comparable pivot = data[top];
        int tmp = low;
        if(order == Order.ASC) {
            for (int i = low; i < top; i++) {
                if (data[i].compareTo(pivot) < 1) {
                    swap(data, i, tmp);
                    tmp++;
                }
            }
        } else {
            for (int i = low; i < top; i++) {
                if (data[i].compareTo(pivot) > -1) {
                    swap(data, i, tmp);
                    tmp++;
                }
            }
        }
        swap(data, tmp, top);
        return tmp;
    }
}
