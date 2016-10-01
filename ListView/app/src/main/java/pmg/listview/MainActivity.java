package pmg.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView git;
    private ListImageItem[] items = new ListImageItem[] {
            new ListImageItem(R.drawable.git_01, "Git 1"),
            new ListImageItem(R.drawable.git_02, "Git 2"),
            new ListImageItem(R.drawable.git_03, "Git 3")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        git = (ListView) findViewById(R.id.candies);
        git.setAdapter(new ImageArrayAdapter(this, items));
    }
}
