package Lesson_4.HomeWork.Data;

import java.util.Comparator;

public class User{
    private String surname;
    private String firstname;
    private String patronymic;

    public User(String surname, String firstname, String patronymic) {
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname(){
        return surname;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getPatronymic(){
        return patronymic;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }

    public static class UserComparator<T extends User> implements Comparator<T> {

        @Override
        public int compare(T arg0, T arg1) {
            String name0 = arg0.getSurname() + arg0.getFirstname() + arg0.getPatronymic();
            String name1 = arg1.getSurname() + arg1.getFirstname() + arg1.getPatronymic();
            return name0.compareToIgnoreCase(name1);
        }

    }
}