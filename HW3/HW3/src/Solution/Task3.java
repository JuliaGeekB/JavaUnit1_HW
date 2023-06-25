// Task3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void Values() { 
        // Заполнение списка случайными числами
        List<Integer> iList=new ArrayList<>(); 
        Random rnd=new Random();
        for (int i = 0; i < 10; i++) {
            iList.add(rnd.nextInt(100));
        }
        System.out.println(iList);
        
        // Поиск макс. и мин. через Collections
        System.out.println("Минимальное значение в списке: " + Collections.min(iList));
        System.out.println("Максимальное значение в списке: " + Collections.max(iList));

        // Поиск среднего значения через цикл
        int sum=0;
        for (int i: iList) {
            sum+=i;
        }
        int avg=sum/iList.size();
        
        System.out.println("Среднее значение в списке: " + avg);

    }
}
