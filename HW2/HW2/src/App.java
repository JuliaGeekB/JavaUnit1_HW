public class App {
    public static void main(String[] args) throws Exception {
        String [] list = Task1.ReadLineFromFile("dataForRequest.txt") ;
        System.out.println(list[0]);
        StringBuilder resultRequest = Task1.request(list[0]);
        System.out.println(resultRequest);
    }
}
