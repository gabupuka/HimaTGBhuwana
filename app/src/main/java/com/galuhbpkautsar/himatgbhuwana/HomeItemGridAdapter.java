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
public class HomeItemGridAdapter extends BaseAdapter {
    private Context mContext;
    private Integer[] mThumbIds;

    public HomeItemGridAdapter(Context c, Integer[] m) {
        mContext = c;
        mThumbIds = m;
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
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
}