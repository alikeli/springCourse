package org.liza.spring.core;

import org.liza.spring.core.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class ClassicalMusic implements Music {

//    private ClassicalMusic() {
//
//    }

//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }

//    public void doMyInit() {
//        System.out.println("Doing my initialization!");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction!");
//    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
