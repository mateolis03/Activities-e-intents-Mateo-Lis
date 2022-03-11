package unipiloto.edu.co.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {
    Button boton;
    EditText text;
    public static final String EXTRA_MESSAGE = "mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        boton = findViewById(R.id.button);
        Intent intent = getIntent();
        String mensaje = intent.getStringExtra(EXTRA_MESSAGE);
        TextView verMensaje = findViewById(R.id.textView);

    }

    public void OnSendMessage(View view) {
        boton = findViewById(R.id.button);
        text = findViewById(R.id.hint);
        String mensaje = text.getText().toString();
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, mensaje);
        startActivity(intent);
    }

}