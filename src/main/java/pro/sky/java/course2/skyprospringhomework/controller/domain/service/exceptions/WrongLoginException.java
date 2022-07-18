package pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions;

public class WrongLoginException extends Throwable {
    public WrongLoginException(String неверный_логин) {
    }

    public String WrongLoginException() {
        return "WrongLoginException";
    }
}
