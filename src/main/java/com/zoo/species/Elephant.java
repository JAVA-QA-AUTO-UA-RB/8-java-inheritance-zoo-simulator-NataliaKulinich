package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant extends Mammal {

    public void spraySelf()
    {   System.out.println("Я- Слон, а слони дуже полюбляють обливатися водою. Буль-буль-буль");
        setEnergyLevel(getEnergyLevel()-10);
        happinessLevel+=1;  }

    public void makeSound ()
    {   super.makeSound();
        System.out.println(" як СЛОН ... Труба-ба-ба");     }

    public void displayInfo()
    {   super.displayInfo();
        System.out.println ("Вид тварини: Слони");     };


}
