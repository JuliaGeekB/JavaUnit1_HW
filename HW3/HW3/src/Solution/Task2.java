//Task2. Пусть дан произвольный список целых чисел, удалить из него четные числа

package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void DelEvenArrayRnd() { 
        List<Integer> iList=new ArrayList<>(); // Заполнение списка случайными числами
        Random rnd=new Random();
        for (int i = 0; i < 10; i++) {
            iList.add(rnd.nextInt(100));
        }
        System.out.println(iList);
    
        List<Integer> delList=new ArrayList<>();// Удаление четных чисел из списка
        for (Integer num: iList) {
            if (num %2==0) delList.add(num);
        }
        iList.removeAll(delList);
        System.out.println(iList);
    } 
}
