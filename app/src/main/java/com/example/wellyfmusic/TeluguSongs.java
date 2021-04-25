package com.example.wellyfmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class TeluguSongs extends AppCompatActivity {
    ImageView song1,song2,song3,song4,song5,song6,song7,song8,song9,song10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telugu_songs);
        JcPlayerView jcplayerView = (JcPlayerView) findViewById(R.id.jcplayer);
        String url1 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2F(Bodyguard%20-%20%5BTelugu%5D)%20-%20Hosannaa.mp3?alt=media&token=7dffeb2a-c58e-46d9-adfa-670c1c47eea1";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FAwara(Telugu%20song)%20-%20Nee%20Yadalo.mp3?alt=media&token=d56f1016-554c-4b1a-981b-8c4b9439df18";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FBahubali%20(2017)_Telugu%20-%20Kannaa%20Nidurinchara.mp3?alt=media&token=8c85cb84-1dc2-4ea8-a368-c5aa0b9943f0";
        String url4 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FBajirao%20Mastani%20(telugu)%20-%20Meera%20Chittachora.mp3?alt=media&token=c2db6fb5-e60f-49ea-b3e0-3e26f2eb308b";
        String url5 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FChaarulatha%202012%20(Telugu)%20-%20Jai%20Kaali%20Maa.mp3?alt=media&token=a33c46c7-4ae1-41bd-a945-086f260c4a20";
        String url6 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FChirutha%20(Ramcharan%2C%20Neha%20Sharma)%20-%20Chirutha%20Songs%20Chamka%20Chamka%20Video%20Song%20Telugu%20Latest%20Video%20Songs%20Ram%20Charan.mp3?alt=media&token=e1fe0460-aafd-403c-9f7a-498b2f5e259e";
        String url7 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FRa.One%20telugu%20-%204.%20Oo%20Pranama.mp3?alt=media&token=8b33c6ba-b6bf-42b9-9f70-e48414a3ad07";
        String url8 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FTELUGU%20INDIAN%20SONG%20-%20UNNAMATA%20CHEPPA.mp3?alt=media&token=932b09a9-060e-4fef-a422-821403d7b7d7";
        String url9 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FTelugu%20song%20-%20Anaganaga%20Kadhala.mp3?alt=media&token=b097a13a-5118-42da-9ddf-298f4d7b5896";
        String url10 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FUrumi%20(Telugu%202011)%20-%2004%20Chinni%20Chinni.mp3?alt=media&token=125bcdc3-95bd-498c-91b4-4fad906a8600";

        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Hosannaa",url1));
        jcAudios.add(JcAudio.createFromURL("Awara",url2));
        jcAudios.add(JcAudio.createFromURL("Bahuballi-kannaa Nidurinchara",url3));
        jcAudios.add(JcAudio.createFromURL("Bajirao Mastani- Meera Chittachora",url4));
        jcAudios.add(JcAudio.createFromURL("Jai Kaali Maa",url5));
        jcAudios.add(JcAudio.createFromURL("Chirutha",url6));
        jcAudios.add(JcAudio.createFromURL("Pranama",url7));
        jcAudios.add(JcAudio.createFromURL("Unnamata cheppa",url8));
        jcAudios.add(JcAudio.createFromURL("Anaganaga Kadhala",url9));
        jcAudios.add(JcAudio.createFromURL("Urumi",url10));


        jcplayerView.initPlaylist(jcAudios, null);

        jcplayerView.createNotification();


    }
}