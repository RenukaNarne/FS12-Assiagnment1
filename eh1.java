public class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }

    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            int userInput = -5; 
            validateNumber(userInput);
            System.out.println("Input is valid");
        } catch (CustomValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}