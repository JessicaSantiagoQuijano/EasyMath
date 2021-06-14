package mx.edu.unpa.JSQ_SQO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//android:label="@string/app_name"
        //Toast.makeText(this, "Nuevo Proyecto", Toast.LENGTH_LONG).show();

    }

    public void onClick(View v){
        tv = (TextView) findViewById(v.getId());
        CustomAnimation customAnimation = CustomAnimation.getThis();
        customAnimation.startAnimation(getApplicationContext(), CustomAnimation.AnimationType.ZoomIn, tv);
        customAnimation.endAnimation(MainActivity.this, SecondActivity2.class, v);
    }

}