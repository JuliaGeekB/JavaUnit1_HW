import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        // Task1
        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(text);
        StringBuilder resultRequest = Task1.request(text);
        System.out.println(resultRequest);

        //Task2

        int [] sortArray= {25,5,30,15,20,10};
        System.out.println(Arrays.toString(sortArray));
        Task2.LoggerOfClass(sortArray);
        System.out.println(Arrays.toString(sortArray));
    }
}
