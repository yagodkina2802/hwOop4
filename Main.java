package ru.gb.oop.hw4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Написать класс калькулятор,
// принимающий List целочисленных
// значений, возвращающий сумму
// элементов коллекции (метод sum)
//1)расширить класс калькулятор на умножение
// 2)расширить класс калькулятор на деление
// 3)расширить класс калькулятор на бинарный перевод(
//ринимаемые значения как стринг, так и инт - тут необходимо подумать как наилучшим
//oбразом реализовать, что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 57, 88, 33, 44, 55));
        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(array) = " + calculator.sum(array));
        List<Double> array1 = new ArrayList<>(Arrays.asList(4.0, 5.7, 78.0, 44.0));
        System.out.println("calculator.sum(array1) = " + calculator.sum(array1));
        System.out.println("calculator.division(array) = " + calculator.division(array));
        System.out.println("calculator.division(array1) = " + calculator.division(array1));
        System.out.println("calculator.multiply(array) = " + calculator.multiply(array));
        System.out.println("calculator.multiply(array1) = " + calculator.multiply(array1));
        System.out.println("calculator.binaryNum(5) = " + calculator.binaryNum(5));
        System.out.println("calculator.binaryNum(\"5\") = " + calculator.binaryNum("5"));
    }
}
