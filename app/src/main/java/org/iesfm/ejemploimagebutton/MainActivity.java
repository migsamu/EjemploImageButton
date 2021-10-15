package org.iesfm.ejemploimagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private boolean esFrutaVisible;

    private boolean esVerduraVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ibFruta = (ImageButton) findViewById(R.id.ibFruta);
        ImageButton ibVerdura = (ImageButton) findViewById(R.id.ibVerduras);

        ImageButton ibplatanos = (ImageButton) findViewById(R.id.ibPlatano);
        ImageButton ibnaranjas = (ImageButton) findViewById(R.id.ibNaranja);

        ImageButton ibPimientos = (ImageButton) findViewById(R.id.ibPimiento);
        ImageButton ibPatatas = (ImageButton) findViewById(R.id.ibPatata);

        ibplatanos.setVisibility(View.GONE);
        ibPatatas.setVisibility(View.GONE);
        ibnaranjas.setVisibility(View.GONE);
        ibPimientos.setVisibility(View.GONE);

        TextView tvPlatanos = (TextView)findViewById(R.id.tvPlatano);
        TextView tvNaranjas= (TextView)findViewById(R.id.tvNaranjas);
        TextView tvPimientos= (TextView)findViewById(R.id.tvPimientos);
        TextView tvPatatas= (TextView)findViewById(R.id.tvPatatas);

        tvPatatas.setVisibility(View.GONE);
        tvPlatanos.setVisibility(View.GONE);
        tvPimientos.setVisibility(View.GONE);
        tvNaranjas.setVisibility(View.GONE);

        esFrutaVisible = false;
        esVerduraVisible = false;
    }

    public void mostrarFrutas(View v) {


        ImageButton platano = (ImageButton) findViewById(R.id.ibPlatano);
        ImageButton naranja = (ImageButton) findViewById(R.id.ibNaranja);


        if (esFrutaVisible) {
            platano.setVisibility(View.GONE);
            naranja.setVisibility(View.GONE);
            esFrutaVisible = false;
            esVerduraVisible = false;

        } else {
            platano.setVisibility(View.VISIBLE);
            naranja.setVisibility(View.VISIBLE);
            esFrutaVisible = true;
            esVerduraVisible = true;
        }

    }

}