package Lesson_5.HomeWork.View;

import Lesson_5.HomeWork.Model.User;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}
