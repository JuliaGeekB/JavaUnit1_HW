// Task2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void task2(LinkedList <String> list){
        System.out.println(enqueue(list, "e"));
        System.out.println(dequeue(list));
        System.out.println(first(list));
    }

    private static String enqueue (LinkedList<String> list, String element) {
        list.add(element);
        return element;
        
    }

    private static String dequeue(LinkedList<String> list) {
        String a=list.getFirst();
        list.removeFirst();
        return a;
    }

    private static String first(LinkedList<String> list) {
        return list.getFirst();
        
    }
    
}
