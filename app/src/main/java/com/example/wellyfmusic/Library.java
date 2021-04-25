package com.example.wellyfmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.wellyfmusic.ui.LoginActivity;

public class Library extends AppCompatActivity implements View.OnClickListener{
    Button playlist,album;
    ImageView Hindisongs,EnglishSongs;
    LinearLayout soundtrack,mylikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        playlist = findViewById(R.id.button_playlist);
        playlist.setOnClickListener(this);
        album = findViewById(R.id.button_album);
        album.setOnClickListener(this);
        Hindisongs = findViewById(R.id.HindiSongs);
        Hindisongs.setOnClickListener(this);
        EnglishSongs = findViewById(R.id.EnglishSongs);
        EnglishSongs.setOnClickListener(this);
        soundtrack = findViewById(R.id.Mysoundtrack);
        soundtrack.setOnClickListener(this);
        mylikes = findViewById(R.id.Mylikes);
        mylikes.setOnClickListener(this);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if ( id == R.id.logout){
            Intent intent = new Intent(Library.this, LoginActivity.class);
            startActivity(intent);
            return true;
        }else{
            Toast.makeText(this, "Please Wait", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_playlist:
                startActivity(new Intent(this, playlist.class));
                break;
            case R.id.button_album:
                startActivity(new Intent(this, Album.class));
                break;
            case R.id.Mysoundtrack:
                startActivity(new Intent(this, mysoundtrack.class));
                break;
            case R.id.Mylikes:
                startActivity(new Intent(this, mylikes.class));
                break;
            case R.id.HindiSongs:
                startActivity(new Intent(this, HindiSongs.class));
                break;
            case R.id.EnglishSongs:
                startActivity(new Intent(this, EnglishSongs.class));
                break;
        }
    }
}