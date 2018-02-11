package checkbox.ericserafim.com.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

    private CheckBox checkBoxCao;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;
    private TextView textoMostrar;
    private Button botaoMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCao = (CheckBox) findViewById(R.id.checkBoxCaoId);
        checkBoxGato = (CheckBox) findViewById(R.id.checkBoxGatoId);
        checkBoxPapagaio = (CheckBox) findViewById(R.id.checkBoxPapagaioId);
        botaoMostrar = (Button) findViewById(R.id.botaoMostrarId);
        textoMostrar = (TextView) findViewById(R.id.textoExibicaoId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder builder = new StringBuilder();

                builder.append(checkBoxCao.getText());
                builder.append(" - Status: ");
                builder.append(checkBoxCao.isChecked());
                builder.append("\n");

                builder.append(checkBoxGato.getText());
                builder.append(" - Status: ");
                builder.append(checkBoxGato.isChecked());
                builder.append("\n");

                builder.append(checkBoxPapagaio.getText());
                builder.append(" - Status: ");
                builder.append(checkBoxPapagaio.isChecked());
                builder.append("\n");

                textoMostrar.setText(builder.toString());
            }
        });
    }
}
