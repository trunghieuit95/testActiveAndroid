package com.example.vtree.testactiveandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvUser,lvMedal;
    ArrayList<String> arrList=new ArrayList<String>();
    ArrayAdapter<String> adapter=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lvUser = (ListView) findViewById(R.id.listView);
        ListView lvMedal = (ListView) findViewById(R.id.listView2);
        User user = new User();
        user.setID("1");
        user.setName("pokemon");
        user.save();
    }
}
