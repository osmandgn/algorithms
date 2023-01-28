package SelectionSort;

import java.util.*;

public class SelectionSortRunner {
    public static void main(String[] args) {
        int[] arr1 = {17,15,9,8,7,5,4,3,2,1,0};
        System.out.println("Sort işlemi öncesi array :");
        System.out.println(Arrays.toString(arr1));
        System.out.println("************************");
        System.out.println("SelectionSort işlemi sonrası : ");
        SelectionSort.selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("***************************");

    }
}
