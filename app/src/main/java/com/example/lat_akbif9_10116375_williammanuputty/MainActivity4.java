package com.example.lat_akbif9_10116375_williammanuputty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        //mengambil nilai dari intent
        String message = intent.getStringExtra(MainActivity3.EXTRA_MESSAGE);
        //mengambil nilai yang diteruskan dari class mainactivity
        TextView textView = (TextView) findViewById(R.id.txt2);
        //inisialisasi objek textview
        textView.setText(message);
        //menampilkan output nilai dari editext
    }
}
