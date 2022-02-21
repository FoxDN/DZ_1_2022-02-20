package com.app;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteValue = 127;
   //     short shortValue = 256;
   //     int intValue = 100;
   //     long longValue = 10000000L;
    //    float floatValue=1000.68523f;
    //    double doubleValue=1000000.68523;
    //    char charValue ='A';

        //long preobrazovaniePervoe =
       // int charToInt = charValue;
       // System.out.println("charToInt "+charToInt);
       // System.out.println("char "+charValue);

        //Автоматические преобразования с потерей точности int в float
        int intValue = 2147483647;
        float floatValue = intValue;
        // 2.14748365E9
        System.out.println("intValue "+intValue);
        System.out.println("floatValue "+floatValue);
// задание 2

        System.out.println("++byteValue " + ++byteValue);


    }
}
