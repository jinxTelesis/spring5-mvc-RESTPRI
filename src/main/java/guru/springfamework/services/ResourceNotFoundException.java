package guru.springfamework.services;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(){

    }

    public ResourceNotFoundException(String message){
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause){
        super(message,cause);
    }

    public ResourceNotFoundException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace){
        super(message, cause, enableSupression, writableStackTrace);
    }
}
