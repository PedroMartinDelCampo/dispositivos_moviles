package pmg.activityintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String EXTRA_NAME = "pmg.activityintent.name";

    private String name;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name = getIntent().getStringExtra(EXTRA_NAME);
        initComponents();
    }

    private void initComponents() {
        txtName = (TextView) findViewById(R.id.txtName);
        txtName.setText(name);
    }

}
