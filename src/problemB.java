// Abstract class
abstract class Adoption {
    abstract void processAdoption();
}

// Subclass implementing the abstract method
class ShelterAdoption extends Adoption {
    String petName;
    String adopterName;

    ShelterAdoption(String petName, String adopterName) {
        this.petName = petName;
        this.adopterName = adopterName;
    }

    @Override
    void processAdoption() {
        System.out.println(petName + " has been successfully adopted by " + adopterName + ".");
    }
}

// Main class
public class problemB {
    public static void main(String[] args) {
        Adoption adoption = new ShelterAdoption("Bella", "Ms. Aswini");
        adoption.processAdoption();
    }
}