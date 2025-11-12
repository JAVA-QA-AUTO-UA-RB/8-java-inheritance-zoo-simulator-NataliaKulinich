package com.zoo.species;
import com.zoo.animals.Bird;

public class Eagle extends Bird {

    public void makeSound ()
    {   super.makeSound();
    System.out.println(" як ОРЕЛ.... Крііі-крііі"); }

    public void fly()
    {   super.fly();
        System.out.println("Я Орел, тому я літаю дуже довго і високо");
        setEnergyLevel(getEnergyLevel()-5);
        happinessLevel-=1;  }

    public void displayInfo()
    {   super.displayInfo();
        System.out.println ("Вид тварини: Орли");    };

}
