package com.waycreon.facefindedit;

import android.app.Application;
import android.graphics.Bitmap;

/**
 * Created by Waycreon on 7/31/2015.
 */
public class Global extends Application {

    Bitmap bitmap_forground;
    Bitmap image;

    public Bitmap getImage() {
        return image;
    }

    public Bitmap setImage(Bitmap image) {
        this.image = image;
        return  image;
    }

    public Bitmap getBitmap_forground() {
        return bitmap_forground;
    }

    public void setBitmap_forground(Bitmap bitmap_forground) {
        this.bitmap_forground = bitmap_forground;
    }


}
