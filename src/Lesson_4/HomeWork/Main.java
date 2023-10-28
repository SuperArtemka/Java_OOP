package Lesson_4.HomeWork;

import Lesson_4.HomeWork.Controller.TeacherController;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Ivan", "Ivanov", "Ivanovich");
        teacherController.create( "Petr", "Petrov","Petrovich");
        teacherController.create( "Ralf", "Ringer","Ich");
        teacherController.create( "Gendolf", "Seruy","Hobbitovich");
        teacherController.printTeachers();
    }
}
