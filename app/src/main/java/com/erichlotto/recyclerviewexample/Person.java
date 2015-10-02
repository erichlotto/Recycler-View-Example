package com.erichlotto.recyclerviewexample;

import java.util.ArrayList;

public class Person {
    String name;
    String age;
    int photoId;

    public Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public static ArrayList<Person> generatePersonsList(){
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Emma Wilson", "23 years old, but turning 24the next week. That's it, a pretty long text.", R.mipmap.ic_launcher));
        persons.add(new Person("Lavery Maiss", "25 years old Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam rutrum metus tellus, at finibus magna dignissim et. Cras id lorem vel sem hendrerit pulvinar. Nullam rutrum metus tellus, at finibus magna dignissim et. Cras id lorem vel sem hendrerit pulvinar.", R.mipmap.ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_launcher));
        for(int i=0; i<=20; i++){
            persons.add(new Person("Pessoa "+i, Math.round(Math.random()*80)+" anos", R.mipmap.ic_launcher));
        }
        return persons;
    }

}
