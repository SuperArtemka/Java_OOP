package Lesson_4.HomeWork.Service;
import Lesson_4.HomeWork.Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{

   private final List<Teacher> teachers;
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }
    private Integer maxTeacherId = 0;
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void initData(List<Teacher> list) {
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String surname, String firstname, String patronymic) {
        Teacher teacher = new Teacher(++maxTeacherId,surname,firstname,patronymic);
        teachers.add(teacher);
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        for (Teacher teacher: teachers) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setSurname(surname);
                teacher.setFirstname(firstname);
                teacher.setPatronymic(patronymic);
            }
        }
    }
    private Integer getNewMaxTeacherId(){
        Integer result = teachers.get(0).getTeacherId();
        for (Teacher teacher: teachers) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }
}