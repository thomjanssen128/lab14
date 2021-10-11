package nl.thom.h14.person;

import java.util.PriorityQueue;

public class PrioQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> ints = new PriorityQueue<Integer>();
        ints.add(12);
        ints.add(2);
        ints.add(456);
        ints.add(0);
        ints.add(-29);
        ints.add(1);
        ints.add(666);
        ints.add(3);

        for (Integer anInt : ints) {
            System.out.println(anInt);
        }
    }
}
