package Lesson_4.HomeWork.Controller;

import Lesson_4.HomeWork.Data.User;

public interface UserController<T extends User> {
    void create(String surname, String firstname, String patronymic);
}
