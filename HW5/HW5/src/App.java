import java.util.HashMap;
import java.util.List;

import HeapSortmethod.HeapSort;
import PhoneBook.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Задача1. PhoneBook
        PhoneBook.PB.PhoneBook();
        PhoneBook.PB.addContacts("Иванов", "123456");
        PhoneBook.PB.addContacts("Петров", "789456");
        PhoneBook.PB.addContacts("Иванов", "456133");
        PhoneBook.PB.printContacts();

        
        // Задача2. Пирамидальная сортировка  
        int arr[] = {12, 11, 13, 5, 6, 7};
        HeapSortmethod.HeapSort.printArray(arr);
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Отсортированный массив: ");
        HeapSortmethod.HeapSort.printArray(arr);
    }
}
