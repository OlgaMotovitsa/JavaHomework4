import java.util.*;

//1)Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод, который вернет “перевернутый” список.
public class Reverse {
    private static LinkedList <Integer> arrList = new LinkedList<>();
    public void reversArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int sizeArray = in.nextInt();
        int maxRand = 100;
        int minRand = -100;
        Random random = new Random();
        for (int i = 0; i < sizeArray; i++) {
            arrList.add(random.nextInt((int) (Math.random() * (maxRand - minRand + 1))) + minRand);
        }
        System.out.println("Список: ");
        System.out.println(arrList);
        Collections.reverse(arrList);
        System.out.println("Перевернутый список: ");
        System.out.println(arrList);
    }

}