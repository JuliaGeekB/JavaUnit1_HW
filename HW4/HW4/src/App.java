import java.util.LinkedList;
import Solution.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Task1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список
        LinkedList <String> list = new LinkedList<>();// Создаем список
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        LinkedList <String> list1 = new LinkedList<>(); // Создаем новый список и заполняем с конца заданного списка
        for (int i = list.size()-1; i >=0; i--) {
            list1.add(list.get(i));
        }
        System.out.println(list1);

        // Task2.
        Task2.task2(list);
        System.out.println(list);

    }
}
