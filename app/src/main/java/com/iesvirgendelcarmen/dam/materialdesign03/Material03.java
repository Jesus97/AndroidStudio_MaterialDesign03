package com.iesvirgendelcarmen.dam.materialdesign03;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class Material03 extends AppCompatActivity implements View.OnClickListener{

    FloatingActionButton fab1;
    FloatingActionButton fab2;
    FloatingActionButton fab3;
    FloatingActionButton fab4;
    FloatingActionButton fab5;
    FloatingActionButton fab6;
    FloatingActionButton fab7;
    boolean abierto = false;
    boolean abierto2 = false;
    Animation abrir,cerrar,derecha,izquierda;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material03);

        fab1=(FloatingActionButton)findViewById(R.id.fab1);
        fab2=(FloatingActionButton)findViewById(R.id.fab2);
        fab3=(FloatingActionButton)findViewById(R.id.fab3);
        fab4=(FloatingActionButton)findViewById(R.id.fab4);
        fab5=(FloatingActionButton)findViewById(R.id.fab5);
        fab6=(FloatingActionButton)findViewById(R.id.fab6);
        fab7=(FloatingActionButton)findViewById(R.id.fab7);

        abrir = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.abrir);
            cerrar = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.cerrar);
            izquierda = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.izquierda);
            derecha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.derecha);

        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);
        fab4.setOnClickListener(this);
        fab5.setOnClickListener(this);
        fab6.setOnClickListener(this);
        fab7.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fab3:
                if(abierto){
                    abierto=false;



                    fab4.startAnimation(cerrar);
                    fab5.startAnimation(cerrar);
                    fab6.startAnimation(cerrar);
                    fab7.startAnimation(cerrar);
                    fab2.startAnimation(izquierda);
                    fab4.setClickable(false);
                    fab5.setClickable(false);
                    fab6.setClickable(false);
                    fab7.setClickable(false);

                    fab3.startAnimation(izquierda);
                    fab1.startAnimation(cerrar);
                    fab2.startAnimation(cerrar);
                    fab1.setClickable(false);
                    fab2.setClickable(false);

                }else{
                    abierto=true;
                    fab1.startAnimation(abrir);
                    fab2.startAnimation(abrir);
                    fab3.startAnimation(derecha);
                    fab2.setClickable(true);
                    fab1.setClickable(true);

                }
                break;
            case R.id.fab2:
                if(abierto2){
                    abierto2=false;
                    fab4.startAnimation(cerrar);
                    fab5.startAnimation(cerrar);
                    fab6.startAnimation(cerrar);
                    fab7.startAnimation(cerrar);
                    fab2.startAnimation(izquierda);
                    fab4.setClickable(false);
                    fab5.setClickable(false);
                    fab6.setClickable(false);
                    fab7.setClickable(false);
                }else{
                    abierto2=true;
                    fab4.startAnimation(abrir);
                    fab5.startAnimation(abrir);
                    fab6.startAnimation(abrir);
                    fab7.startAnimation(abrir);
                    fab2.startAnimation(derecha);
                    fab4.setClickable(true);
                    fab5.setClickable(true);
                    fab6.setClickable(true);
                    fab7.setClickable(true);
                }
                break;
            case R.id.fab1:
                Toast.makeText(getApplicationContext(), "TOCADO FAB 1",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
