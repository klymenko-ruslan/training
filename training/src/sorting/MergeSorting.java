package sorting;

/**
 * Created by klymenko.ruslan on 18.04.2015.
 */
public class MergeSorting extends ComparisonSorting {

    @Override
    protected void sortAsc() {
        sort(0, data.length - 1);
    }

    @Override
    protected void sortDesc() {
        sort(0, data.length - 1);
    }

    private void sort(int low, int high) {
        if (low < high) {
            int pivot = low + (high - low) / 2;
            sort(low, pivot);
            sort(pivot + 1, high);
            merge(low, pivot, high);
        }
    }

    private void merge(int low, int middle, int high) {
        Comparable [] helper = data.clone();
        int i = low;
        int j = middle + 1;
        int k = low;

        if(order == Order.ASC) {
            while (i <= middle && j <= high) {
                if (helper[i].compareTo(helper[j]) < 1) {
                    data[k++] = helper[i++];
                } else {
                    data[k++] = helper[j++];
                }
            }
        } else {
            while (i <= middle && j <= high) {
                if (helper[i].compareTo(helper[j]) > -1) {
                    data[k++] = helper[i++];
                } else {
                    data[k++] = helper[j++];
                }
            }
        }
        while (i <= middle) {
            data[k++] = helper[i++];
        }
    }
}
