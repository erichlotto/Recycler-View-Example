package com.erichlotto.recyclerviewexample.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.erichlotto.recyclerviewexample.Person;
import com.erichlotto.recyclerviewexample.R;
import com.erichlotto.recyclerviewexample.RVAdapter;

public class GridLayoutManagerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_activity_layout);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);


        //If you are sure that the size of the RecyclerView won't be changing, you can add the following to improve performance:
        rv.setHasFixedSize(true);

        GridLayoutManager glm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(glm);

        RVAdapter adapter = new RVAdapter(Person.generatePersonsList());
        rv.setAdapter(adapter);
    }

}
