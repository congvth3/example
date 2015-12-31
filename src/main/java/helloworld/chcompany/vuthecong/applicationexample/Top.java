package helloworld.chcompany.vuthecong.applicationexample;

import java.util.ArrayList;

/**
 * Created by vuthecong on 12/1/15.
 */
public class Top {
    private String title;
    private double rating;
    private ArrayList<String> location;

    public Top () {
    }
    public Top (String name, double rating, ArrayList<String> location) {
        this.title = name;
        this.rating = rating;
        this.location = location;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle (String name) {
        this.title = name;
    }
    public double getRating() {
        return rating;
    }
    public void setRating (double rating) {
        this.rating = rating;
    }
    public ArrayList<String> getLocation() {
        return location;
    }
    public void setLocation (ArrayList<String> location) {
        this.location = location;
    }

}
