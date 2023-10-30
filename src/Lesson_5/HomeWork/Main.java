package Lesson_5.HomeWork;

import Lesson_5.HomeWork.Controller.Controller;
import Lesson_5.HomeWork.Model.Student;
import Lesson_5.HomeWork.Model.StudentGroup;
import Lesson_5.HomeWork.View.StudentGroupView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("lkklk", "iuiuu","shfkjs");
        controller.createStudent("popo", "pooop","jncmvn");
        controller.createTeacher("sjfhj", "sjfjk","jsfjk");
        controller.createStudent("usfhk", "ureuue","sdjhfjksdf");
        System.out.println("---------------");
        controller.getAllStudents();
        System.out.println("---------------");
        controller.getAllTeachers();



    }
}