package pro.sky.java.course2.skyprospringhomework.controller.domain;

import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongLoginException;
import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongPasswordException;

public class RegexpChecker implements Checker{
    @Override
    public void check(String s, boolean login) throws WrongLoginException, WrongPasswordException {

    }
        if (!s.matches("^\\w{1,20}$")) {
            if (login)
                throw new WrongLoginException("Логин должен содержать только символы латинского алфавита, цифры, или знак подчеркивания");
            else {
                throw new WrongPasswordException("Пароль должен содержать только символы латинского алфавита, цифры, или знак подчеркивания");
            }
    }
}
