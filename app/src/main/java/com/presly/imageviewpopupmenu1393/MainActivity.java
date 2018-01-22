package com.presly.imageviewpopupmenu1393;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

  private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.press_me);
    }

    public void imageClicked(View view) {

        PopupMenu popupMenu = new PopupMenu(this, view);

       popupMenu.inflate(R.menu.popup_menu);

       popupMenu.show();
    }

    public void earthClicked(MenuItem item) {
        imageView.setBackgroundResource(R.drawable.earth);
    }

    public void sunClicked(MenuItem item) {
        imageView.setBackgroundResource(R.drawable.sun);
    }

    public void marsClicked(MenuItem item) {
        imageView.setBackgroundResource(R.drawable.mars);
    }

    public void moonClicked(MenuItem item) {
        imageView.setBackgroundResource(R.drawable.moon);
    }
}
