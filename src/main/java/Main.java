// Дз 4
public class Main {

    public static void main(String[] args) {

        Reverse task1 = new Reverse();
        task1.reversArr();

        Que task2 = new Que();
        task2.scanArr();
        task2.printArr();
//        System.out.printf("\n помещает элемент в конец очереди " + task2.enqueue()); возвращает true если все успешно
        System.out.printf("\n возвращает первый элемент из очереди, не удаляя " + " -> " + task2.first());
        System.out.printf("\n возвращает первый элемент из очереди и удаляет его " + " -> " + task2.dequeue() + " ");
        task2.printArr();
    }
}