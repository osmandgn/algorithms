package InsertionSort;

import SelectionSort.*;

import java.util.*;

public class InsertionSortRunner {

    public static void main(String[] args) {
        int[] arr = { 7,4,5,9,8,2,1};
        System.out.println("Sort işlemi öncesi array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("************************");
        System.out.println("InsertionSort işlemi sonrası : ");
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("***************************");
    }
}
