package com.jnicolasdz;
import java.util.Comparator;
import java.util.Objects;

public abstract class SortAlgorithm<T> {

    private final Comparator<T> comparator;

    public SortAlgorithm(Comparator<T> comparator) {
        Objects.requireNonNull(comparator, "comparator must be defined");
        this.comparator = comparator;
    }

    public boolean compare(T element1,T element2) {

        if(comparator.compare(element1, element2) < 0) {
            return true;
        }

        if(comparator.compare(element1, element2) > 0) {
            return false;
        }

        return true;
    }

    public abstract T[] sort(T[] elements);


}