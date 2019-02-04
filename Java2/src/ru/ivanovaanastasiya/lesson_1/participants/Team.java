package ru.ivanovaanastasiya.lesson_1.participants;

/*
Добавить класс Team, который будет содержать название команды, массив из 4-х участников 	(т.е. в конструкторе можно сразу
всех участников указывать), метод для вывода информации о членах команды, прошедших дистанцию, метод вывода информации обо всех
членах команды.
 */

public class Team {
    String name;
    Participant[] team;

    public Participant[] getTeam() {
        return team;
    }

    public Team(String name, Participant... part) {
        this.name = name;
        this.team = new Participant[part.length];
        for (int i = 0; i < part.length; i++) {
            this.team[i] = part[i];
        }
    }

    public void info() {
        System.out.println("Название команды: " + name + "\nУчастники: ");
        for (int i = 0; i < team.length; i++) {
            System.out.println(i + 1 + ". " + team[i].getName());
        }
    }

    public void showResults() {
        System.out.println("\nНазвание команды: " + name + "\nПобедители: ");
        for (int i = 0; i < team.length; i++) {
            if (team[i].isActive()) {
                System.out.println(team[i].getName());
            }
        }
    }
}
