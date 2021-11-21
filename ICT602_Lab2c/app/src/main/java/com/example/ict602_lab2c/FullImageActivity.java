package com.example.ict602_lab2c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FullImageActivity extends Activity {

  private TextView textImg;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.full_image);

    //Get intent data
    Intent i = getIntent();

    //Get Selected Image Id
    int position = i.getExtras().getInt("id");
    ImageAdapter imageAdapter = new ImageAdapter(this);

    String desc = i.getExtras().getString("desc");

    textImg = (TextView) findViewById(R.id.textView);
    textImg.setText(desc);

    ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
    imageView.setImageResource(imageAdapter.thumbImages[position]);



  }
}
