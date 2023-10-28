package Lesson_4.HomeWork.Service;
import Lesson_4.HomeWork.Data.User;

import java.util.List;

public interface UserService<T extends User> {
     List<T> getAll();
     void initData(List<T> list);
     void create(String surname, String firstname, String patronymic);
}