package mx.edu.unpa.JSQ_SQO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//android:label="@string/app_name"
        //Toast.makeText(this, "Nuevo Proyecto", Toast.LENGTH_LONG).show();
    }

    public void onClick(View view) {
        Intent _intent = new Intent(MainActivity.this, SecondActivity2.class);
        startActivity(_intent);
    }

    public void onClick2(View view) {
       //Intent _intent = new Intent(MainActivity.this, SecondActivity2.class);
        //startActivity(_intent);
    }

    public void onClick3(View view) {
        //Intent _intent = new Intent(MainActivity.this, SecondActivity2.class);
        //startActivity(_intent);
    }

    public void onClick4(View view) {
        //Intent _intent = new Intent(MainActivity.this, SecondActivity2.class);
        //startActivity(_intent);
    }
}