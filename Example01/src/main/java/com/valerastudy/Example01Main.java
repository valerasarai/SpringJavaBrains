package com.valerastudy;

public class Example01Main {

    public static void main(String[] args) {
//        Exemplu de POLIMOFISM SI INVERSARE DE CONTROL

        method01();  // direct
        method02();  // polimorfism


    }

    public static void method01(){
        /*
            Apelarea functiei dor() direct prin declararea de obiecte de clase mostenitoare
        */

        System.out.println("Exemplu 1: Apelare directa");
        Triangle triangle = new Triangle();
        triangle.drow();

        Circle circle = new Circle();
        circle.drow();

    }

    public static void method02(){
        /*
            Apelarea functiei dor() prin obiectu de clasa parinte Polimorfism
        */

        System.out.println("Exemplu 2: Polimorfism");
        Shape triangle = new Triangle();
        triangle.drow();

        Shape circle = new Circle();
        circle.drow();

    }

    public static void method03(){
        /*
            Apelarea functiei dor() prin functia myDrow - inverstie de control
        */

        System.out.println("Exemplu 3: Inversie de control");
        Shape triangle = new Triangle();

        Shape circle = new Circle();
        circle.drow();

    }

}
