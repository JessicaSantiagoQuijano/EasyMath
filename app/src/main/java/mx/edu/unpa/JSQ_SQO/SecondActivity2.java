package mx.edu.unpa.JSQ_SQO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class SecondActivity2 extends AppCompatActivity {

    private static final Random rgenerador = new Random();
    private static final Integer[] imagenesID = {R.drawable.manzana1, R.drawable.manzana4,
                            R.drawable.manzana6, R.drawable.manzana7,
                            R.drawable.manzana8, R.drawable.manzana9};

    private static final Random rgenerador_2 = new Random();
    private static final Integer[] imagenesID_2 = {R.drawable.manzana1, R.drawable.manzana4,
            R.drawable.manzana6, R.drawable.manzana7,
            R.drawable.manzana8, R.drawable.manzana9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        Integer m = imagenesID[rgenerador.nextInt(imagenesID.length)];
        Integer m1 = imagenesID_2[rgenerador_2.nextInt(imagenesID_2.length)];

        final ImageView iv = (ImageView) findViewById(R.id.imgRandom);
        final ImageView iv_2 = (ImageView) findViewById(R.id.imgRandom2);

        View nextButton = findViewById(R.id.btnImagen);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resource = imagenesID[rgenerador.nextInt(imagenesID.length)];
                iv.setImageResource(resource);

                int resource_2 = imagenesID_2[rgenerador_2.nextInt(imagenesID_2.length)];
                iv_2.setImageResource(resource_2);
            }
        });
    }
}