package mx.edu.unpa.JSQ_SQO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class SecondActivity2 extends AppCompatActivity {
//PROBANDO LAS IMAGENES PARA VER QUE NO TENGA FONDOS
    //COMENTARIOS
    private static final Random rgenerador = new Random();
   /* private static final Integer[] imagenesID = {R.drawable.manzana1, R.drawable.manzana4,
                            R.drawable.manzana6, R.drawable.manzana7,
                            R.drawable.manzana8, R.drawable.manzana9};

    private static final Random rgenerador_2 = new Random();
    private static final Integer[] imagenesID_2 = {R.drawable.manzana1, R.drawable.manzana4,
            R.drawable.manzana6, R.drawable.manzana7,
            R.drawable.manzana8, R.drawable.manzana9};*/

    /*private static final Integer[] imagenesID = {R.drawable.heno10, R.drawable.heno2,
            R.drawable.heno3, R.drawable.heno4, R.drawable.heno9,
            R.drawable.heno6, R.drawable.heno8};

    private static final Random rgenerador_2 = new Random();
    private static final Integer[] imagenesID_2 = {R.drawable.caballo1, R.drawable.caballo2,
            R.drawable.caballo3, R.drawable.caballo4, R.drawable.caballo5};*/

    private static final Integer[] imagenesID = {R.drawable.balde1, R.drawable.balde2,
            R.drawable.balde3, R.drawable.balde4, R.drawable.balde5,
            R.drawable.balde8, R.drawable.balde10};

    private static final Random rgenerador_2 = new Random();
    private static final Integer[] imagenesID_2 = {R.drawable.balde1, R.drawable.balde2,
            R.drawable.balde3, R.drawable.balde4, R.drawable.balde5,
            R.drawable.balde8, R.drawable.balde10};

    /*private static final Integer[] imagenesID = {R.drawable.huevo1, R.drawable.huevo2,
            R.drawable.huevo3, R.drawable.huevo4, R.drawable.huevo5,
            R.drawable.huevo7, R.drawable.huevo8, R.drawable.huevo9};

    private static final Random rgenerador_2 = new Random();
    private static final Integer[] imagenesID_2 = {R.drawable.huevo1, R.drawable.huevo2,
            R.drawable.huevo3, R.drawable.huevo4, R.drawable.huevo5,
            R.drawable.huevo7, R.drawable.huevo8, R.drawable.huevo9};*/

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

    public void clickVista3(View view) {
        Intent _intent = new Intent(SecondActivity2.this, ThirdActivity.class);
        startActivity(_intent);
    }
}