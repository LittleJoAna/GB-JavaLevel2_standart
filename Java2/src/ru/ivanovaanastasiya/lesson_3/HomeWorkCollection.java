package ru.ivanovaanastasiya.lesson_3;



import java.util.*;

public class HomeWorkCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Иванов", "Сидоров", "Иванов", "Федоров", "Иванов",
                "Петров", "Сидоров", "Федоров", "Иванов", "Тимофеев", "Тихонов", "Сидоров", "Иванов", "Иванов", "Петров",
                "Тихонов", "Иванов", "Сидоров", "Петров", "Тимошенко", "Иванов", "Игнатов", "Иванов", "Петров"));
        //processArray(list);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Григорьев", "123");
        phoneBook.add("Петров", "456");
        phoneBook.add("Сидоров", "987");
        phoneBook.add("Тимофеев", "345");
        phoneBook.add("Григорьев", "346");
        phoneBook.add("Мартиросян", "555");
        phoneBook.add("Воля", "333");
        phoneBook.add("Харламов", "777");

        System.out.println(phoneBook.get("Григорьев"));






    }
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
//    из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
    static void processArray (ArrayList<String> list) {
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        int count;
        String word;
        HashMap<String, Integer> map = new HashMap<>();

        Iterator<String> iterator = set.iterator();

        for (int i = 0; i < list.size(); i++) {
            while (iterator.hasNext()) {
                word = iterator.next();
                count = Collections.frequency(list, word);
                map.put(word, count);
            }
        }

        for (Map.Entry<String, Integer> o : map.entrySet()) {
            System.out.println("Элемент: " + o.getKey() + " - " + o.getValue());
        }
    }

}
