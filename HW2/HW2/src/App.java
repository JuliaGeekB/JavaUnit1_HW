import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // Task1
        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(text);
        StringBuilder resultRequest = Task1.request(text);
        System.out.println(resultRequest);

        //Task2
        Logger logger=Logger.getLogger(Task2.class.getName());
        FileHandler fh=new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml=new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");

        int [] sortArray= {25,5,30,15,20,10};
        System.out.println(Arrays.toString(sortArray));
        Task2.bubbleSort(sortArray);
        System.out.println(Arrays.toString(sortArray));
    }
}
