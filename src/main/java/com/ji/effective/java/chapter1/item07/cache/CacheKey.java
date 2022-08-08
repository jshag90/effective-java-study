package com.ji.effective.java.chapter1.item07.cache;

import java.time.LocalDateTime;

public class CacheKey {

    private Integer value;

    private LocalDateTime created;

    public CacheKey(Integer value){
        this.value = value;
        this.created = LocalDateTime.now();
    }

    public boolean equals(Object o){return this.value.equals(o);}

    public int hashCode(){ return this.value.hashCode();}

    public LocalDateTime getCreated() {return created; }

    public String toString(){
        return "CacheKey{" +
                "value=" + value +
                ", created="+created+
                '}';
    }


}
