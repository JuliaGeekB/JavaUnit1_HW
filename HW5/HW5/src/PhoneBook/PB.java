// Реализуйте структуру телефонной книги с помощью HashMap. 
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
// (можно выводить без сортировки, но обязательно в отдельном методе)

package PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PB {
    public static HashMap <String, List<String>> contacts; 
    
    public static void PhoneBook(){
        contacts = new HashMap<>();
    }
    
    

    public static void addContacts (String name, String phone){
        if (contacts.containsKey(name)){
            List<String> phones=contacts.get(name);
            if (!phones.contains(phone)) {
                phones.add(phone);
            }
        } else{
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            contacts.put(name,phones);
        }
    }

    
    public static void printContacts(){

        System.out.println("Contacts:");
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()){
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.println(name + " - " + phones.size() + " phones: ");
            for (String phone : phones){
                System.out.println("t  " + phone);
            }
        }
    }



//    String [] p={"Иванов 123456", "Петров 456789", "Сергеев 741852"}; 
//    public static HashMap<String, List<Integer>> PhoneFill (String[] p){ // Метод заполнения тел.книги
//         HashMap<String, List<Integer>> outMap1= new HashMap<>();
//         for (String s: p){
//             String sp = s.split(" ");
//             if (! outMap1.containsKey(sp[0])){
//                 List<Integer> PL = new list<>();
//                 PL.add (Integer.puls (s[]));
//                 outMap1.put(sp[0], PL);
//             } else {
//                 outMap1.get(sp[0]).add(Integer.parseInt(sp[1]));
//             }
//         return outMap1;
//             }
//         }
//    } 

}