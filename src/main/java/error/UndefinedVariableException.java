package error;

/**
 * @author Clément Garbay
 */
public class UndefinedVariableException extends RuntimeException {
    public UndefinedVariableException(String message) {
        super(message);
    }
}
