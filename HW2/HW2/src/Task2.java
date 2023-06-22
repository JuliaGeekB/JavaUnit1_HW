// Задача 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task2 {
    public static void bubbleSort(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j+1]<array[j]){
                    int swap = array[j];
                    array[j]=array[j+1];
                    array[j+1]=swap;
                }
            }
        }
    }
}
