package Lesson_4.HomeWork.View;

import Lesson_4.HomeWork.Data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}