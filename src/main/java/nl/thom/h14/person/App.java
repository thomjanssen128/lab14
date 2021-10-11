package nl.thom.h14.person;

import java.util.HashSet;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("A", 22, Gender.FEMALE);
        p1.addHistory("A");
        p1.addHistory("B");
        p1.addHistory("C");
        p1.addHistory("D");

        for (Person.HistoryRecord historyRecord : p1) {
            System.out.println(historyRecord);
        }

    }
}
