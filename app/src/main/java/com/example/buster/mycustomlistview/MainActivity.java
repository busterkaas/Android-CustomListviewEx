package com.example.buster.mycustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomListViewAdapter customListViewAdapter;
    ArrayList<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songs = new ArrayList<Song>();

        populateSongs();

         listView = (ListView) findViewById(R.id.list);

        //setup adapter
        customListViewAdapter = new CustomListViewAdapter(getApplicationContext(), songs);
        listView.setAdapter(customListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                doDaMagic(position);
            }
        });
    }








    public void populateSongs(){
        songs.add(new Song(199, 1990, "Artist 1", "Song 1"));
        songs.add(new Song(134, 1997, "Artist 2", "Song 2"));
        songs.add(new Song(145, 2014, "Artist 3", "Song 3"));
        songs.add(new Song(190, 2012, "Artist 4", "Song 4"));
        songs.add(new Song(100, 1999, "Artist 5", "Song 5"));
        songs.add(new Song(50, 1991, "Artist 6", "Song 6"));
        songs.add(new Song(113, 2005, "Artist 7", "Song 7"));
        songs.add(new Song(120, 2004, "Artist 8", "Song 8"));
        songs.add(new Song(187, 2005, "Artist 9", "Song 9"));
        songs.add(new Song(179, 2007, "Artist 10", "Song 10"));
        songs.add(new Song(153, 2000, "Artist 11", "Song 11"));
        songs.add(new Song(125, 2099, "Artist 12", "Song 12"));

    }







    public void doDaMagic(int position){
        int myPosition = position;

        String itemClickedId = listView.getItemAtPosition(myPosition).toString();

        Toast.makeText(getApplicationContext(), "Id clicked: " + itemClickedId, Toast.LENGTH_LONG).show();
    }
}
