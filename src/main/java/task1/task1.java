package task1;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 */

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> nextList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0 ; i--) {
            nextList.add(list.get(i));
        }
        System.out.println(nextList);
    }
}

