package lesson15;

public class UncurentAgeException extends Exception {
    public UncurentAgeException() {
    }

    public UncurentAgeException(String message) {
        super(message);
    }

    public UncurentAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncurentAgeException(Throwable cause) {
        super(cause);
    }

    public UncurentAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
