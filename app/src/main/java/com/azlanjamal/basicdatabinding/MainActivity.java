package com.azlanjamal.basicdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.azlanjamal.basicdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate layout
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Get data
        DataSource dataSource = DataSource.get("Azlan");

        // Bind the data to the view
        binding.setDataSource(dataSource);
    }
}
