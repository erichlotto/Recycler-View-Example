package com.erichlotto.recyclerviewexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.erichlotto.recyclerviewexample.activities.GridLayoutManagerActivity;
import com.erichlotto.recyclerviewexample.activities.LinearLayoutManagerActivity;
import com.erichlotto.recyclerviewexample.activities.StaggeredGridLayoutManagerActivity;

import java.util.List;

public class MainActivity extends Activity {

    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);


    }

    public void carregaAtividade(View v){
        Intent i = new Intent();
        switch(v.getId()){
            case R.id.linear:
                i = new Intent(this, LinearLayoutManagerActivity.class);
                break;
            case R.id.grid:
                i = new Intent(this, GridLayoutManagerActivity.class);
                break;
            case R.id.staggered_grid:
                i = new Intent(this, StaggeredGridLayoutManagerActivity.class);
                break;
        }
        startActivity(i);
    }
}

