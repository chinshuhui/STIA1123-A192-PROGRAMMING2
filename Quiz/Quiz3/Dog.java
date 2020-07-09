/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Dog extends Animal {
   
    private String name;
    
    public Dog(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Dog (int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    @Override
    public void introduceYourself(){
        System.out.println("Woof. I am a Dog. My name is " + this.getName());
        System.out.println("and I am " + this.age + " years old.");
    }
}
