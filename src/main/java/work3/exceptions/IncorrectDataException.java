package work3.exceptions;

public class IncorrectDataException extends RuntimeException{
    public IncorrectDataException(String message) {
        System.out.println(message);
    }
}
