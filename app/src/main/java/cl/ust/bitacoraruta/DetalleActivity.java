package cl.ust.bitacoraruta;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView lblDetalle = findViewById(R.id.lblDetalle);
        Button btnVolver = findViewById(R.id.btnVolver);

        String lugar = getIntent().getStringExtra("lugar");
        if (lugar == null || lugar.isEmpty()) {
            lugar = "Sin lugar registrado";
        }

        lblDetalle.setText("Lugar seleccionado: " + lugar);
        btnVolver.setOnClickListener(view -> finish());
    }
}
