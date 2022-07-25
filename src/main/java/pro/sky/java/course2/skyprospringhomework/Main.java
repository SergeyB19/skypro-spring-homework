package pro.sky.java.course2.skyprospringhomework;

import pro.sky.java.course2.skyprospringhomework.controller.domain.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        boolean result = Validator.validate("java_skypro.go","D_1hWiKjjP_9","D_1hWiKjjP_9");
        if (result) {
            System.out.println("Данные корректны!");
        } else {
            System.out.println("Данные не корректны");
        }
        String s = "Иванов Иван Иванович";
        Pattern pattern = Pattern.compile("^([А-я]+) [А-я]+) ([А-я]+)$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            System.out.println(matcher.group(0)); // вся строка
            System.out.println(matcher.group(1)); // фамилия
            System.out.println(matcher.group(2)); // имя
            System.out.println(matcher.group(3)); // отчество
        }
    }

}
