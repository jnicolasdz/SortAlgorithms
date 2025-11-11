package src.java.com.main.SortAlgorithms;
import java.util.Comparator;

public class Insertion<T> extends SortAlgorithm<T> {

    public Insertion(Comparator<T> comparator) {
        super(comparator);
    }

    @Override
    public T[] sort(T[] elements) {

        for (int i = 1; i < elements.length; i++) {

            int elementToCompare = i;
            int lastElementSorted = i - 1;

            while( lastElementSorted >= 0 && compare(elements[lastElementSorted], elements[elementToCompare]) == true) {
                elements[lastElementSorted+ 1] = elements[lastElementSorted];
                lastElementSorted -= 1;
            }
            elements[lastElementSorted + 1] = elements[elementToCompare];
            
        }
        return elements;
    }


}