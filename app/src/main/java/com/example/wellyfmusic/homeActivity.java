package com.example.wellyfmusic;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.wellyfmusic.ui.LoginActivity;

public class homeActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView Hindisongs,Telugusongs,Englishsongs;
    ImageView popularhindi,popularenglish;
    Button library;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        library= findViewById(R.id.library);
        library.setOnClickListener(this);
        Hindisongs = findViewById(R.id.HindiSongs);
        Hindisongs.setOnClickListener(this);
        Telugusongs = findViewById(R.id.TeluguSongs);
        Telugusongs.setOnClickListener(this);
        Englishsongs = findViewById(R.id.EnglishSongs);
        Englishsongs.setOnClickListener(this);
        popularenglish = findViewById(R.id.PopularEnglishSongs);
        popularenglish.setOnClickListener(this);
        popularhindi = findViewById(R.id.PopularHindiSongs);
        popularhindi.setOnClickListener(this);

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
            Intent intent = new Intent(homeActivity.this, LoginActivity.class);
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
            case R.id.HindiSongs:
            case R.id.PopularHindiSongs:
                startActivity(new Intent(this, HindiSongs.class));
                break;
            case  R.id.EnglishSongs:
            case R.id.PopularEnglishSongs:
                startActivity(new Intent(this, EnglishSongs.class));
                break;
            case R.id.TeluguSongs:
                startActivity(new Intent(this, TeluguSongs.class));
                break;
            case R.id.library:
                startActivity(new Intent(this, Library.class));
                break;
        }
    }
}