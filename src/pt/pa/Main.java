package pt.pa;

import pt.pa.adts.Queue;
import pt.pa.adts.QueueLinkedList;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new QueueLinkedList<>();

        try {
        /*for (int i = 0; i< 10 ; i++){
            queue.enqueue(i);
        }*/

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Stack is empty? " + queue.isEmpty());

            System.out.println("Top of stack is: " + queue.front());

            System.out.println("Pop all elements from stack:");

            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
            }

            System.out.println("Stack is empty? " + queue.isEmpty());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
