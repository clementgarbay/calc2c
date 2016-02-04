package error;

/**
 * @author Clément Garbay
 */
public class FunctionNotFoundException extends RuntimeException {
    public FunctionNotFoundException(String message) {
        super(message);
    }
}
