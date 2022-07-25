package pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}
