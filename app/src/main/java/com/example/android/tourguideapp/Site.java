package com.example.android.tourguideapp;

import java.io.Serializable;

public class Site implements Serializable {
    ////To ensure that the user can see the last sentence in the middle of the ScrollView
    final String EXTRA_WHITE_SPACE = "\n\n\n\n\n\n\n";
    public static final String INTENT_TAG = "Site instance";
    private String mName, mDescription;
    private int mImageResourceId;

    public Site(int imageResourceId, String name, String description) {
        this.mName = name;
        this.mDescription = description+EXTRA_WHITE_SPACE;
        this.mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the site
     * @return name of the site
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the description of the site
     * @return description of the site
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the image resource ID of the site
     * @return image resource ID of the site
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Site{" +
                "mName='" + mName + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
