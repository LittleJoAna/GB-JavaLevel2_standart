package ru.ivanovaanastasiya.lesson_1.obstacles;import ru.ivanovaanastasiya.lesson_1.participants.Participant;public class Water extends Obstacle {    private int length;    public Water(int length) {        this.length = length;    }    @Override    public int getValue() {        return length;    }    @Override    public void doIt(Participant p) {        p.swim(length);    }}