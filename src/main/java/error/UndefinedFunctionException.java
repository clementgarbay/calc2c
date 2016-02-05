package error;

/**
 * @author Clément Garbay
 */
public class UndefinedFunctionException extends RuntimeException {
    public UndefinedFunctionException(String message) {
        super(message);
    }
}
