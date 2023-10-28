package Lesson_4.HomeWork.Controller;
import Lesson_4.HomeWork.Data.Teacher;
import Lesson_4.HomeWork.Service.TeacherService;
import Lesson_4.HomeWork.View.TeacherView;

import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService dataService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String surname, String firstname, String patronymic) {
        dataService.create(surname,firstname,patronymic);
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        dataService.editTeacher(teacherId,surname,firstname,patronymic);
    }
    public void initTeacherList(List<Teacher> list){
        dataService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(dataService.getAll());
    }
}