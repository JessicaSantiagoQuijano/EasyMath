package mx.edu.unpa.JSQ_SQO;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    public void onBackPressed(){
        Intent _intent = new Intent(ThirdActivity.this, MainActivity.class);
        startActivity(_intent);
        super.onBackPressed();
    }

}