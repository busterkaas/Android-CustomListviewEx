package com.example.buster.mycustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Buster on 25-02-2016.
 */
public class CustomListViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Song> songs;
    private static LayoutInflater inflater = null;


    public CustomListViewAdapter(Context context, ArrayList<Song> data)
    {
        mContext = context;
        songs = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if(convertView==null){
            view = inflater.inflate(R.layout.list_row, null);
        }
        TextView title = (TextView) view.findViewById(R.id.title);
        TextView author = (TextView) view.findViewById(R.id.author);
        TextView pages = (TextView) view.findViewById(R.id.bpm);
        ImageView image = (ImageView) view.findViewById(R.id.list_image);


        Song song = songs.get(position);

        title.setText(song.getTitle());
        author.setText(song.getArtist());
        pages.setText("BPM: " + song.getBpm());

        image.setImageDrawable(mContext.getResources().getDrawable(R.drawable.iii));

        return view;
    }
}
