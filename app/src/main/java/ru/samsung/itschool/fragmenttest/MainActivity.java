package ru.samsung.itschool.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MessageFragment fragment = (MessageFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
        Bundle extras = getIntent().getExtras();
//        String value = "extras.getString('value)";
//        String value = extras.getString("value");
//        fragment.setMessage(value);
//        if(value !=null && fragment != null && fragment.isInLayout()){
//
//        }
    }
}