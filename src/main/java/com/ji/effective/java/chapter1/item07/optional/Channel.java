package com.ji.effective.java.chapter1.item07.optional;

import me.whiteship.chapter01.item07.optional.MemberShip;

import java.util.Optional;

public class Channel {

    private int numOfSubscribers;

    public Optional<MemberShip> defaultMemberShip(){
        if(this.numOfSubscribers < 2000){
            return Optional.empty();
        }else{
            return Optional.of(new MemberShip());
        }

    }

}
