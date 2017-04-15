package com.galuhbpkautsar.himatgbhuwana;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Galuh BP Kautsar on 27-Jan-17.
 */
public class HomeItemGridAdapter3 extends BaseAdapter {
    private Context mContext;
    private Integer[] mThumbIds = {R.drawable.mi_logo, R.drawable.mi_logo};

    public HomeItemGridAdapter3(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ImageView imageView = null;

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.home_item_grid, null);
            imageView = (ImageView) view.findViewById(R.id.item_grid_img);
            //      imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            //      imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //      imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
}