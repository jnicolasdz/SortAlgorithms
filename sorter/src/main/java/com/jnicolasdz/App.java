package com.jnicolasdz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fachade<Integer> fachade = new Fachade<>(null);
        int[] arr = new int[]{1,2,3,4,5};
        Fachade<Float> fachade = new Fachade<>(null);
        Integer[] result = fachade.castingToWrappers(arr);
    }
}
