package info.androidhive.slidingmenu.model;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.FormatFlagsConversionMismatchException;

/**
 * Created by vuthecong on 12/31/15.
 */
public class NearbyMapFragment extends Fragment {
    public NearbyMapFragment() {}

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_NearbyMap, container, false);
        return rootView;
    }
}
