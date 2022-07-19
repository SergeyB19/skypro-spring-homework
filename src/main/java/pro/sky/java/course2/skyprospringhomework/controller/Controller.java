package pro.sky.java.course2.skyprospringhomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.skyprospringhomework.controller.domain.service.StartPageService;
import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongLoginException;
import pro.sky.java.course2.skyprospringhomework.controller.domain.service.exceptions.WrongPasswordException;

import static org.apache.coyote.http11.Constants.a;

@RestController
public class Controller {
    private final StartPageService startPageService;

    public Controller(StartPageService startPageService) {
        this.startPageService = startPageService;
    }

    @GetMapping("/login")
    public static void login(@RequestParam(name = "login") String a) throws WrongLoginException {
        if (a <= 20) {
            throw new WrongLoginException("Неверный логин");
            try {
                login(a);

            } catch (WrongLoginException) {
                return;
            } finally {
                System.out.println("Проверка завершена");
            }
        }


        @GetMapping("/password ")
        public static void login (@RequestParam(name = "password ") String a) throws WrongPasswordException {
            if ( a <= 20;){
                throw new WrongPasswordException("Неверный пароль");
            }
            try {
                login();

            } catch (WrongLoginException) {
                return;
            } finally {
                System.out.println("Проверка завершена");
            }
        }
            @GetMapping("/confirmPassword ")
            public static void login (@RequestParam(name = "confirmPassword") String a) throws WrongPasswordException {
                if ( a <= 20;){
                    throw new WrongPasswordException("Неверный пароль");
                } try {
                login();

            } catch (WrongLoginException) {
            } finally {
                System.out.println("Проверка завершена");
            }
            }
        }
    }


