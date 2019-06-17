package com.example.android.pixabay;

/**
 * Created by Rastogi on 15-Feb-19.
 */

public class exampleitem {
    private String mImageurl;
    private String mCreator;
    private int mLikes;


    public exampleitem(String imageUrl, String creator, int likes)
    {

        mImageurl=imageUrl;
        mCreator=creator;
        mLikes=likes;

    }

    public String getImageUrl()
    {
        return mImageurl;
    }
    public String getCreator()
    {
        return mCreator;
    }
    public int getLikeCount()
    {
        return mLikes;
    }
}
