package com.erichlotto.recyclerviewexample.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.erichlotto.recyclerviewexample.Person;
import com.erichlotto.recyclerviewexample.R;
import com.erichlotto.recyclerviewexample.RVAdapter;

public class StaggeredGridLayoutManagerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_activity_layout);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);


        //If you are sure that the size of the RecyclerView won't be changing, you can add the following to improve performance:
        rv.setHasFixedSize(true);

        StaggeredGridLayoutManager sglm = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        rv.setLayoutManager(sglm);

        RVAdapter adapter = new RVAdapter(Person.generatePersonsList());
        rv.setAdapter(adapter);
    }

}
