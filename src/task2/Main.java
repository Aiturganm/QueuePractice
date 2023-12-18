package task2;

import javax.print.attribute.standard.PrinterResolution;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        LinkedList<Order> queue = new LinkedList<>();
        queue.add(new Order("Beksultan", "kyrgyz"));
        queue.add(new Order("Kamchybek", "Kyrgyz"));
        queue.add(new Order("Mirbek", "kazak"));
        Iterator<Order> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(queue.poll());
        }
        System.out.println(queue);
        System.out.println("Ech kim jok!");
    }
}
