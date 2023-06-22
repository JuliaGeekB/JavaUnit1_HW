
public class App {
    public static void main(String[] args) throws Exception {
        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(text);
        StringBuilder resultRequest = Task1.request(text);
        System.out.println(resultRequest);
    }
}
