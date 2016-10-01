package pmg.numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        x = (TextView) findViewById(R.id.x);
    }

    private int getX() {
        String strNumber = x.getText().toString();
        return Integer.parseInt(strNumber);
    }

    public void sumar(View view) {
        x.setText((getX() + 1) + "");
    }

    public void restar(View view) {
        x.setText((getX() - 1) + "");
    }
}
