package task3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Meal> deque = new ArrayDeque<>();
        deque.offer(new Meal("manty", "uigur"));
        deque.offer(new Meal("ash", "uzbek"));
        deque.offer(new Meal("besh barmak", "kyrgyz"));
        Meal meal1 = new Meal("lagman", "uigur");
        Meal meal2 =  new Meal("fricasse", "french");
        deque.addFirst(meal1);
        deque.addLast(meal2);
        for (Meal meal : deque) {
            System.out.println(meal);
        }
        System.out.println();
        System.out.println(deque.poll());
        System.out.println();
        for (Meal meal : deque) {
            System.out.println(meal);
        }
        System.out.println();
        System.out.println(deque.peekLast());

    }
}
