package homework3;
/*
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер
телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал
(дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д). Консоль использовать
только для вывода результатов проверки телефонного справочника.
 */

import java.util.HashMap;
import java.util.Map;

public class task2 {

    HashMap<String, String> phoneBook = new HashMap<>();
    public void add (String phone, String name){
        phoneBook.put(phone, name);
    }
    public void get (String name){
        for(Map.Entry<String, String> object : phoneBook.entrySet()){
            if (object.getValue().contains(name)) System.out.println( object.getValue() + " : " + object.getKey());
        }
    }

    public static void main(String[] args) {
        task2 yellow = new task2();

        yellow.add( "89298999591","VASYA");
        yellow.add( "89298999592","ASYA");
        yellow.add( "89298999593","VASYA");
        yellow.add( "89298999594","MASYA");
        yellow.add( "89298999595","VASYA");
        yellow.add( "89298999596","NASYA");

        yellow.get("VASYA");
    }

}
