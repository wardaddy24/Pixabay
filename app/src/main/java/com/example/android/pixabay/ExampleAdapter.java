package com.example.android.pixabay;

import android.content.ContentValues;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Rastogi on 15-Feb-19.
 */

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<exampleitem> mExampleList;

    public ExampleAdapter(Context context,ArrayList<exampleitem> exampleList){
        mContext=context;
        mExampleList=exampleList;
    }
    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.example_item,parent,false);
                return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        exampleitem currentItem =mExampleList.get(position);
        String imageUrl = currentItem.getImageUrl();
        String creatorName= currentItem.getCreator();
        int likeCount = currentItem.getLikeCount();

        holder.mTextViewCreator.setText(creatorName);
        holder.mTextViewLikes.setText(String.valueOf(likeCount));
        Picasso.with(mContext).load(imageUrl).fit().centerInside().into(holder.mImageView);


    }
    @Override
    public int getItemCount() {

        return mExampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextViewCreator;
        public TextView mTextViewLikes;
        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView= (ImageView) itemView.findViewById(R.id.image_view);
            mTextViewCreator= (TextView) itemView.findViewById(R.id.text_view_creator);
            mTextViewLikes= (TextView) itemView.findViewById(R.id.text_view_like);
        }
    }
}
