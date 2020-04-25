package homework2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException() {
        super("Invalid value in array, required integer");
    }
}

