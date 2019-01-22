package com.example.brendan.lab1b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.*;
import java.util.ArrayList;


public class MysteryHelper extends AppCompatActivity {

    private ArrayList<String> storyFragments;
    private ArrayList<String> usedFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery_helper);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        storyFragments = new ArrayList<>();
        usedFragments = new ArrayList<>();

        storyFragments.add("you get knocked out");
        storyFragments.add("you go somewhere else");
        storyFragments.add("you find a dead man");
        storyFragments.add("you find a dead woman");
        storyFragments.add("you meet a buxom blonde");
        storyFragments.add("someone has searched the place");
        storyFragments.add("a crooked cop warns you");
        storyFragments.add("you are arrested");
        storyFragments.add("you find a gun");
        storyFragments.add("you find a knife");
        storyFragments.add("you find a frayed rope");
        storyFragments.add("a bullet whizzes past your ear");
        storyFragments.add("you are almost run over");
        storyFragments.add("you are being followed");
        storyFragments.add("you smell familiar perfume");
        storyFragments.add("the telephone rings");
        storyFragments.add("there is a knock at the door");
        storyFragments.add("you hear footsteps behind you ...");
        storyFragments.add("you hear a gunshot!");
        storyFragments.add("you hear a scream!");
        storyFragments.add("you are not alone...");
        storyFragments.add("... forget this story, it stinks!");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mystery_helper, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getHelpButtonClicked(View v){

        if(storyFragments.isEmpty()){
            storyFragments = usedFragments;
            usedFragments = new ArrayList<>();

            /*while(!usedFragments.isEmpty()){
                String storyFragment = usedFragments.remove(0);
                storyFragments.add(storyFragment);
            }*/
        }

        int index = (int)(Math.random() * storyFragments.size());

        String fragment = storyFragments.remove(index);

        usedFragments.add(fragment);

        TextView output = (TextView)findViewById(R.id.outputView);
        output.setText(fragment);
    }
}
