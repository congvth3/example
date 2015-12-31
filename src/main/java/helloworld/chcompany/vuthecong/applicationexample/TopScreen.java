package helloworld.chcompany.vuthecong.applicationexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vuthecong on 11/30/15.
 */
public class TopScreen extends Activity {
    private ListView listView1;
    private List<Top> topList = new ArrayList<Top>();
    private CustomListAdapter adapter;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.top_screen);
        Intent i = getIntent();

        listView1 = (ListView) findViewById(R.id.listTop);
        adapter = new CustomListAdapter(this, topList);
        listView1.setAdapter(adapter);
    }

}
