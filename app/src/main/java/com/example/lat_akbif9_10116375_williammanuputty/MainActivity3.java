package com.example.lat_akbif9_10116375_williammanuputty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="app.lat_akbif9_10116375_williammanuputty" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void button3(View view){
        Intent intent = new Intent(this,MainActivity4.class);
        //inisialisasi intent
        EditText editnama = (EditText)findViewById(R.id.edit2);
        EditText editumur = (EditText)findViewById(R.id.edit3);
        //inisialisasi editext
        String message = editnama.getText().toString();


        intent.putExtra(EXTRA_MESSAGE,message);


        //dengan tipe data key value
        startActivity(intent);
    }
}