package com.example.ict602_lab2c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    GridView gridView = (GridView) findViewById(R.id.gridView);
    gridView.setAdapter(new ImageAdapter(this));

    //Onclick event for single gridview item
    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        //Sending image id to FullImageActivity
        Intent i = new Intent(getApplicationContext(), FullImageActivity.class);

        String desc = "";
        if (position == 0) {
          desc = "stackedbuffalo";
        }
        else if (position == 1) {
          desc = "Techcare Innovation";
        }
        else if (position == 2) {
          desc = "Albayen Premium";
        }
        else if (position == 3) {
          desc = "Albayen Lite";
        }
        else if (position == 4) {
          desc = "Albayen Home";
        }
        else if (position == 5) {
          desc = "Albayen Chatbot";
        }
        else if (position == 6) {
          desc = "Albayen Junior";
        }
        else if (position == 7) {
          desc = "Tabung Haji E Learning Prototype";
        }
        else if (position == 8) {
          desc = "Wiki Schools";
        }
        else if (position == 9) {
          desc = "Unicreds";
        }
        else if (position == 10) {
          desc = "sifuBad Apprentice Prototype";
        }
        else if (position == 11) {
          desc = "sifuBad The CEO Prototype";
        }
        else {
          desc = "eh";
        }

        //Passing array index
        i.putExtra("id", position);
        i.putExtra("desc", desc);
        startActivity(i);
      }
    });
  }
}