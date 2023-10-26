package Lesson_3.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * представляет поток студентов и содержит поле`streamNumber` - номер потока,
 * и список `groups` - список учебных групп,представленных объектами класса `StudentGroup`.
 *
 */

class StudentStream implements Iterable<StreamComparator> {



    private int streamNumber;

    private List<StreamComparator> groups;



    public StudentStream(int streamNumber) {

        this.streamNumber = streamNumber;

        this.groups = new ArrayList<>();

    }

    /*
     * Метод `addGroup(StudentGroup group)` добавляет группу в список групп потока.
     */

    public void addGroup(StreamComparator group) {

        this.groups.add(group);

    }

    /*
     * Метод `getStreamNumber()` возвращает номер потока, а метод `getGroups()`
     * возвращает список групп.
     */

    public int getStreamNumber() {

        return streamNumber;

    }



    public List<StreamComparator> getGroups() {

        return groups;

    }

    /*
     * Интерфейс `Iterable` был реализован, поэтому в классе `StudentStream` былреализован метод `iterator()`,
     * который возвращает итератор для списка групп.
     */

    public Iterator<StreamComparator> iterator() {

        return groups.iterator();

    }



}

/*
 * Класс `StudentGroup` представляет учебную группу и содержит поля `name` -название группы,
 * и `numberOfStudents` - количество студентов в группе.
 */

class StreamComparator implements Comparable<StreamComparator> {



    private String name;

    private int numberOfStudents;


    public StreamComparator(String name, int numberOfStudents) {

        this.name = name;

        this.numberOfStudents = numberOfStudents;

    }


    /*
     * Метод `compareTo(StudentGroup otherGroup)` реализует метод
     * сравненияобъектов класса `StudentGroup` по количеству студентов.
     */
    public int compareTo(StreamComparator otherGroup) {

        return Integer.compare(this.numberOfStudents, otherGroup.numberOfStudents);

    }

    /*
     * Метод `toString()` возвращает строку с названием группы и количеством студентов.
     */

    public String toString() {

        return "Group " + name + " (" + numberOfStudents + " students)";

    }


}