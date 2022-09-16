import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List of instances
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog", "Shiro", "female", 3));
        animals.add(new Animal("Cat", "Kuro", "male", 5));
        animals.add(new Animal("Racoon", "Rascal", "female", 2));
        animals.add(new Animal("Polar Bear", "Peace", "male", 10));
        animals.add(new Animal("Lion", "Leo", "male", 1));

        //Show animals in the list (Add a note to give milk if age is 2 or less)
        System.out.println("<Animal List>");
        for (Animal animal : animals) {
            System.out.println("Animal Type  : " + animal.getAnimalType());
            System.out.println("Personal Name: " + animal.getPersonalName());
            System.out.println("Gender       : " + animal.getGender());
            System.out.println("Age          : " + animal.getAge() + " year(s) old");
            if (animal.getAge() <= 2) {
                System.out.print("Note         : Give MILK to ");
                if (animal.getGender().equals("male")) {
                    System.out.println("him.");
                } else {
                    System.out.println("her.");
                }
            }
            System.out.println("------------------------------");
        }

    }
}