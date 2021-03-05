package com.example.vize2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mkenar1;
    private TextView mkenar2;
    private TextView mkenar3;
    private TextView mesaj;
    private TextView mkenar1deger;
    private TextView mkenar2deger;
    private TextView mkenar3deger;

    private int gelenkenar1 ;
    private int gelenkenar2 ;
    private int gelenkenar3 ;
    public static final String k1 =
            "kenar1";
    public static final String k2 =
            "kenar2";
    public static final String k3 =
            "kenar3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        gelenkenar1 = getIntent().getIntExtra(k1,0);
        gelenkenar2 = getIntent().getIntExtra(k2,0);
        gelenkenar3 = getIntent().getIntExtra(k3,0);

        String a= String.valueOf(gelenkenar1);
        String b=String.valueOf(gelenkenar2);
        String c=String.valueOf(gelenkenar3);



        mkenar1 = (TextView) findViewById(R.id.Kenar1);
        mkenar2 = (TextView) findViewById(R.id.Kenar2);
        mkenar3 = (TextView) findViewById(R.id.Kenar3);
        mkenar1deger= (TextView) findViewById(R.id.Kenar1deger);
        mkenar2deger= (TextView) findViewById(R.id.Kenar2deger);
        mkenar3deger= (TextView) findViewById(R.id.Kenar3deger);
        mesaj= (TextView) findViewById(R.id.mesaj);

        mkenar1deger.setText(a);
        mkenar2deger.setText(b);
        mkenar3deger.setText(c);


        Ucgen ucgen1=new Ucgen(gelenkenar1,gelenkenar2,gelenkenar3);
        if(ucgen1.isValid()){
            mesaj.setText( "Yukarıda kenarları verilen üçgen geçerli bir üçgendir" );

        }else{
            mesaj.setText( "Yukarıda kenarları verilen üçgen geçerli bir üçgen değildir" );
        }



    }
}