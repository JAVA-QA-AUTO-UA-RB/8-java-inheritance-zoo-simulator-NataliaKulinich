package com.zoo.animals;

public class Animal {

     protected String name;
     protected int age;
     protected double weight;
     private int energyLevel=100;
     int numberEat =0;
     int numberSleep=0;
     int numberMakeSound=0;
     public int happinessLevel=10;

    public void eat()
    {   System.out.println ("Я смачненько поїв. Дякую. Рівень моєї енергії зріс");
        energyLevel+=20;
        happinessLevel+=1;
        numberEat+=1;    };
    //    - `public void sleep()` - збільшує енергію на 30
    public void sleep()
    {   System.out.println ("Я дуже втомився і мені потрібно поспати. Я сплюююю. Хррап-Хррап-хррап. Рівень моєї енергії зростає під час сну");
        energyLevel+=30;
        happinessLevel+=1;
        numberSleep+=1;    };

    public void makeSound()
    {    System.out.print ("Тваринки видають різні звуки.");
         numberMakeSound+=1;
         happinessLevel-=1;     }

    public  void setAnimal ( String name, int age, double weight)
    {   this.name=name;
        this.age=age;
        this.weight=weight;         }

    public void setEnergyLevel( int energyLevel)
    {  this.energyLevel=energyLevel;  };

    public String getAnimalName() { return name; }
    public int getAge() { return age;}
    public double getWeight()  { return weight; }
    public int getEnergyLevel() { return energyLevel;  }
    public int getHappinessLevel() { return happinessLevel;  }

    //    - `public void displayInfo()` - виводить інформацію про тварину
     public void displayInfo()
    {
        System.out.println ("Ім'я: "+ getAnimalName());
        System.out.println ("Вага: "+ getWeight());
        System.out.println ("Вік (років): "+ getAge());
        System.out.println ("Рівень енергії: "+ getEnergyLevel());
        System.out.println ("Рівень щастя: "+ happinessLevel);   };

    public void stat ()
    {
        System.out.println ("Статистика по діям тваринки: "+ getAnimalName());
        System.out.println ("Поїв: "+ numberEat + " разів");
        System.out.println ("Поспав "+ numberSleep +" разів");
        System.out.println ("Видав звуки "+ numberMakeSound + " разів");
        System.out.println ("Рівень енергії "+ getEnergyLevel());
        System.out.println ("Рівень щастя (від 0 до 10) "+ getHappinessLevel());
    };
}
