package ss.week6;

public class TooFewArgumentsException extends WrongArgumentException {
    private static final long serialVersionUID = 1L;

    public TooFewArgumentsException(String message) {
        super(message);
    }
}
