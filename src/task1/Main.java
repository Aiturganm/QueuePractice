package task1;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.offer(1);
        numbers.offer(4);
        numbers.offer(9);
        numbers.offer(2);
        numbers.offer(7);
        numbers.offer(5);
        numbers.offer(6);
        numbers.offer(8);
        numbers.offer(3);
        System.out.println(numbers);
        System.out.println(numbers.peek());
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(4);
        numbers2.add(9);
        numbers2.add(2);
        numbers2.add(7);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(8);
        numbers2.add(3);
        System.out.println(numbers2);
        System.out.println("numbers.size() = " + numbers.size());
        numbers.addFirst(12);
        System.out.println(numbers);
        System.out.println(numbers.peek());
        numbers.addLast(34);
        System.out.println(numbers);
        System.out.println(numbers.getLast());
        System.out.println(numbers);
        System.out.println("numbers.size() = " + numbers.size());

    }
}