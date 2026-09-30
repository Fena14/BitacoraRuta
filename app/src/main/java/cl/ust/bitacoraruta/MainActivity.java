package cl.ust.bitacoraruta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText txtLugar;
    private TextView lblEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLugar = findViewById(R.id.txtLugar);
        lblEstado = findViewById(R.id.lblEstado);
        Button btnRegistrar = findViewById(R.id.btnRegistrar);
        Button btnDetalle = findViewById(R.id.btnDetalle);

        btnRegistrar.setOnClickListener(view -> registrarLugar());

        btnDetalle.setOnClickListener(view -> detalleLugar());
    }

    private void registrarLugar() {
        String lugar = txtLugar.getText().toString().trim();

        if (lugar.isEmpty()) {
            lblEstado.setText(getString(R.string.estado_escribe_lugar));
            return;
        }

        lblEstado.setText(getString(R.string.estado_lugar_registrado, lugar));
    }

    private void detalleLugar(){
        String lugar = txtLugar.getText().toString().trim();

        Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
        intent.putExtra("lugar", lugar);
        startActivity(intent);
    }
}
