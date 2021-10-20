package org.iesfm.ejemploimagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private boolean esFrutaVisible;

    private boolean esVerduraVisible;

    private TextView compra;

    private String cestaCompra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compra = (TextView) findViewById(R.id.tvCompra);

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

        TextView tvPlatanos = (TextView) findViewById(R.id.tvPlatano);
        TextView tvNaranjas = (TextView) findViewById(R.id.tvNaranjas);
        TextView tvPimientos = (TextView) findViewById(R.id.tvPimientos);
        TextView tvPatatas = (TextView) findViewById(R.id.tvPatatas);

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

        TextView tvPlatanos = (TextView) findViewById(R.id.tvPlatano);
        TextView tvNaranjas = (TextView) findViewById(R.id.tvNaranjas);

        if (esFrutaVisible) {
            platano.setVisibility(View.GONE);
            naranja.setVisibility(View.GONE);
            tvPlatanos.setVisibility(View.GONE);
            tvNaranjas.setVisibility(View.GONE);
            esFrutaVisible = false;
            esVerduraVisible = false;
        } else {
            platano.setVisibility(View.VISIBLE);
            naranja.setVisibility(View.VISIBLE);
            tvPlatanos.setVisibility(View.VISIBLE);
            tvNaranjas.setVisibility(View.VISIBLE);

            esFrutaVisible = true;
            esVerduraVisible = true;
        }
    }

    public void mostrarVerduras(View v) {
        ImageButton pimiento = (ImageButton) findViewById(R.id.ibPimiento);
        ImageButton patata = (ImageButton) findViewById(R.id.ibPatata);

        TextView tvPimiento = (TextView) findViewById(R.id.tvPimientos);
        TextView tvPatata = (TextView) findViewById(R.id.tvPatatas);

        if (esFrutaVisible) {
            pimiento.setVisibility(View.GONE);
            patata.setVisibility(View.GONE);
            tvPimiento.setVisibility(View.GONE);
            tvPatata.setVisibility(View.GONE);
            esFrutaVisible = false;
            esVerduraVisible = false;
        } else {
            pimiento.setVisibility(View.VISIBLE);
            patata.setVisibility(View.VISIBLE);
            tvPimiento.setVisibility(View.VISIBLE);
            tvPatata.setVisibility(View.VISIBLE);

            esFrutaVisible = true;
            esVerduraVisible = true;
        }
    }

    public void compraNaranjas(View v) {
        TextView naranjas = (TextView) findViewById(R.id.tvNaranjas);

        cestaCompra = compra.getText().toString() + "\n";
        cestaCompra += naranjas.getText().toString();

        compra.setText(cestaCompra);

        Toast.makeText(this, "Ha añadido naranjas", Toast.LENGTH_SHORT).show();
    }

    public void compraPlatanos(View v) {
        TextView platanos = (TextView) findViewById(R.id.tvPlatano);

        cestaCompra = compra.getText().toString() + "\n";
        cestaCompra += platanos.getText().toString();

        compra.setText(cestaCompra);
        Toast.makeText(this, "Ha añadido platanos", Toast.LENGTH_SHORT).show();
    }

    public void compraPimientos(View v) {
        TextView pimientos = (TextView) findViewById(R.id.tvPimientos);

        cestaCompra = compra.getText().toString() + "\n";
        cestaCompra += pimientos.getText().toString();

        compra.setText(cestaCompra);
        Toast.makeText(this, "Ha añadido pimientos", Toast.LENGTH_SHORT).show();
    }

    public void compraPatatas(View v) {
        TextView patatas = (TextView) findViewById(R.id.tvPatatas);

        cestaCompra = compra.getText().toString() + "\n";
        cestaCompra += patatas.getText().toString();

        compra.setText(cestaCompra);
        Toast.makeText(this, "Ha añadido patatas", Toast.LENGTH_SHORT).show();
    }

    public void reset(View v) {
        // Button reset = (Button) findViewById(R.id.btnReset);
        compra.setText("");

    }
}