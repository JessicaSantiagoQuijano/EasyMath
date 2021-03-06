package mx.edu.unpa.JSQ_SQO;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.Random;

public class SecondActivity2 extends AppCompatActivity {
    private ImageView iv;
    private ImageView iv_2;
    private ConstraintLayout cl;
    private Bundle extras;
    private TextView tvOp;
    private TextView tvNivel;
    private int nivel;
    private Chronometer cronometro;
    private LinkedList<Aritmetica> resultados;

    //PROBANDO LAS IMAGENES PARA VER QUE NO TENGA FONDOS
    //COMENTARIOS
    private static final Random rgenerador = new Random();
    private static final Random rgenerador_2 = new Random();
    private static final Integer[] imagenesID = {R.drawable.manzana_1, R.drawable.manzana_4,
               R.drawable.manzana_6, R.drawable.manzana_7,
               R.drawable.manzana_8, R.drawable.manzana_9};

    private static final Integer[] imagenesID_2 = {R.drawable.balde_1, R.drawable.balde_10,
            R.drawable.balde_2, R.drawable.balde_3, R.drawable.balde_4,R.drawable.balde_5,
            R.drawable.balde_6, R.drawable.balde_8};

    private static final Integer[] imagenesID_3 = {R.drawable.huevo_1, R.drawable.huevo_2,
            R.drawable.huevo_3, R.drawable.huevo_4, R.drawable.huevo_5,
            R.drawable.huevo_7, R.drawable.huevo_8, R.drawable.huevo_9};

    private static final Integer[] imagenesID_4 = {R.drawable.heno_10, R.drawable.heno_2,
                R.drawable.heno_3, R.drawable.heno_4, R.drawable.heno_6,
                R.drawable.heno_8, R.drawable.heno_9};

    private static final Integer[] imagenesID_5 = {R.drawable.caballo_1, R.drawable.caballo_2,
                R.drawable.caballo_3, R.drawable.caballo_4, R.drawable.caballo_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        // Obtenemos el ConstraintLayout
        cl = (ConstraintLayout) findViewById(R.id.cl);
        // Obtenemos el TextView para mostrar el nivel.
        tvNivel = (TextView) findViewById(R.id.txtNivel);
        nivel=1;
        // Obtenemos el cron??metro para mostrar el tiempo transcurrido.
        cronometro = (Chronometer) findViewById(R.id.crono);
        startCronometro();// Iniciamos el cronometro.
        // Obtenemos el TextView para mostrar el s??mbolo de la operaci??n.
        tvOp = (TextView) findViewById(R.id.txtOp);
        // Obtenemos los ImageView para mostrar las im??genes de los objetos.
        iv = (ImageView) findViewById(R.id.imgRandom);
        iv_2 = (ImageView) findViewById(R.id.imgRandom2);
        //cl.setBackgroundResource(R.drawable.fondo);
        // Obtenemos el id del bot??n seleccionado de la vista anterior.
        extras = getIntent().getExtras();
        setImageCL(extras.getInt("idButton"));
        setImageOp(extras.getInt("idButton"));
        resultados=new LinkedList();
    }

    public void onClickSig(View v){
        if(nivel < 10) {
            nivel++;
            tvNivel.setText("Nivel " + nivel);
            setImageOp(extras.getInt("idButton"));

        }else{
            stopCronometro();
            Intent _intent = new Intent(SecondActivity2.this, ThirdActivity.class);
            startActivity(_intent);
        }
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
                tvOp.setText("??");
                break;
            case R.id.btnDiv:
                cl.setBackgroundResource(R.drawable.fondo5);
                tvOp.setText("??");
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
                break;
        }
        iv.setImageResource(resource);
        iv_2.setImageResource(resource_2);
        //unidadTexto(getResources().getResourceEntryName(resource));
    }

    public void startCronometro(){
        cronometro.setBase(SystemClock.elapsedRealtime());
        cronometro.start();
    }

    public void stopCronometro(){
        cronometro.stop();
        long tiempoT = SystemClock.elapsedRealtime() - cronometro.getBase();
        Toast.makeText(this, "Tiempo: "+tiempoT, Toast.LENGTH_LONG).show();
    }

    public void onClickOpc(View v) {
        switch(v.getId()) {
            case R.id.btn_1:

                break;
            case R.id.btn_2:

                break;
            case R.id.btn_3:

                break;
        }
    }

    public void operaciones(){
        String opc=tvOp.getText().toString();
        switch (opc){
            case "+":

                break;
            case "-":
                break;
            case "??":
                break;
            case "??":
                break;
        }
    }

}