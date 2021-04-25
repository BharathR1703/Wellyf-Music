package com.example.wellyfmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class EnglishSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_songs);
        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        String url1 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FDJ%20Snake%20-%20Get%20Low.mp3?alt=media&token=e42f9581-cd9e-468b-80fc-0adf416a716e";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FDJ%20Snake%20-%20Magenta%20Riddim.mp3?alt=media&token=a8ccb5b7-beec-4314-bb45-885e168382a8";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FDJ%20Snake%20-%20Middle.mp3?alt=media&token=92289bc3-8ee7-46ca-a79d-834131087cde";
        String url4 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FDJ%20Snake%20-%20Taki%20Taki%20(feat.%20Cardi%20B%2C%20Selena%20Gomez%20%26%20Ozuna).mp3?alt=media&token=ee309921-4ab6-44ce-9092-6553064eeee5";
        String url5 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FJustin%20Bieber%20-%20Baby.mp3?alt=media&token=5cdcb226-68ba-47da-b265-012a5bb28b30";
        String url6 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FJustin%20Bieber%20-%20Friend.mp3?alt=media&token=d0c6880c-27f8-47e9-b335-c4098bf28164";
        String url7 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FJustin%20Bieber%20-%20Love%20Yourself.mp3?alt=media&token=aa698018-2209-40f7-b036-ff96694135b9";
        String url8 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FJustin%20Bieber%20-%20Sorry.mp3?alt=media&token=e02e40ff-9ec0-4ec6-b1cb-035f96c70718";
        String url9 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FJustin%20Bieber%20-%20Yummy.mp3?alt=media&token=a1342cb4-26bb-4795-ae33-55177e51b060";
        String url10 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FJustin%20Bieber%20-%20I'll%20Show%20You.mp3?alt=media&token=59dff757-3560-42de-a5d4-62f8ff5adf24";
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Get Low",url1));
        jcAudios.add(JcAudio.createFromURL("Magenta Riddim",url2));
        jcAudios.add(JcAudio.createFromURL("Middle",url3));
        jcAudios.add(JcAudio.createFromURL("Taki Taki",url4));
        jcAudios.add(JcAudio.createFromURL("Baby",url5));
        jcAudios.add(JcAudio.createFromURL("Friend",url6));
        jcAudios.add(JcAudio.createFromURL("Love Yourself",url7));
        jcAudios.add(JcAudio.createFromURL("Sorry",url8));
        jcAudios.add(JcAudio.createFromURL("Yummy",url9));
        jcAudios.add(JcAudio.createFromURL("Show You",url10));



        jcplayerView.initPlaylist(jcAudios, null);

        jcplayerView.createNotification();


    }
}