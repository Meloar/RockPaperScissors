package com.example.balzsmohr.rockscissorspaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView Image_View_sajat, Image_View_gep;
    private TextView Text_View_eredmeny;
    private Button Button_ko, Button_papir, Button_ollo;
    private int ember = 0, gep = 0, random = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        Button_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random rng = new Random();
                random = rng.nextInt(3) + 1;
                Image_View_sajat.setBackgroundResource(R.drawable.rock);
                kepvalt();

                switch (random){

                    case 1: Toast.makeText(MainActivity.this, "Döntetlen, próbáld újra", Toast.LENGTH_SHORT).show();
                            break;

                    case 2: gep++;
                            Text_View_eredmeny.setText("Eredmény: Ember: " + ember + " Computer: " + gep);
                            Toast.makeText(MainActivity.this, "Papír erősebb, mint a Kő. Vesztettél!", Toast.LENGTH_SHORT).show();
                            break;

                    case 3: ember++;
                            Text_View_eredmeny.setText("Eredmény: Ember: " + ember + " Computer: " + gep);
                            Toast.makeText(MainActivity.this, "Kő erősebb, mint az Olló. Nyertél!", Toast.LENGTH_SHORT).show();
                            break;


                }

            }
        });

        Button_papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random rng = new Random();
                random = rng.nextInt(3) + 1;
                Image_View_sajat.setBackgroundResource(R.drawable.paper);
                kepvalt();

                switch (random){

                    case 1: ember++;
                            Text_View_eredmeny.setText("Eredmény: Ember: " + ember + " Computer: " + gep);
                            Toast.makeText(MainActivity.this, "Papír erősebb, mint az Kő. Nyertél!", Toast.LENGTH_SHORT).show();
                            break;

                    case 2: Toast.makeText(MainActivity.this, "Döntetlen, próbáld újra", Toast.LENGTH_SHORT).show();
                            break;

                    case 3: gep++;
                            Text_View_eredmeny.setText("Eredmény: Ember: " + ember + " Computer: " + gep);
                            Toast.makeText(MainActivity.this, "Olló erősebb, mint a Papír. Vesztettél!", Toast.LENGTH_SHORT).show();
                            break;


                }


            }
        });

        Button_ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random rng = new Random();
                random = rng.nextInt(3) + 1;
                Image_View_sajat.setBackgroundResource(R.drawable.scissors);
                kepvalt();

                switch (random){

                    case 1: gep++;
                            Text_View_eredmeny.setText("Eredmény: Ember: " + ember + " Computer: " + gep);
                            Toast.makeText(MainActivity.this, "Kő erősebb, mint az Olló. Vesztettél!", Toast.LENGTH_SHORT).show();
                            break;

                    case 2: ember++;
                            Text_View_eredmeny.setText("Eredmény: Ember: " + ember + " Computer: " + gep);
                            Toast.makeText(MainActivity.this, "Olló erősebb, mint a Papír. Nyertél!", Toast.LENGTH_SHORT).show();
                            break;

                    case 3: Toast.makeText(MainActivity.this, "Döntetlen, próbáld újra", Toast.LENGTH_SHORT).show();
                            break;


                }

            }
        });



    }

    public void init()
    {

        Image_View_sajat = (ImageView) findViewById(R.id.Image_View_sajat);
        Image_View_gep = (ImageView) findViewById(R.id.Image_View_gep);
        Text_View_eredmeny = (TextView) findViewById(R.id.Text_View_eredmeny);
        Button_ko = (Button) findViewById(R.id.Button_ko);
        Button_papir = (Button) findViewById(R.id.Button_papir);
        Button_ollo = (Button) findViewById(R.id.Button_ollo);

    }

    public void kepvalt()
    {
        switch (random){
            case 1: Image_View_gep.setBackgroundResource(R.drawable.rock);
                break;
            case 2: Image_View_gep.setBackgroundResource(R.drawable.paper);
                break;
            case 3: Image_View_gep.setBackgroundResource(R.drawable.scissors);
                break;
        }

    }

}
