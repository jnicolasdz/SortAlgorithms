package com.jnicolasdz;
import java.util.Comparator;

public class QuickSort<T> extends SortAlgorithm<T> {

    public QuickSort(Comparator<T> comparator) {
        super(comparator);
    }

    private int partition(T[] arr, int low, int high) {
        
        T pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if(compare(pivot, arr[j])) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);  
        return i + 1;
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private T[] quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }
    @Override
    public T[] sort(T[] elements) {
        return quickSort(elements, 0, elements.length - 1);
    }
    
}
