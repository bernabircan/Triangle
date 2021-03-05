package com.example.vize2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView kenar1;
    private TextView kenar2;
    private TextView kenar3;
    private Button kontrolet;
    private EditText kenar1deger;
    private EditText kenar2deger;
    private EditText kenar3deger;
    public static final String k1 =
            "kenar1";
    public static final String k2 =
            "kenar2";
    public static final String k3 =
            "kenar3";

    public int  value1deger;
    public int  value2deger;
    public int  value3deger;

    public String deger1="value1deger";
    public String deger2="value2deger";
    public String  deger3="value3deger";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kenar1 = (TextView) findViewById(R.id.Kenar1);
        kenar2 = (TextView) findViewById(R.id.Kenar2);
        kenar3 = (TextView) findViewById(R.id.Kenar3);
        kenar1deger= (EditText) findViewById(R.id.editTextkenar1);
        kenar2deger= (EditText) findViewById(R.id.editTextkenar2);
        kenar3deger= (EditText) findViewById(R.id.editTextkenar3);

        if (savedInstanceState != null) { //key_ındex ne işe yarıyo //rotasyonla ilgili
            //Bundle tipinde savedInstanceState
            value1deger = savedInstanceState.getInt(deger1, 0);
            value2deger= savedInstanceState.getInt(deger2, 0);
            value3deger= savedInstanceState.getInt(deger3, 0);

            kenar1deger.setText(String.valueOf(value1deger));
            kenar2deger.setText(String.valueOf(value2deger));
            kenar3deger.setText(String.valueOf(value3deger));

        }






        kontrolet= (Button) findViewById(R.id.kontrolet);
        kontrolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checkAnswer(true);
                String value1= kenar1deger.getText().toString();
                value1deger=Integer.parseInt(value1);
                String value2= kenar2deger.getText().toString();
                value2deger=Integer.parseInt(value2);
                String value3= kenar3deger.getText().toString();
                value3deger=Integer.parseInt(value3);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(k1, value1deger);
                intent.putExtra(k2, value2deger);
                intent.putExtra(k3, value3deger);
                startActivity(intent);


            }
        });


    }
    public void onSaveInstanceState(Bundle savedInstanceState) { //aktivite bundle objesine kaydediliyor.
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt(deger1, value1deger);
        savedInstanceState.putInt(deger2, value2deger);
        savedInstanceState.putInt(deger3, value3deger);



    }
}