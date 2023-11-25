package Lesson_6.HomeWork;

import Lesson_6.HomeWork.Student.Student;
import Lesson_6.HomeWork.Student.StudentGroup;
import Lesson_6.HomeWork.Teacher.Teacher;
import Lesson_6.HomeWork.Teacher.TeacherComparator;
import Lesson_6.HomeWork.Teacher.TeacherGroup;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Необходимо прокомментировать участки кода, которые рефакторим,
        какой принцип применяем и почему.
         */

        taskFromSem();

        List<Teacher> listT = new ArrayList<>();
        listT.add(new Teacher(
                "Василиса",
                "Премудрая",
                "Ивановна",
                LocalDate.of(1970, 10, 11), 10011));
        listT.add(new Teacher(
                "Белоснежка",
                "Семигномова",
                "Петровна",
                LocalDate.of(1974, 12, 24), 10005));
        listT.add(new Teacher("Забава",
                "Алексеева",
                "Царевна",
                LocalDate.of(1972, 3, 23), 10008));

        Iterator<Teacher> teacherIterator = listT.iterator();
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next().toString());
        }
        TeacherGroup teacherGroup = new TeacherGroup(listT);
        teacherGroup.getTeachers().sort(new TeacherComparator());
        System.out.println(teacherGroup);
    }

    public static void taskFromSem() {
        StudentGroup students = new StudentGroup(List.of(
                new Student(2, "Добрыня", "Красилов", "Никитич",
                        LocalDate.now(), 119),
                new Student(1, "Алеша", "Кузнецов", "Попович",
                        LocalDate.now(), 118),
                new Student(3, "Кощей", "Бессмертный", "Кощеевич",
                        LocalDate.now(),112),
                new Student(4, "Илья", "Муромец", "Иванович",
                        LocalDate.now(), 113),
                new Student(4,"Серафим", "Сорокин", "Леонидович",
                        LocalDate.now(), 110)));

        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }

        List<Student> list = students.getStudents().stream().sorted()
                .collect(Collectors.toList());
        System.out.println(list.toString());
        System.out.println();
    }
}