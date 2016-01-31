package error;

/**
 * @author Clément Garbay
 */
public class ImmutableException extends RuntimeException {
    public ImmutableException(String message) {
        super(message);
    }
}
