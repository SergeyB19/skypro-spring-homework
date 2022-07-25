package pro.sky.java.course2.skyprospringhomework.controller.domain;

import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongLoginException;
import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongPasswordException;

public class LoopChecker implements Checker {
    private static final String ALLOWED_CHARACTERS = "0123456789_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    @Override
   public void check(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        for (int i = 0; i < s.length(); i++) {
            if (!ALLOWED_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                if (login) {
                    throw new WrongLoginException("Логин должен содержать только символы латинского алфавита, цифры, или знак подчеркивания");
                } else {
                    throw new WrongPasswordException("Пароль должен содержать только символы латинского алфавита, цифры, или знак подчеркивания");
                }
            }
        };
    }
}
