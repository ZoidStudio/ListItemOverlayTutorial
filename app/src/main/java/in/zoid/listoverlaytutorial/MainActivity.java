package in.zoid.listoverlaytutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> data = new ArrayList<>();
        data.add("List item 1");
        data.add("List item 2");
        data.add("List item 3");
        data.add("List item 4");
        data.add("List item 6");
        data.add("List item 7");
        data.add("List item 8");
        data.add("List item 9");
        data.add("List item 10");
        data.add("List item 11");
        data.add("List item 12");
        data.add("List item 13");
        data.add("List item 14");
        data.add("List item 15");
        data.add("List item 16");
        data.add("List item 17");
        data.add("List item 18");
        data.add("List item 19");
        data.add("List item 20");
        data.add("List item 21");
        data.add("List item 22");
        data.add("List item 23");
        data.add("List item 24");
        data.add("List item 25");

        ListView listView = (ListView) findViewById(R.id.listView);
        ListAdapter adapter = new ListAdapter(getApplicationContext(), data);

        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
