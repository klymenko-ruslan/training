package sorting;

import java.util.Arrays;

/**
 * Created by klymenko.ruslan on 18.04.2015.
 */
public class CountSorting {

    public void sort(Integer [] data) {
        int max = 0;
        for(int current : data) {
            if(current > max) max = current;
        }

        int [] array = new int[max + 1];
        for(int current : data) {
            array[current]++;
        }

        int cnt = 0;
        for(int i = 0; i < array.length; i++) {
            while(array[i] > 0) {
                data[cnt++] = i;
                array[i]--;
            }
        }
    }
}
