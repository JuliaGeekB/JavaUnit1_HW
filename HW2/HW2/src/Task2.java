import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

// Задача 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task2 {
    public static void bubbleSort(int [] array, Logger logger){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j+1]<array[j]){
                    logger.info("Переставлен элемент");
                    int swap = array[j];
                    array[j]=array[j+1];
                    array[j+1]=swap;
                }
            }
        }
    }
    public static void LoggerOfClass(int [] array) throws IOException{
        Logger logger=Logger.getLogger(App.class.getName());
        FileHandler fh=new FileHandler("logTask2.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormatter=new SimpleFormatter();
        fh.setFormatter(sFormatter);
        logger.info("Test log1");
        Task2.bubbleSort(array, logger);
    }


}
