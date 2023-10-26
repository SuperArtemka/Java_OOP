package Lesson_3.HomeWork;

import java.util.Collections;

/*
 * В методе `main` создается объект `stream` класса `StudentStream` с номеромпотока 1.
 * Затем создаются три объекта `group1`, `group2`, `group3` класса`StudentGroup` с разным количеством студентов,
 * и каждая группа добавляется всписок групп потока.
 */

public class Main {


    public static void main(String[] args) {

        StudentStream stream = new StudentStream(1);


        StreamComparator group1 = new StreamComparator("Group 1", 20);

        StreamComparator group2 = new StreamComparator("Group 2", 15);

        StreamComparator group3 = new StreamComparator("Group 3", 10);

        stream.addGroup(group1);

        stream.addGroup(group2);

        stream.addGroup(group3);

        /*
         * Цикл `for` используется для вывода списка групп на консоль,
         * а после этогосписок сортируется методом `sort` класса `Collections`, используя интерфейс`Comparable`.
         */

        for (StreamComparator group : (stream)) {

            System.out.println(group);

        }
        System.out.println("-----------------------------");

        Collections.sort(stream.getGroups());

        for (StreamComparator group : stream) {

            System.out.println(group);

        }

    }

    /*
     * После сортировки группы выводятся на консоль в отсортированном порядке.
     */
}
