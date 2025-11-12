package com.zoo.species;

import com.zoo.animals.Bird;

public class Penguin extends Bird {

    public void makeSound ()
    {   super.makeSound();
        System.out.println(" як Пінгвін ... Кря-кря");    }

    public void swim ()
    {   System.out.println("Я -Пінгвін і я не вмію літати, але чудово плаваю");
        setEnergyLevel( getEnergyLevel()-17);
        happinessLevel-=1;  }

    @Override
    public void fly()
    {     swim();      }

    public void displayInfo()
    {   super.displayInfo();
        System.out.println ("Вид тварини: Пінгвіни");     };

}
