package com.erichlotto.recyclerviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);


        //If you are sure that the size of the RecyclerView won't be changing, you can add the following to improve performance:
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        GridLayoutManager glm = new GridLayoutManager(this, 2);
        StaggeredGridLayoutManager sglm = new StaggeredGridLayoutManager(2, 1);
        rv.setLayoutManager(sglm);

        persons = new ArrayList<>();

        persons.add(new Person("Emma Wilson", "23 years old, but turning 24the next week. That's it, a pretty long text.", R.mipmap.ic_launcher));
        persons.add(new Person("Lavery Maiss", "25 years old Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam rutrum metus tellus, at finibus magna dignissim et. Cras id lorem vel sem hendrerit pulvinar. Integer laoreet erat ut dui gravida gravida. Etiam mattis faucibus elit, et ultrices ipsum auctor id. Praesent augue tellus, suscipit eu mi nec, tincidunt venenatis neque. Vivamus eget nunc laoreet felis ultrices tempor.", R.mipmap.ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_launcher));
        for(int i=0; i<=20; i++){
            persons.add(new Person("Pessoa "+i, Math.round(Math.random()*80)+" anos", R.mipmap.ic_launcher));
        }

        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }

}

class Person {
    String name;
    String age;
    int photoId;

    Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

}