package helloworld.chcompany.vuthecong.applicationexample;

import helloworld.chcompany.vuthecong.applicationexample.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;
import java.util.zip.Inflater;

/**
 * Created by vuthecong on 12/1/15.
 */
public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Top> topItems;

    public CustomListAdapter (Activity activity, List<Top> topItems) {
        this.activity = activity;
        this.topItems = topItems;
    }

    @Override
    public int getCount() {
        return topItems.size();
    }
    @Override
    public Object getItem (int location1) {
        return topItems.get(location1);
    }
    @Override
    public long getItemId (int position) {
        return position;
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.toplist_row, null);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView rating = (TextView) convertView.findViewById(R.id.rating);
        TextView location = (TextView) convertView.findViewById(R.id.location);

        Top t = topItems.get(position);
        // Name
        title.setText(t.getTitle());
        // Rating
        rating.setText("Rating:" + String.valueOf(t.getRating()));
        // Location
        String genreStr = "";
        for (String str : t.getLocation()) {
            genreStr += str + ", ";
        }
        genreStr = genreStr.length() > 0 ? genreStr.substring(0,
                genreStr.length() - 2) : genreStr;
        location.setText(genreStr);

        return convertView;
    }
}
