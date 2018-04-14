package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//          While Loop
//         int count = 0;
//         while(count < words.size()){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(count));
//            rootView.addView(wordView);
//            count++;
//        }

//        For Loop
//        for(int count = 0; count<words.size(); count++){
//             TextView wordView = new TextView(this);
//             wordView.setText(words.get(count));
//             rootView.addView(wordView);
//        }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
