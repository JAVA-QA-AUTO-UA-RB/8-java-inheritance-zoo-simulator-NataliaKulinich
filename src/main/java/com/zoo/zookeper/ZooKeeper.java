package com.zoo.zookeper;
import com.zoo.animals.Animal;


public class ZooKeeper {
    // Приватне поле `name`
    //- Методи для догляду за тваринами:
    //    - `public void feedAnimal(Animal animal)`
    //    - `public void playWithAnimal(Animal animal)` -> коли з ними граються, звірята роблять свій звук
    //    - `public void checkAnimalEnergyLevel(Animal animal)` -> повертає для звіряти рівень його енергії:
    //    якщо енергія від 0 до 30 - низький, якщо від 31 до 70 середній, якщо від 71 до 100 високий
  private String name;

  public String getNameZooKeeper ()
  {
      return name;
  }

  public void setZooKeeper ( String name)
  { this.name=name;}

  public void feedAnimal(Animal animal)
  {
      System.out.println("Час годування. Я приніс тобі багато смачненького");
      animal.eat();
  }

    public void playWithAnimal(Animal animal)
    {
        System.out.println("Давай гратися");
        animal.makeSound();

    }
    public void checkAnimalEnergyLevel(Animal animal)
    {
        if (animal.getEnergyLevel()<=0)
        {System.out.println("Вибач, я дуже втомився і мені потрібно поспати. Після сну покорми мене");
        animal.sleep();
        feedAnimal(animal);
        }
           else if (animal.getEnergyLevel()<=30)
        {  System.out.println("У тваринки низкий рівень енергії "+ animal.getEnergyLevel());        }
              else if ((animal.getEnergyLevel()>30) && (animal.getEnergyLevel()<=70))
                    {
                        System.out.println("У тваринки середній рівень енергії "+ animal.getEnergyLevel());
                    }
                  else {
                       System.out.println("У тваринки високий рівень енергії "+ animal.getEnergyLevel());
                        }
    }


}
