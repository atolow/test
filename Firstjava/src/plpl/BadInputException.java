package plpl;

public class BadInputException extends Exception {
    public BadInputException(String type) {
        super(type);
    }
}
