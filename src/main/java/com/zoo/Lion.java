package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion extends Mammal {

    public void makeSound ()
    {   super.makeSound();
        System.out.println("як справжній ЛЕВ ... Ppppp");    }

    public void hunt ()
    {   System.out.println("Ттсссс. Не заважай.Я вийшов на полювання");
        setEnergyLevel( getEnergyLevel()-25);
        happinessLevel-=1;  }

    public void displayInfo()
    {   super.displayInfo();
        System.out.println ("Вид тварини: Леви");     };

}
