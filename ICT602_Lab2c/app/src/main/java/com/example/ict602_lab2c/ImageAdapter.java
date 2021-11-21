package com.example.ict602_lab2c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
  private Context mContext;

  //add all image to arrayList
  public Integer[] thumbImages = {
    R.drawable.stacked_buffalo, R.drawable.techcare, R.drawable.albayen, R.drawable.albayen_lite, R.drawable.albayen_home, R.drawable.albayen_chatbot, R.drawable.albayen_junior, R.drawable.tabung_haji_e_learning, R.drawable.wiki_schools, R.drawable.unicreds, R.drawable.sifubad_apprentice, R.drawable.sifubad_the_ceo
  };

  public ImageAdapter(Context c) {
    mContext = c;
  }

  public int getCount() {
    return thumbImages.length;
  }

  public Object getItem(int position) {
    return null;
  }

  public long getItemId(int position) {
    return 0;
  }

  public View getView(int position, View convertView, ViewGroup parent) {
    ImageView imageView = new ImageView(mContext);

    imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    imageView.setPadding(8, 8, 8, 8);
    imageView.setImageResource(thumbImages[position]);
    return imageView;
  }
}
