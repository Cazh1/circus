package circus;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("number of animals in the array: " + animals.length);
        //animals[2] = new Elephant ("StrongOne");
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        System.out.println("Size of the animal array list: " + animalArrayList.size());
        Elephant andy = new Elephant("Andy");
        Tiger sharKhan = new Tiger("Sher Khan");
        Duck louie = new Duck("Louie");
        Duck dewey = new Duck("Dewey");
        Parrot birdie = new Parrot("Birdie");
        animalArrayList.add(andy);
        animalArrayList.add(sharKhan);
        animalArrayList.add(louie);
        animalArrayList.add(dewey);
        animalArrayList.add(birdie);
        System.out.println("Size of the animal array list after adding: " + animalArrayList.size());

        System.out.println("Before sotring ...");
        for (Animal animal : animalArrayList) {
            System.out.println(animal);
        }

        System.out.println("Louie is at: " + animalArrayList.indexOf(louie));
        animalArrayList.sort(Animal.AnimalNameComparator);
        System.out.println("After sorting ...");
        for (Animal animal : animalArrayList) {
            System.out.println(animal);
        }

        /*makeAnimalsTalk();
        System.out.println("Total value of animals " + calculateAssetValue(animals));
        System.out.println("Total value of equipments " + calculateAssetValue(equipments));*/
    }
}
