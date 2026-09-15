// Superclass
class Pet {
    String name;
    String species;

    // Constructor
    Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Method to display pet details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
    }
}

// Subclass
class ServiceDog extends Pet {
    int trainingLevel;

    // Constructor
    ServiceDog(String name, String species, int trainingLevel) {
        super(name, species); // Call to Pet's constructor
        this.trainingLevel = trainingLevel;
    }

    // Overridden display method
    @Override
    void display() {
        super.display(); // Call to Pet's display
        System.out.println("Training Level: " + trainingLevel);
    }
}

// Main class
public class problemA {
    public static void main(String[] args) {
        ServiceDog dog = new ServiceDog("Rex", "Dog", 8);
        dog.display();
    }
}
