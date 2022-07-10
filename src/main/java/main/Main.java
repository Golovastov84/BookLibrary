package main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// https://github.com/Golovastov84/BookLibrary.git

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // первый вариант мавен
//        DbxAppClientV2 clientV2 =
        // Второй вариант
        SpringApplication.run(Main.class, args);

    }
}
