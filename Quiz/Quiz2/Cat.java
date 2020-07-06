/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Cat extends Animal {
    

    private String name;
    
    public Cat(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void introduceYourself(){
        System.out.println(
            "Meow. I am a Cat. My name is " + this.getName());
    }
}

