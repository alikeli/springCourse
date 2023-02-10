package org.liza.spring.core.xmlConfiguration;

import org.liza.spring.core.javaConfiguration.ClassicalMusic;
import org.liza.spring.core.javaConfiguration.MusicPlayer;
import org.liza.spring.core.javaConfiguration.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        org.liza.spring.core.javaConfiguration.MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        org.liza.spring.core.javaConfiguration.ClassicalMusic classicalMusic = context.getBean("classicalMusic", org.liza.spring.core.javaConfiguration.ClassicalMusic.class);
        org.liza.spring.core.javaConfiguration.ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1==classicalMusic);
        context.close();
    }
}
