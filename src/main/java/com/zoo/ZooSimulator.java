package com.zoo;

import com.zoo.animals.Bird;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;
import com.zoo.animals.Animal;
import com.zoo.species.Penguin;
import com.zoo.zookeper.ZooKeeper;
import java.util.Scanner;

public class ZooSimulator {
    public static void main(String[] args) {

        Lion lion = new Lion ();
        Eagle eagle= new Eagle();
        Penguin penguin=new Penguin();
        Elephant  elephant=new Elephant();
        ZooKeeper zooKeeper = new ZooKeeper();

        // створюємо наш зоопарк
        zooKeeper.setZooKeeper("Мах");
        lion.setMammal("Сімба", 3,60.57,"бежевий");
        elephant.setMammal("Дамбо", 7,1560,"сірий");
        eagle.setBird("Тарас",2,3.5,157);
        penguin.setBird("Григорій",3,31.3,83);

        System.out.println ("Вітаю у нашому зоопарку. Я - "+zooKeeper.getNameZooKeeper()+ ", я познайомлю вас з нашими тваринами і ми добре проведемо час з ними");
        System.out.println ("В нашому зоопарку є такі звірятки: 1- Лев, 2- Слон, 3- Пінгвін, 4- Орел");

        Scanner sc = new Scanner(System.in);
        int choice1;
        int choice2;

        do {
            System.out.println ("Оберіть ту тварину, до якої ми підемо (цифра 1-4 або 0- вихід)");
            choice1 = sc.nextInt();

            switch (choice1) {
                case 1 ->
                {
                    System.out.println("Тож йдемо до нашого красунчика ЛЕВа, якого звуть "+ lion.getAnimalName());
                    System.out.println("Трохи інформації про нього");
                    lion.displayInfo();

                    do {
                        if (lion.getEnergyLevel()<=0) {
                            lion.sleep();
                            System.out.println("Було б добре, щоб ти нагодував мене, я б тоді щвидше став би енергійним");
                        }
                        System.out.println("Як ви хочете провести час з "+lion.getAnimalName()+" ? Оберіть:");
                        System.out.println("1-Послухати голос Лева");
                        System.out.println("2-Покормити");
                        System.out.println("3-Подивитись полювання");
                        System.out.println("4-Повичісувати йому шорстку та зробити зіркову зачіску");
                        System.out.println("5-Погратися");
                        System.out.println("6-Дізнатися рівень енергії");
                        System.out.println("7-Заспівати колискову та дати Леву поспати");
                        System.out.println("0-Попрощатися та піти до іншої тваринки");
                        choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1 -> lion.makeSound();
                            case 2 -> zooKeeper.feedAnimal(lion);
                            case 3 -> lion.hunt();
                            case 4 -> lion.groom();
                            case 5 -> zooKeeper.playWithAnimal(lion);
                            case 6 -> zooKeeper.checkAnimalEnergyLevel(lion);
                            case 7 -> lion.sleep();
                            default -> System.out.println("До побачення "+lion.getAnimalName());
                        }
                    } while ( choice2!=0 );

                }
                case 2 ->
                {
                    System.out.println("Тож йдемо до нашого красунчика СЛОНа, якого звуть "+ elephant.getAnimalName());
                    System.out.println("Трохи інформації про нього");
                    elephant.displayInfo();

                    do {
                        if (elephant.getEnergyLevel()<=0) {
                            elephant.sleep();
                            System.out.println("Було б добре, щоб ти нагодував мене, я б тоді щвидше став би енергійним");
                        }
                        System.out.println("Як ви хочете провести час з "+elephant.getAnimalName()+" ? Оберіть:");
                        System.out.println("1-Послухати голос Слона");
                        System.out.println("2-Покормити");
                        System.out.println("3-Подивитись купання");
                        System.out.println("4-Почистити йому шкіру та зробити педикюр ");
                        System.out.println("5-Погратися");
                        System.out.println("6-Дізнатися рівень енергії");
                        System.out.println("7-Заспівати колискову та дати Слону поспати");
                        System.out.println("0-Попрощатися та піти до іншої тваринки");
                        choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1 -> elephant.makeSound();
                            case 2 -> zooKeeper.feedAnimal(elephant);
                            case 3 -> elephant.spraySelf();
                            case 4 -> elephant.groom();
                            case 5 -> zooKeeper.playWithAnimal(elephant);
                            case 6 -> zooKeeper.checkAnimalEnergyLevel(elephant);
                            case 7 -> elephant.sleep();
                            default -> System.out.println("До побачення "+elephant.getAnimalName());
                        }
                    } while ( choice2!=0 );
                }
                case 3 ->
                {
                    System.out.println("Тож йдемо до нашого веселого Пінгвіна, якого звуть "+ penguin.getAnimalName());
                    System.out.println("Трохи інформації про нього");
                    penguin.displayInfo();

                    do {
                        if (penguin.getEnergyLevel()<=0) {
                            penguin.sleep();
                            System.out.println("Було б добре, щоб ти нагодував мене, я б тоді щвидше став би енергійним");
                        }
                        System.out.println("Як ви хочете провести час з "+penguin.getAnimalName()+" ? Оберіть:");
                        System.out.println("1-Послухати голос Пінгвіну");
                        System.out.println("2-Покормити");
                        System.out.println("3-Подивитись його плавання");
                        System.out.println("4-Погратися");
                        System.out.println("5-Заспівати колискову та дати йому поспати");
                        System.out.println("6-Дізнатися рівень енергії");
                        System.out.println("0-Попрощатися та піти до іншої тваринки");
                        choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1 -> penguin.makeSound();
                            case 2 -> zooKeeper.feedAnimal(penguin);
                            case 3 -> penguin.fly();
                            case 4 -> zooKeeper.playWithAnimal(penguin);
                            case 5 -> penguin.sleep();
                            case 6 -> zooKeeper.checkAnimalEnergyLevel(penguin);
                            default -> System.out.println("До побачення "+penguin.getAnimalName());
                        }
                    } while ( choice2!=0 );
                }
                case 4 ->
                {
                    System.out.println("Тож йдемо до нашого величного ОРЛа, якого звуть "+ eagle.getAnimalName());
                    System.out.println("Трохи інформації про нього");
                    eagle.displayInfo();

                    do {
                        if (eagle.getEnergyLevel()<=0) {
                            eagle.sleep();
                            System.out.println("Було б добре, щоб ти нагодував мене, я б тоді щвидше став би енергійним");
                        }
                        System.out.println("Як ви хочете провести час з "+penguin.getAnimalName()+" ? Оберіть:");
                        System.out.println("1-Послухати крик Орла");
                        System.out.println("2-Покормити");
                        System.out.println("3-Подивитись його політ");
                        System.out.println("4-Погратися");
                        System.out.println("5-Заспівати колискову та дати йому поспати");
                        System.out.println("6-Дізнатися рівень енергії");
                        System.out.println("0-Попрощатися та піти до іншої тваринки");
                        choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1 -> eagle.makeSound();
                            case 2 -> zooKeeper.feedAnimal(eagle);
                            case 3 -> eagle.fly();
                            case 4 -> zooKeeper.playWithAnimal(eagle);
                            case 5 -> eagle.sleep();
                            case 6 -> zooKeeper.checkAnimalEnergyLevel(eagle);
                            default -> System.out.println("До побачення "+eagle.getAnimalName());
                        }
                    } while ( choice2!=0 );
                }
                default -> {System.out.println("Дуже шкода, що ви нас покидаєте, але думаємо що ви провели чудовий день у нашому зоопарку. Всього найкращого. Приходьте ще");}
            }
        } while ( choice1!=0 );

      lion.stat();
      elephant.stat();
      penguin.stat();
      eagle.stat();

    }
}
