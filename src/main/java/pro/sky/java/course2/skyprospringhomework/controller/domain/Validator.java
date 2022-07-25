package pro.sky.java.course2.skyprospringhomework.controller.domain;

import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongLoginException;
import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongPasswordException;

public class Validator {
    private Validator() {

    }

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void check(String login,
                              String password,
                              String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.isEmpty() || login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть меньше или равна 20");
        }
        if (password == null || password.isEmpty() || password.length() >= 20) {
            throw new WrongPasswordException("Длина пароля должна быть меньше 20");
        }
        if (!Object.equals(password, confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
        Checker checker = new LoopChecker();
        checker.check(login,true);
        checker.check(password,false);
    }
}
