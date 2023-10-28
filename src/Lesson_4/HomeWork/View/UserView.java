package Lesson_4.HomeWork.View;

import Lesson_4.HomeWork.Data.User;

import java.util.List;

public interface UserView<T extends User> {
     void sendOnConsole(List<T> list);
}