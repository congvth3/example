package helloworld.chcompany.vuthecong.applicationexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by vuthecong on 11/30/15.
 */
public class NearbyScreen extends Activity {
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.nearby_screen);
        Intent i1 = getIntent();
    }
}
