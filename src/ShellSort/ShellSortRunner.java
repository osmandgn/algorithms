package ShellSort;

import MergeSort.*;

import java.util.*;

public class ShellSortRunner {

    public static void main(String[] args) {
        int arr[] = {5,3,4,2};
        System.out.println("ShellSort Öncesi Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("*************************");
        System.out.println("ShellSort Sonrası Array : ");
       ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
