package Exceptions;

//public class PresqueValideException extends RuntimeException {
public class PresqueValideException extends Exception {
    // constructor qui passe un string à l'ancetre qui attend cela
    PresqueValideException (String message) {
        super(message);
    }
}
