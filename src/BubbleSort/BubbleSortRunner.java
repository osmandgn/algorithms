package BubbleSort;

import InsertionSort.*;

import java.util.*;

public class BubbleSortRunner {

    public static void main(String[] args) {

        int[] arr ={3,1,4,5,8,6,2};
        System.out.println("BubbleSort işlemi öncesi array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("************************");
        System.out.println("BubbleSort işlemi sonrası : ");
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("***************************");
    }
}
