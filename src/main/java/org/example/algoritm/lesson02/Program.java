package org.example.algoritm.lesson02;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] array1 = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array1);
        SortUtils.directSort(array1);
        ArrayUtils.printArray(array1);
        System.out.println();
        array1 = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array1);
        SortUtils.quickSort(array1);
        ArrayUtils.printArray(array1);
        System.out.println();

        array1 = new int[]{5, 4, 1, 0, 1};
        ArrayUtils.printArray(array1);
        SortUtils.quickSort(array1);
        ArrayUtils.printArray(array1);

        array1 = new int[]{4,12,-1,0,-55,17,90,23};
        SortUtils.quickSort(array1);
        ArrayUtils.printArray(array1);
        int searchElement = 170;
        //int res = Arrays.binarySearch(array1, searchElement); // системный бинарный поиск
        int res = SearchUtils.binarySearch(array1, searchElement);
        System.out.printf("Элемент %d %s\n", searchElement,
                res>=0? String.format("найден в массиве по индексу %d", res): "не найден в массиве");
        System.out.println();

//Пирамидальня сортировка(сортировка кучей)
        array1 = new int[]{4,12,-1,0,-66,17,90,2};
        ArrayUtils.printArray(array1);
        HeapSort.sort(array1);
        ArrayUtils.printArray(array1);

        long startTime = System.currentTimeMillis();
        HeapSort.sort(array1.clone());
        long endTime = System.currentTimeMillis();
        System.out.printf("Время работы пирамидальной сортировки : %d мс.\n", endTime - startTime);


        /* array1= ArrayUtils.prepareArray(200000);

        long startTime = System.currentTimeMillis();
        SortUtils.directSort(array1.clone());
        long endTime = System.currentTimeMillis();
        System.out.printf("Время работы сортировки выбором: %d мс.\n", endTime - startTime);

        startTime = System.currentTimeMillis();
        SortUtils.quickSort(array1.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы быстрой сортировки : %d мс.\n", endTime - startTime);

        startTime = System.currentTimeMillis();
        SortUtils.quickSort(array1.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы быстрой сортировки : %d мс.\n", endTime - startTime);

        startTime = System.currentTimeMillis();
        SortUtils.quickSort(array1.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы быстрой сортировки : %d мс.\n", endTime - startTime);

        startTime = System.currentTimeMillis();
        SortUtils.quickSort(array1.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы быстрой сортировки : %d мс.\n", endTime - startTime);

        startTime = System.currentTimeMillis();
        Arrays.sort(array1.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы стандартной  сортировки : %d мс.\n", endTime - startTime);*/


    }
}
