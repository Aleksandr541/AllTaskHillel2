package work4.clasWork.oop;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pet{
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void sleep(){
        System.out.println("Zzzzzz//");
    }
    public void eat(String food){
        System.out.println(name+"eating "+food);
    }
}

class Cat extends Pet{
    public Cat(String name){
        super(name);
    }
    public void purr(){
        System.out.println("murrr");
    }

    @Override
    public void eat(String food) {
        if (food.equals("carrot")) System.out.println("it s a not food");
        else super.eat(food);
    }
}
public class Main {

        private static void example(Pet pet){
        pet.eat("meat");
        pet.eat("carrot");
    }
    public static void main(String[] args) {
             List<Pet> pets = new ArrayList<>();
        pets.add(new Cat("vasia"));
        pets.add(new Pet("petia"));
        for (Pet pet : pets) {
            pet.eat("carrot");
            example(pet);
        }

        Pet vasia = new Cat("vasia ");
vasia.sleep();
vasia.eat("meat");
vasia.eat("carrot");
//if (vasia instanceof Cat) ((Cat)vasia).purr();
    }
}


