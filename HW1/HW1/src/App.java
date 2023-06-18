import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Task1. Вычислить сумму чисел от 1 до N
        Scanner iScanner=new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int n=iScanner.nextInt();
        System.out.println("Сумма натуральных числе от 1 до " +n +" равняется " + Sum(n));
                
        // Task2.  Вывести все простые числа от 1 до 1000
        List<Integer> primes=new ArrayList<>();
        for (int i=2; i <=1000; i++){
            boolean primeTest=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    primeTest=false;
                    break;
                }
            }
            if (primeTest){
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);

        // Task3.  Реализовать простой калькулятор
        task3();

    }
    private static int Sum (int n) {
        int Sum=0;
        for (int i = 1; i <= n; i++) {
            Sum=Sum+i;
        } 
        return Sum;
    }

    public static void task3 () {
        Scanner iScanner=new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a=iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int b=iScanner.nextInt();
        System.out.println("Введите операцию из списка: +, -, /, *: ");
        char operation;
        operation=iScanner.next().charAt(0);
        int res;
        switch (operation) {
            case '+':
                res=a+b;
                System.out.printf("Результат: %d", res);
                break;
            case '-':
                res=a-b;
                System.out.printf("Результат: %d", res);
                break;       
            case '/':
                res=a/b;
                System.out.printf("Результат: %d", res);
                break;
            case '*':
                res=a*b;
                System.out.printf("Результат: %d", res);
                break;
        }
        iScanner.close();
    }

}
