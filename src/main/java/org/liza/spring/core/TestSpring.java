package org.liza.spring.core;

import org.liza.spring.core.Computer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");
//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());


//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music1= context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        musicPlayer1.playMusic();

//        MusicPlayer musicPlayer1 = co ntext.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comparison = musicPlayer1 == musicPlayer2;
//        System.out.println(comparison);
//
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//
//        musicPlayer1.setVolume(10);
//
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());


//        musicPlayer1.playMusic();
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());



     //   MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

     //   musicPlayer.playMusic();

        Computer computer= context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}