package src.java.com.main.SortAlgorithms;
import java.util.Comparator;

public class Selection<T> extends SortAlgorithm<T>  {

    public Selection(Comparator<T> comparator) {
        super(comparator);
    }

    @Override
    public T[] sort(T[] elements) {
        
        for(int i = 0; i < elements.length; i++) {

            int minIndex = i;
            //find the smallest
            for (int j = i + 1; j < elements.length; j++) {
                if (compare(elements[j], elements[minIndex])) {
                    minIndex = j;
                }
            }
            //re sort
            T temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = temp;           

        } 
        return elements;
    }
    
}
