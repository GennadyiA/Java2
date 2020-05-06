package homework3;

import java.util.HashMap;
import java.util.Map;

/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
 */
public class task1 {
    private static String[] data = new String[]{"A", "B", "A", "B", "A", "A", "A", "C", "D", "E"};

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : data){
            Integer value = map.get(word);
            if(value == null) value = 0;
            map.put(word, ++value);
        }

        for(Map.Entry<String, Integer> object : map.entrySet()){
            System.out.println(object.getKey() + " : " + object.getValue());
        }
    }
}
