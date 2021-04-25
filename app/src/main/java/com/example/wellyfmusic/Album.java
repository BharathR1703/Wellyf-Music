package com.example.wellyfmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class   Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        String url1 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FDJ%20Snake%20-%20Magenta%20Riddim.mp3?alt=media&token=a8ccb5b7-beec-4314-bb45-885e168382a8";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FDJ%20Snake%20-%20Taki%20Taki%20(feat.%20Cardi%20B%2C%20Selena%20Gomez%20%26%20Ozuna).mp3?alt=media&token=ee309921-4ab6-44ce-9092-6553064eeee5";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FJustin%20Bieber%20-%20Sorry.mp3?alt=media&token=e02e40ff-9ec0-4ec6-b1cb-035f96c70718";
        String url4 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FDJ%20Snake%20-%20Get%20Low.mp3?alt=media&token=e42f9581-cd9e-468b-80fc-0adf416a716e";
        String url5 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FArjit%20Singh%20-%20Tm%20Hi%20Ho.mp3?alt=media&token=f3f53e6a-8e89-4401-8359-4eb62b2c6744";
        String url6 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FNeha%20Kakkar%2CShekhar%20Ravjiani%20-%20The%20Hook%20Up%20Song%20(Student%20of%20the%20Year%202).mp3?alt=media&token=abf342ba-e024-405e-a3f7-624b12b8643b";
        String url7 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FDilwale%20Dulhania%20Le%20Jayenge%20-%20Mere%20Khwabon%20Mein.mp3?alt=media&token=b711c8c1-2d0a-4173-9178-a8abc5c0185a";
        String url8 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FBahubali%20(2017)_Telugu%20-%20Kannaa%20Nidurinchara.mp3?alt=media&token=8c85cb84-1dc2-4ea8-a368-c5aa0b9943f0";
        String url9 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FAwara(Telugu%20song)%20-%20Nee%20Yadalo.mp3?alt=media&token=d56f1016-554c-4b1a-981b-8c4b9439df18";
        String url10 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2F(Bodyguard%20-%20%5BTelugu%5D)%20-%20Hosannaa.mp3?alt=media&token=7dffeb2a-c58e-46d9-adfa-670c1c47eea1";

        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Magenta Riddim",url1));
        jcAudios.add(JcAudio.createFromURL("Taki Taki",url2));
        jcAudios.add(JcAudio.createFromURL("Sorry",url3));
        jcAudios.add(JcAudio.createFromURL("Get Low",url4));
        jcAudios.add(JcAudio.createFromURL("Tum Hi Ho",url5));
        jcAudios.add(JcAudio.createFromURL("The Hook Up Song",url6));
        jcAudios.add(JcAudio.createFromURL("Dilwale Dulaana Le Jayanga",url7));
        jcAudios.add(JcAudio.createFromURL("Kannaa Ni durinchara",url8));
        jcAudios.add(JcAudio.createFromURL("Awara",url9));
        jcAudios.add(JcAudio.createFromURL("Hosannaa",url10));


        jcplayerView.initPlaylist(jcAudios, null);

        jcplayerView.createNotification();

    }
}
