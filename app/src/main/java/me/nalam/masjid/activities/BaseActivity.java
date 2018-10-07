package me.nalam.masjid.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import me.nalam.masjid.R;

public class BaseActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_base);
  }
}
