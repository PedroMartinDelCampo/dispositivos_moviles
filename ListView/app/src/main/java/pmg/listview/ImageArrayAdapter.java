package pmg.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by pedro on 25/09/16.
 */

public class ImageArrayAdapter extends ArrayAdapter<ListImageItem> {

    private View view;

    public ImageArrayAdapter(Context context, ListImageItem... objects) {
        super(context, R.layout.list_item_layout, R.id.itemLabel, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        view = inflater.inflate(R.layout.list_item_layout, parent, false);
        ListImageItem item = getItem(position);

        initComponents(item);

        return view;
    }

    private void initComponents(final ListImageItem item) {
        ImageView itemImage = (ImageView) view.findViewById(R.id.itemImage);
        itemImage.setImageResource(item.getImage());

        TextView itemLabel = (TextView) view.findViewById(R.id.itemLabel);
        itemLabel.setText(item.getLabel());

        Button details = (Button) view.findViewById(R.id.details);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), item.getLabel(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
