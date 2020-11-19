/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author duvan, andres bernal
 */
public class Logica {
    
    //Se crean listas para guardar todos los datos en 2D que sean ingresados
    List<Figuras2D> figura2 =new ArrayList<Figuras2D>();
    //Se crean listas para guardar todos los datos en 3D que sean ingresados
    List<Figuras3D> figura3 =new ArrayList<Figuras3D>();
    //funcion para capturar por teclado los datos solicitados
    Scanner sc = new Scanner(System.in);

    /**
     * Contructor principal de la clase
     */
    public Logica() {
        menu();
    }
    /**
     * metodo que aparecerá al inicio de la ejecucion del programa 
     */
    public void menu(){
        int opcion = 0;
        do{
            System.out.println("\t\nBienvenido");
            System.out.println("1. Agregar Figura en 2D");
            System.out.println("2. Agregar Figura en 3D");
            System.out.println("3. Listar todo");
            System.out.println("4. Salir.");   
            System.out.println("\nIngrese una opcion de las siguientes por favor: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    ingresar2D();
                break;
                case 2:
                    ingresar3D();
                break;
                case 3: 
                    mostrar2D();
                    mostrar3D();
                break;
                case 4: 
                    System.out.println("Gracias...");
                    System.exit(0);
                break;
                default:
                    System.out.println("Opcion no valida...");
                break;
            }
        }
        while(opcion != 4);
    }
    /**
     * Metodo que sirve para que el usuario escoja que tipo de figuras en 2D desea ingresar
     */
    public void ingresar2D(){
        int opcion = 0;
        do{
            System.out.println("\t\nEsta agregando figuras en 2D");
            System.out.println("1. Agregar Circulo");
            System.out.println("2. Agregar Cuadrado");
            System.out.println("3. Agregar Triangulo");
            System.out.println("4. Volver al menu anterior");   
            System.out.println("\nIngrese una opcion de las siguientes por favor: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1: 
                    ingresarCirculo();
                break;
                case 2:
                    ingresarCuadrado();
                break;
                case 3: 
                    ingresarTriangulo();
                break;
                case 4:
                    menu();
                break;
                default:
                    System.out.println("Opcion no valida...");
                break;
            }
        }
        while(opcion != 4);
    }
    /**
     * Metodo que sirve para que el usuario escoja que tipo de figuras en 2D desea ingresar
     */
    public void ingresar3D(){
        int opcion = 0;
        do{
            System.out.println("\t\nEsta agregando figuras en 3D");
            System.out.println("1. Agregar Cubo");
            System.out.println("2. Agregar Piramide");
            System.out.println("3. Agregar Esfera");
            System.out.println("4. Volver al menu anterior");   
            System.out.println("\nIngrese una opcion de las siguientes por favor: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1: 
                    ingresarCubo();
                break;
                case 2: 
                    ingresarPiramide();
                break;
                case 3: 
                    ingresarEsfera();
                break;
                case 4: 
                    menu();
                break;
                default:
                    System.out.println("Opcion no valida...");
                break;
            }
        }
        while(opcion != 4);
    }
    /**
     * Metodo que sirve para ingresar un nuevo circulo
     */
    public void ingresarCirculo()
    {
        int radio;
        System.out.println("\nPor favor ingrese el radio del circulo");
        radio = sc.nextInt();
        Figuras2D circulo = new Circulo(radio);
        circulo.hallarPerimetro();
        circulo.imprimir();
        figura2.add(circulo);
    }
    /**
     * Metodo que sirve para ingresar un nuevo cuadrado
     */
    public void ingresarCuadrado()
    {
        int lado;
        int lado1;
        System.out.println("\nPor favor ingrese el primer lado del cuadrado");
        lado = sc.nextInt();
        System.out.println("\nPor favor ingrese el segundo lado del cuadrado");
        lado1 = sc.nextInt();
        Figuras2D cuadrado = new Cuadrado(lado,lado1);
        cuadrado.hallarPerimetro();
        cuadrado.imprimir();
        figura2.add(cuadrado);
    }
    /**
     * Metodo que sirve para ingresar un nuevo triangulo
     */
    public void ingresarTriangulo()
    {
        int lado1;
        int lado2;
        int lado3;
        System.out.println("\nPor favor ingrese el primer lado del triangulo");
        lado1 = sc.nextInt();
        System.out.println("\nPor favor ingrese el segundo lado del triangulo");
        lado2 = sc.nextInt();
        System.out.println("\nPor favor ingrese el tercer lado del triangulo");
        lado3 = sc.nextInt();
        Figuras2D triangulo = new Triangulo(lado1,lado2, lado3);
        triangulo.hallarPerimetro();
        triangulo.imprimir();
        figura2.add(triangulo);
    }
    /**
     * Metodo que sirve para ingresar un nuevo cubo
     */
    public void ingresarCubo()
    {
        int area;
        int area1;
        int area2;
        System.out.println("\nPor favor ingrese la primer area del cubo");
        area = sc.nextInt();
        System.out.println("\nPor favor ingrese la segunda area del cubo");
        area1 = sc.nextInt();
        System.out.println("\nPor favor ingrese la tercer area del cubo");
        area2 = sc.nextInt();
        Figuras3D cubo = new Cubo(area, area1, area2);
        cubo.hallarPerimetro();
        cubo.imprimir();
        figura3.add(cubo);
    }
    /**
     * Metodo que sirve para ingresar una nueva piramide
     */
    public void ingresarPiramide()
    {
        int base;
        int altura;
        System.out.println("\nPor favor ingrese la base de la piramide");
        base = sc.nextInt();
        System.out.println("\nPor favor ingrese la altura de la piramide");
        altura = sc.nextInt();
        Figuras3D piramide = new Piramide(base,altura);
        piramide.hallarPerimetro();
        piramide.imprimir();
        figura3.add(piramide);
    }
    /**
     * Metodo que sirve para ingresar una nueva esfera
     */
    public void ingresarEsfera()
    {
        int radio;
        System.out.println("\nPor favor ingrese el radio de la esfera");
        radio = sc.nextInt();
        Figuras3D esfera = new Esfera(radio);
        esfera.hallarPerimetro();
        esfera.imprimir();
        figura3.add(esfera);
    }

}
