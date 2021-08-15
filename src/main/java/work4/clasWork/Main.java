package work4.clasWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

//    private static void example(Pet pet){
//        pet.eat("meat");
//        pet.eat("carrot");
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
List<MenuItem> items = new ArrayList<>();
items.add(new HelloMenuItem());
items.add(new CalcMenuItem(sc));

        Menu menu = new Menu(sc,items);
        menu.run();

//        List<Pet> pets = new ArrayList<>();
//        pets.add(new Cat("vasia"));
//        pets.add(new Pet("petia"));
//        for (Pet pet : pets) {
//            pet.eat("carrot");
//            example(pet);
//        }
//
//        Pet vasia = new Cat("vasia ");
//vasia.sleep();
//vasia.eat("meat");
//vasia.eat("carrot");
////if (vasia instanceof Cat) ((Cat)vasia).purr();
    }
}
