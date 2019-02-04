package ru.ivanovaanastasiya.lesson_3;

/*
2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот
телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по
фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при
запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля
(имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода
результатов проверки телефонного справочника.
 */

import java.util.*;

public class PhoneBook {
    private HashMap<String, ArrayList> phoneBook;

    PhoneBook() {
        phoneBook = new HashMap<>();

    }

    public void add (String surname, String numberPhone) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> temp;
        list.add(numberPhone);
        if (!(phoneBook.containsKey(surname))) {
            this.phoneBook.put(surname, list);
        } else {
            temp = phoneBook.get(surname);
            temp.add(numberPhone);
            this.phoneBook.put(surname, temp);
        }
    }

    public String get (String surname) {
        String temp = null;
        for (Map.Entry<String, ArrayList> o : phoneBook.entrySet()) {
            if (o.getKey().equals(surname)) {
                temp = o.getValue().toString();
            }
        }
        return "Номер телефона <" + surname + "> - " + temp;
    }


}
