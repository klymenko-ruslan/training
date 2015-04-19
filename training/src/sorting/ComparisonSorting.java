package sorting;

/**
 * Created by klymenko.ruslan on 18.04.2015.
 */
public abstract class ComparisonSorting {

    protected Order order;

    protected Comparable [] data;

    public void sort(Comparable[] data) {
        this.data = data;
        this.order = Order.ASC;
        sortAsc();
    }

    public void sort(Comparable[] data, Order order) {
        this.data = data;
        this.order = order;
        if(order == Order.ASC) {
            sortAsc();
        } else if(order == Order.DESC) {
            sortDesc();
        }
    }

    protected abstract void sortAsc();

    protected abstract void sortDesc();

    protected void swap(Comparable [] data, int i, int j) {
        if(i != j) {
            Comparable tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }
}
