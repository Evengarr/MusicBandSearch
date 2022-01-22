package ru.project.musicbandsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.project.musicbandsearch.evengarr_test.EvengarrSayHelloTeam;

@SpringBootApplication
public class MusicBandSearchApplication {

    public static void main(String[] args) {
        EvengarrSayHelloTeam.sayHello();
        SpringApplication.run(MusicBandSearchApplication.class, args);
    }

}
