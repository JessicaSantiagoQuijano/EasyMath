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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        CustomAnimation customAnimation = CustomAnimation.getThis();
        customAnimation.startAnimation(getApplicationContext(), CustomAnimation.AnimationType.ZoomIn, v);
        customAnimation.endAnimation(MainActivity.this, SecondActivity2.class, v);
    }

}