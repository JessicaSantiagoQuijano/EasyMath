package mx.edu.unpa.JSQ_SQO;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity2 extends AppCompatActivity {
    private ImageView iv;
    private ImageView iv_2;
    private ConstraintLayout cl;
    private Bundle extras;
    private TextView tvOp;
    private TextView tvNivel;
    private int nivel;

    //PROBANDO LAS IMAGENES PARA VER QUE NO TENGA FONDOS
    //COMENTARIOS
    private static final Random rgenerador = new Random();
    private static final Random rgenerador_2 = new Random();
    private static final Integer[] imagenesID = {R.drawable.manzana1, R.drawable.manzana4,
               R.drawable.manzana6, R.drawable.manzana7,
               R.drawable.manzana8, R.drawable.manzana9};

    private static final Integer[] imagenesID_2 = {R.drawable.balde1, R.drawable.balde10,
            R.drawable.balde2, R.drawable.balde3, R.drawable.balde4,R.drawable.balde5,
            R.drawable.balde6, R.drawable.balde8};

    private static final Integer[] imagenesID_3 = {R.drawable.huevo1, R.drawable.huevo2,
            R.drawable.huevo3, R.drawable.huevo4, R.drawable.huevo5,
            R.drawable.huevo7, R.drawable.huevo8, R.drawable.huevo9};

    private static final Integer[] imagenesID_4 = {R.drawable.heno10, R.drawable.heno2,
                R.drawable.heno3, R.drawable.heno4, R.drawable.heno6,
                R.drawable.heno8, R.drawable.heno9};

    private static final Integer[] imagenesID_5 = {R.drawable.caballo1, R.drawable.caballo2,
                R.drawable.caballo3, R.drawable.caballo4, R.drawable.caballo5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        // Obtenemos el ConstraintLayout
        cl = (ConstraintLayout) findViewById(R.id.cl);
        // Obtenemos el TextView para mostrar el símbolo de la operación.
        tvOp = (TextView) findViewById(R.id.txtOp);
        // Obtenemos el TextView para mostrar el nivel.
        tvNivel = (TextView) findViewById(R.id.txtNivel);
        nivel=1;
        // Obtenemos los ImageView para mostrar las imágenes de los objetos.
        iv = (ImageView) findViewById(R.id.imgRandom);
        iv_2 = (ImageView) findViewById(R.id.imgRandom2);
        //cl.setBackgroundResource(R.drawable.fondo);
        // Obtenemos el id del botón seleccionado de la vista anterior.
        extras = getIntent().getExtras();
        setImageCL(extras.getInt("idButton"));
        setImageOp(extras.getInt("idButton"));
    }

    public void onClick(View v){
        if(nivel < 10) {
            nivel++;
            tvNivel.setText("Nivel " + nivel);
            setImageOp(extras.getInt("idButton"));
        }else{
            Intent _intent = new Intent(SecondActivity2.this, ThirdActivity.class);
            startActivity(_intent);
        }
    }

    public void clickVista3(View view) {
        Intent _intent = new Intent(SecondActivity2.this, ThirdActivity.class);
        startActivity(_intent);
    }

    // Asignamos la imagen correspondiente al ConstraintLayout
    public void setImageCL(int id){
        switch(id){
            case R.id.btnSuma:
                cl.setBackgroundResource(R.drawable.fondo2);
                tvOp.setText("+");
                break;
            case R.id.btnResta:
                cl.setBackgroundResource(R.drawable.fondo3);
                tvOp.setText("-");
                break;
            case R.id.btnMult:
                cl.setBackgroundResource(R.drawable.fondo4);
                tvOp.setText("×");
                break;
            case R.id.btnDiv:
                cl.setBackgroundResource(R.drawable.fondo5);
                tvOp.setText("÷");
                break;
        }
    }

    public void setImageOp(int id){
        int resource = 0;
        int resource_2 = 0;
        switch(id){
            case R.id.btnSuma:
                resource = imagenesID[rgenerador.nextInt(imagenesID.length)];
                resource_2 = imagenesID[rgenerador_2.nextInt(imagenesID.length)];
                break;
            case R.id.btnResta:
                resource = imagenesID_2[rgenerador.nextInt(imagenesID_2.length)];
                resource_2 = imagenesID_2[rgenerador_2.nextInt(imagenesID_2.length)];
                break;
            case R.id.btnMult:
                resource = imagenesID_3[rgenerador.nextInt(imagenesID_3.length)];
                resource_2 = imagenesID_3[rgenerador_2.nextInt(imagenesID_3.length)];
                break;
            case R.id.btnDiv:
                resource = imagenesID_4[rgenerador.nextInt(imagenesID_4.length)];
                resource_2 = imagenesID_5[rgenerador_2.nextInt(imagenesID_5.length)];
//                boolean aux=rgenerador.nextBoolean();
//                if(aux) {
//                    resource = imagenesID_4[rgenerador.nextInt(imagenesID_4.length)];
//                    resource_2 = imagenesID_4[rgenerador_2.nextInt(imagenesID_4.length)];
//                }else{
//                    resource = imagenesID_5[rgenerador.nextInt(imagenesID_5.length)];
//                    resource_2 = imagenesID_5[rgenerador_2.nextInt(imagenesID_5.length)];
//                }
                break;
        }
        iv.setImageResource(resource);
        iv_2.setImageResource(resource_2);
    }

}