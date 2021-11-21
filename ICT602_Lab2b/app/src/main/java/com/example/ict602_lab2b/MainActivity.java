package com.example.ict602_lab2b;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

  ListView listView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    listView = (ListView)findViewById(R.id.listView);

    String[] values = new String[]{
      "ICT602",
      "LAB ACTIVITY 2 B",
      "Android Studio",
      "List Based Layout",
      "Tutorial",
      "Android List View",
      "To be honest ODL shocketh me since I ended diploma in 2019 and am working ever since",
      "worked for 1 year and 6 months at an education company as a programmer but am into cloud computing lol",
      "but too late now",
      "siapa suruh 1st choice mobile computing kat upu",
      "2nd choice is networking, too bad",
      "life is WAKARANAI"
    };

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values);
    listView.setAdapter(adapter);
  }
}