package src.java.com.main.SortAlgorithms;
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

private void castingToWrappers(Object elements) {

    if (elements instanceof float[]) {
        Float[] objetos = ArrayUtils.toObject(elements);
    }
    if (elements instanceof float[]) {
        Float[] objetos = ArrayUtils.toObject(elements);
    }
}

 
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
