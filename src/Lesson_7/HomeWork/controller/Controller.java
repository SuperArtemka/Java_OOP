package Lesson_7.HomeWork.controller;

import Lesson_7.HomeWork.interfaceCalculate.CalcInterfaceImpl;
import Lesson_7.HomeWork.models.Calculate;

import java.io.IOException;

public class Controller {
    CalcInterfaceImpl calc;

    public Controller() throws IOException {
        this.calc = new CalcInterfaceImpl();
    }

    public double inputAToFirst() {
        return Calculate.inputAToFirst();
    }

    public double inputBbToFirst() {
        return Calculate.inputBbToFirst();
    }

    public double inputCToSecond() {
        return Calculate.inputCToSecond();
    }

    public double inputDToSecond() {
        return Calculate.inputDToSecond();
    }

    public void addition(double a, double b, double c, double d) {
        calc.addition(a, b, c, d);
    }

    public void subtraction(double a, double b, double c, double d) {
        calc.substraction(a, b, c, d);
    }

    public void multiplication(double a, double b, double c, double d) {
        calc.multiplication(a, b, c, d);
    }

    public void division(double a, double b, double c, double d) {
        calc.division(a, b, c, d);
    }

}
