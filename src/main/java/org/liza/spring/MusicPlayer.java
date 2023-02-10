package org.liza.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    //IoC
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    //    public MusicPlayer() {
//
//    }
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusic() {
        System.out.println("Playing : " + classicalMusic.getSong());
        System.out.println("Playing : " + rockMusic.getSong());
    }

}
