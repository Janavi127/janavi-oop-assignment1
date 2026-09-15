// Custom exception class
class InvalidTrainingLevelException extends Exception {
    InvalidTrainingLevelException(String message) {
        super(message);
    }
}

// Class that validates training level
class TrainingValidator {
    void setTrainingLevel(int level) throws InvalidTrainingLevelException {
        if (level < 1 || level > 10) {
            throw new InvalidTrainingLevelException(
                    "Invalid training level: " + level + ". Must be between 1 and 10.");
        }
        System.out.println("Training level " + level + " accepted.");
    }
}

// Main class
public class problemC {
    public static void main(String[] args) {
        TrainingValidator validator = new TrainingValidator();
        try {
            validator.setTrainingLevel(12); // invalid, out of 1–10 range
        } catch (InvalidTrainingLevelException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            validator.setTrainingLevel(7); // valid
        } catch (InvalidTrainingLevelException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}