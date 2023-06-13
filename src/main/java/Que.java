/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 **/

import java.util.*;

public class Que {
    private static LinkedList<Integer> arrList = new LinkedList<>();

    public boolean enque(int a) {
        return arrList.offer(a);
    }

    public int first() {

        return arrList.element();
    }

    public int dequeue() {
        return arrList.poll();
    }

    public void printArr() {
        System.out.println(arrList);
    }

    public void scanArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int maxRand = 100;
        int minRand = 0;
        int sizeArray = in.nextInt();
        Random random = new Random();
        {
            for (int i = 0; i < sizeArray; i++) {
                enque(random.nextInt((int) (Math.random() * (maxRand - minRand + 1))) + minRand);
            }
        }
    }
}