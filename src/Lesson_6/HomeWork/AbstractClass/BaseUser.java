package Lesson_6.HomeWork.AbstractClass;

import java.time.LocalDate;

public abstract class BaseUser {

    /*
    Принцип инверсии зависимостей реализован следующим образом:
    Созданы абстрактные классы BaseUser & BaseUserGroup, которые не зависят от деталей.
    В абстрактных классах перечислены поля (String firstName, String secondName, String patronymic,
    LocalDate dateOfBirth), которые будут использоваться, а детали реализованы в классах-наследниках (User,
    Student, Teacher). Модули верхних уровней не зависят от модулей нижних уровней.
     */
    String firstName;
    String secondName;
    String patronymic;
    LocalDate dateOfBirth;

    public BaseUser() {
    }
}
