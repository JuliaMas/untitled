package org.example.lesson2.ClassWork;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = {2,6,5,8,5,6,2};
        System.out.println("palindrom(array) = " + palindrom(array));
    }

    /**
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным
     * @param array входной массив
     * @return результат
     */
    private static boolean palindrom(int[] array) {
        boolean flag = false;
        int len = array.length - 1;
        for (int i = 0; i < array.length/2; i++) {
            if(array[i] != array[len - i]) return false;
        }
        return true;
    }
}
