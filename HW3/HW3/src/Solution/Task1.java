// Task1.Реализовать алгоритм сортировки слиянием

package Solution;

import java.util.Arrays;

public class Task1 {
    public static void task1() {
        
        int[] array1 = new int[] {1, 5, 6, 10, 25, 35, 45, 80};
        int[] array2 = new int[] {2, 7, 9, 15, 40};
        int[] array3 = new int[array1.length + array2.length]; // Создаем новый массив, длина которого равняется сумме длин заданных массивов.

        int i=0, j=0;
        for (int k=0; k<array3.length; k++) {// Заполняем новый массив

            if (i > array1.length-1) { // заполняем новый массив данными из второго массива в случае, если в первом массиве значений больше нет
                int a = array2[j];
                array3[k] = a;
                j++;
            }
            else if (j > array2.length-1) { // заполняем новый массив данными из первого массива в случае, если во втором массиве значений больше нет
                int a = array1[i];
                array3[k] = a;
                i++;
            }
            else if (array1[i] < array2[j]) { // заполняем новый массив данными из 1ого массива, если значения из первого массива меньше значения из второго
                int a = array1[i]; 
                array3[k] = a;
                i++;
            }
            else {
                int b = array2[j]; // заполняем новый массив данными из 2ого массива, если значения из первого массива больше значения из второго
                array3[k] = b;
                j++;
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
