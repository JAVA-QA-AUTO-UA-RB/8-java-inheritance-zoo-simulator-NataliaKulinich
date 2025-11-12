package com.zoo.animals;

public class Mammal extends Animal {

    protected String furColor ;

    public void setMammal (String name, int age, double weight, String furcolor )
    {   setAnimal(name,age,weight);
        this.furColor=furcolor;     }

    public void groom()
    {   System.out.println("В мене тепер таке гарне шутро після грумінгу, дякую,  я такий красивий");
        setEnergyLevel( getEnergyLevel()+15);
        happinessLevel+=1;  }

    public void makeSound ()
    {   super.makeSound();
        System.out.print("Я є Ссавець, тому я видаю звук ссавців ");    }

    public String getFurColor()
    {
        return furColor;
    }
    public void displayInfo()
    {   System.out.print ("Ссавець на ");
        super.displayInfo();
        System.out.println ("Колір хутра : "+ getFurColor());   };
}
