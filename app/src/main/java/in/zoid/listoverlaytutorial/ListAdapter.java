package in.zoid.listoverlaytutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by divyendu on 16/04/15.
 */
public class ListAdapter extends BaseAdapter {
    ArrayList<String> data;
    Context context;

    public ListAdapter(Context contextVal, ArrayList<String> dataVal) {
        context = contextVal;
        data = dataVal;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context.getApplicationContext());
        View view = inflater.inflate(R.layout.list_item, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(data.get(position));

        final TextView overlay = (TextView) view.findViewById(R.id.overlay);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                v.post(new Runnable() {
                    @Override
                    public void run() {
                        overlay.setVisibility(View.VISIBLE);
                        v.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                overlay.setVisibility(View.INVISIBLE);
                            }
                        }, 500);
                    }
                });
                // Normal click logic
            }
        });

        return view;
    }
}
