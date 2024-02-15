package ru.gb.oop.hw4;

import java.util.List;

public class Calculator <T>{
    private T n;

    public Calculator() {
    }

    public double sum(List<? extends Number> array) {
        double res = 0;
        for (int i = 0; i < array.size(); i++) {
            res += array.get(i).doubleValue();
        }
        return res;
    }

    public double division(List<? extends Number> array) {
        double res = 1;
        for (int i = 0; i < array.size(); i++) {
            res /= array.get(i).doubleValue();
        }
        return res;
    }

    public double multiply(List<? extends Number> array) {
        double res = 1;
        for (int i = 0; i < array.size(); i++) {
            res *= array.get(i).doubleValue();
        }
        return res;
    }

//  3)расширить класс калькулятор на бинарный перевод(
//ринимаемые значения как стринг, так и инт - тут необходимо подумать как наилучшим
//oбразом реализовать, что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
    public String binaryNum(T num)
    {
        if (num instanceof Integer){
            Integer tempValue = (Integer) num;
            ((Integer) tempValue).doubleValue();
            if(tempValue.equals(num)){
                return Integer.toBinaryString(tempValue);
            }

        }else if(num instanceof String){
            String tempString = (String) num;
            Double.parseDouble(tempString);
            if(num.equals(tempString)){
                return Integer.toBinaryString(Integer.parseInt(tempString));

            }
        }
        return null;

    }


}
