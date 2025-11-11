package com.jnicolasdz;
import java.util.Comparator;

public class MergeSort<T> extends SortAlgorithm<T> {

   public MergeSort(Comparator<T> comparator) {
        super(comparator);
        
    }

   private void merge(T arr[], int l, int m, int r){
        
        int n1 = m - l + 1;
        int n2 = r - m;
        T[] L = (T[]) new Object[n1]; 
        T[] R = (T[]) new Object[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if(compare(R[j], L[i])) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private T[] mergeSort(T arr[], int l, int r){
        
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }

    @Override
    public T[] sort(T[] elements) {
       return mergeSort(elements, 0,elements.length - 1);
    }
}
    

