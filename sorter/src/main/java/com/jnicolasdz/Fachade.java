package com.jnicolasdz;
import java.util.Comparator;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Fachade<T extends Comparable<? super T>> {

private Comparator<T> comparador;
private SortAlgorithm<T> algorithm;

public Fachade(Comparator<T> comparator) {
    if (comparator == null) {
        this.comparador = Comparator.naturalOrder();
    } else {
        this.comparador = comparator;
    }
}


    @SuppressWarnings("unchecked")
public <H> T[] castingToWrappers(H primitiveArray) {
    return (T[]) switch (primitiveArray) {
        case int[] arr -> ArrayUtils.toObject(arr);
        case double[] arr -> ArrayUtils.toObject(arr);
        case long[] arr -> ArrayUtils.toObject(arr);
        case float[] arr -> ArrayUtils.toObject(arr);
        case short[] arr -> ArrayUtils.toObject(arr);
        case byte[] arr -> ArrayUtils.toObject(arr);
        case char[] arr -> ArrayUtils.toObject(arr);
        case Object[] arr -> arr;
        case null -> throw new IllegalArgumentException("Array cannot be null");
        default -> throw new IllegalArgumentException(
            "Unsupported array type: " + primitiveArray.getClass()
        );
    };

 

public T[] bubble(T[] elements) {
    algorithm = new Bubble<T>(this.comparador);
    return algorithm.sort(elements);
}

public T[] insertion(T[] elements) {
    algorithm = new Insertion<T>(this.comparador);
    return algorithm.sort(elements);
}

public T[] selection(T[] elements) {
    algorithm = new Selection<T>(this.comparador);
    return algorithm.sort(elements);
}

public T[] merge(T[] elements) {
    algorithm = new MergeSort<T>(this.comparador);
    return algorithm.sort(elements);
}

public T[] quick(T[] elements) {
    algorithm = new QuickSort<T>(this.comparador);
    return algorithm.sort(elements);
}

}
