package com.valerastudy;

public class Example01Main {

    public static void main(String[] args) {
//        Exemplu de POLIMOFISM SI INVERSARE DE CONTROL

        method01();  // direct
        method02();  // polimorfism
        method03();  // inversie de control 1
        method04();  // inversie de control 2

    }

    private static void method01(){
        /*
            Apelarea functiei draw() direct prin declararea de obiecte de clase mostenitoare
        */

        System.out.println("Exemplu 1: Apelare directa");
        Triangle triangle = new Triangle();
        triangle.draw();

        Circle circle = new Circle();
        circle.draw();

    }

    private static void method02(){
        /*
            Apelarea functiei draw() prin obiectu de clasa parinte Polimorfism
        */

        System.out.println("Exemplu 2: Polimorfism");
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

    }

    private static void method03(){
        /*
            Apelarea functiei draw() prin functia myDrowMethod - inverstie de control
        */

        System.out.println("Exemplu 3: Inversie de control 1");
        Shape shape = new Triangle();
        myDrawMethod(shape);

        shape = new Circle();
        myDrawMethod(shape);

    }

    private static void method04(){
        /*
            Apelarea functiei draw() prin functia drawShape din clasa Drawind - inverstie de control
        */

        System.out.println("Exemplu 4: Inversie de control 2");
        Drawing drawing = new Drawing();

        // aici se poate de facut shi mai interesant
        // de facut o noua metoda care va primi shape si va crea singura drawing si il va si desena
        // in locul celor 2 rinduri care se repeta
        
        Shape shape = new Triangle();
        drawing.setShape(shape);
        drawing.drawShape();

        shape = new Circle();
        drawing.setShape(shape);
        drawing.drawShape();

    }

    public static void myDrawMethod(Shape shape){

        shape.draw();

    }

}
