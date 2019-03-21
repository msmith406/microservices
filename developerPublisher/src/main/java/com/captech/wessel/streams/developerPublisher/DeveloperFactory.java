package com.captech.wessel.streams.developerPublisher;


import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class DeveloperFactory {

    private String[] names = new String[]{"Chris", "Ben", "Liz", "Melanie"};
    private String[] languages = new String[]{"Java", "JavaScript", "Kotlin", "Go"};
    private Random random = new Random();
    private int i=0, j = 0;

    public Developer build(){
        i = random.nextInt(4);
        j = random.nextInt(4);

        return new Developer(names[i], languages[j]);
    }

}
