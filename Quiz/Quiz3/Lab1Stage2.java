/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Lab1Stage2{

    public static void main(String[] args){

        Animal kurre = new Cat("Kurre");
        Animal vilma = new Dog("Vilma");
        
        kurre.age = 6;
        vilma.age = 3;
        
        kurre.introduceYourself();
        vilma.introduceYourself();
    }
}