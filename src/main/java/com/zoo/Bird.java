package com.zoo.animals;

public class Bird extends Animal {

    protected double wingSpan;

    public void makeSound()
    {   super.makeSound();
        System.out.print ("Я є Птахом, тому я видаю звук птахів ");    }

    // створюємо птаха
    public void setBird (String name, int age, double weight,double wingSpan )
    {   setAnimal(name,age,weight);
        this.wingSpan=wingSpan;     }

    public void fly()
    {   System.out.println("Я -літаю");
        setEnergyLevel( getEnergyLevel()-15);
        happinessLevel+=1;  }

    public double getWingSpan()
    {   return wingSpan; }

    public void displayInfo()
    {   System.out.print ("Птах на ");
        super.displayInfo();
        System.out.println ("Розмах крил : "+ getWingSpan());     };

}
