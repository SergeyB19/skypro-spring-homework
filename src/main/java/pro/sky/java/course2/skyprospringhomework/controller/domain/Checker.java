package pro.sky.java.course2.skyprospringhomework.controller.domain;

import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongLoginException;
import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongPasswordException;

public interface Checker {
    void check(String s, boolean login) throws WrongLoginException, WrongPasswordException;
}
