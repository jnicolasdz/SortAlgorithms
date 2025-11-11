package com.jnicolasdz;
import java.util.Comparator;

public class Bubble<T> extends SortAlgorithm<T> {

    public Bubble(Comparator<T> comparator) {
        super(comparator);

    }

    @Override
    public T[] sort(T[] elements) {
       
        int i, j;
        T temp;
        boolean swapped;
        for (i = 0; i < elements.length - 1; i++) {
            swapped = false;
            for (j = 0; j < elements.length - i - 1; j++) {
                if(compare(elements[j], elements[j+1])) {
                    temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    return elements;
    }
    
}
