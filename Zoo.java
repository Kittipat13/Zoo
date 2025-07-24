import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> zooAnimals = new ArrayList<>();

        zooAnimals.add(new Lion("Love"));
        zooAnimals.add(new Eagle("Egg"));
        zooAnimals.add(new Penguin("Pie"));
        zooAnimals.add(new Dolphin("Donuts"));

        // พฤติกรรมร่วม (เสียงร้อง)
        System.out.println("=== Animal Sounds ===");
        for (Animal animal : zooAnimals) {
            System.out.println(animal.getName() + " says: " + animal.makeSound());
        }

        // ความสามารถพิเศษ
        System.out.println("\n=== Special Abilities ===");
        for (Animal animal : zooAnimals) {
        boolean didSomething = false;

        if (animal instanceof Flyable) {
            System.out.println(animal.getName() + " can fly: " + ((Flyable) animal).fly());
            didSomething = true;
        }
        if (animal instanceof Swimmable) {
            System.out.println(animal.getName() + " can swim: " + ((Swimmable) animal).swim());
            didSomething = true;
        }
        if (!didSomething) {
            System.out.println(animal.getName() + " walks on land.");
        }
    }
  }
}
