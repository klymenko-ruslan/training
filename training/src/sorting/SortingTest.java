package sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by klymenko.ruslan on 18.04.2015.
 */
public class SortingTest {

    private Integer [] inputIntegerData = {10,5,4,6,3,7,2,8,1,9,0,-1};
    private Integer [] outputIntegerDataAsc = {-1,0,1,2,3,4,5,6,7,8,9,10};
    private Integer [] outputIntegerDataDesc = {10,9,8,7,6,5,4,3,2,1,0,-1};

    private Integer [] positiveOnlyInputIntegerData = {10,5,4,6,3,7,2,8,1,9};
    private Integer [] positiveOnlyOutputIntegerDataAsc = {1,2,3,4,5,6,7,8,9,10};
    private Integer [] positiveOnlyOutputIntegerDataDesc = {10,9,8,7,6,5,4,3,2,1};

    private Double [] inputDoubleData = {0.5,0.4,0.6,0.3,0.7,0.2,0.8,0.1,0.9,0.0};
    private Double [] outputDoubleDataAsc = {0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};
    private Double [] outputDoubleDataDesc = {0.9,0.8,0.7,0.6,0.5,0.4,0.3,0.2,0.1, 0.0};

    private Character [] inputCharacterData = {'f','e','g','d','h','c','i','b','j','a'};
    private Character [] outputCharacterDataAsc = {'a','b','c','d','e','f','g','h','i','j'};
    private Character [] outputCharacterDataDesc = {'j','i','h','g','f','e','d','c','b','a'};


    @Test
    public void bubbleSortingTest() {
        ComparisonSorting sorting = new BubbleSorting();
        comparisonSortingTestTemplate(sorting);
    }

    @Test
    public void insertionSortingTest() {
        ComparisonSorting sorting = new InsertionSorting();
        comparisonSortingTestTemplate(sorting);
    }

    @Test
    public void selectionSortingTest() {
        ComparisonSorting sorting = new SelectionSorting();
        comparisonSortingTestTemplate(sorting);
    }

    @Test
    public void quickSortingTest() {
        ComparisonSorting sorting = new QuickSorting();
        comparisonSortingTestTemplate(sorting);
    }

    @Test
    public void mergeSortingTest() {
        ComparisonSorting sorting = new MergeSorting();
        comparisonSortingTestTemplate(sorting);
    }

    private void comparisonSortingTestTemplate(ComparisonSorting sorting) {
        comparisonSortingDefaultOrderTestTemplate(sorting);
        comparisonSortingASCOrderTestTemplate(sorting);
        comparisonSortingDESCOrderTestTemplate(sorting);
    }

    private void comparisonSortingDefaultOrderTestTemplate(ComparisonSorting sorting) {
        Integer [] localInputIntegerData = inputIntegerData.clone();
        sorting.sort(localInputIntegerData);
        Assert.assertArrayEquals(outputIntegerDataAsc, localInputIntegerData);

        Double [] localInputDoubleData = inputDoubleData.clone();
        sorting.sort(localInputDoubleData);
        Assert.assertArrayEquals(localInputDoubleData, outputDoubleDataAsc);

        Character [] localInputCharacterData = inputCharacterData.clone();
        sorting.sort(localInputCharacterData);
        Assert.assertArrayEquals(outputCharacterDataAsc, localInputCharacterData);
    }

    private void comparisonSortingASCOrderTestTemplate(ComparisonSorting sorting) {
        Integer [] localInputIntegerData = inputIntegerData.clone();
        sorting.sort(localInputIntegerData, Order.ASC);
        Assert.assertArrayEquals(outputIntegerDataAsc, localInputIntegerData);

        Double [] localInputDoubleData = inputDoubleData.clone();
        sorting.sort(localInputDoubleData, Order.ASC);
        Assert.assertArrayEquals(localInputDoubleData, outputDoubleDataAsc);

        Character [] localInputCharacterData = inputCharacterData.clone();
        sorting.sort(localInputCharacterData, Order.ASC);
        Assert.assertArrayEquals(outputCharacterDataAsc, localInputCharacterData);
    }

    private void comparisonSortingDESCOrderTestTemplate(ComparisonSorting sorting) {
        Integer [] localInputIntegerData = inputIntegerData.clone();
        sorting.sort(localInputIntegerData, Order.DESC);
        Assert.assertArrayEquals(outputIntegerDataDesc, localInputIntegerData);

        Double [] localInputDoubleData = inputDoubleData.clone();
        sorting.sort(localInputDoubleData, Order.DESC);
        Assert.assertArrayEquals(localInputDoubleData, outputDoubleDataDesc);

        Character [] localInputCharacterData = inputCharacterData.clone();
        sorting.sort(localInputCharacterData, Order.DESC);
        Assert.assertArrayEquals(outputCharacterDataDesc, localInputCharacterData);
    }

    @Test
    public void countSortingTest() {
        Integer [] localInputIntegerData = positiveOnlyInputIntegerData.clone();
        new CountSorting().sort(localInputIntegerData);
        Assert.assertArrayEquals(positiveOnlyOutputIntegerDataAsc, localInputIntegerData);
    }
}
