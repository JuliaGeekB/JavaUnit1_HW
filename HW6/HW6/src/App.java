import java.util.HashSet;

import NotebooksLibrary.Notebook;

public class App {
    public static void main(String[] args) throws Exception {
        Notebook Asus1 = new Notebook (1, "ASUS M1502IA-BQ093", "'15.6'/1920x1080 пикс.", "AMD Ryzen 7 4800H 2.9 ГГц", (byte) 15);
        Notebook Thunderobot1 = new Notebook (2, "Thunderobot 911 Air Wave D", "'15.6\'/1920x1080 пикс.", "Intel Core i5 11400H 2.7 ГГц", (byte) 8);
       
        // Создать множество ноутбуков
        HashSet<Notebook> notebookSet = new HashSet<Notebook>();
        notebookSet.add(Asus1);
        notebookSet.add(Thunderobot1);

        // Вывести на печать экземпляры класса
        System.out.println(Asus1);
        System.out.println(Thunderobot1);

        //Cравнить пару экземпляров
        System.out.println(Asus1.equals(Thunderobot1));
        
        // Найти один экземпляр в наборе
        System.out.println(notebookSet.contains(Asus1));
    }
}
