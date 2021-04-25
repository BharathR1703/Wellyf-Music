package com.example.wellyfmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class playlist extends AppCompatActivity {
    ImageView song1,song2,song3,song4,song5,song6,song7,song8,song9,song10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        JcPlayerView jcplayerView = (JcPlayerView) findViewById(R.id.jcplayer);
        String url1 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FDJ%20Snake%20-%20Get%20Low.mp3?alt=media&token=e42f9581-cd9e-468b-80fc-0adf416a716e";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FArman%20Malik%20feat.%20Pulkit%20Smrat%20feat.%20Yami%20Gupta%20-%20Sanam%20Re%20Movie%20Song%20Bin%20Tere%20.mp3?alt=media&token=9c564a4c-e81b-46d9-aa23-bc11e1d77ecf";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FBahubali%20(2017)_Telugu%20-%20Kannaa%20Nidurinchara.mp3?alt=media&token=8c85cb84-1dc2-4ea8-a368-c5aa0b9943f0";
        String url4 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FDJ%20Snake%20-%20Taki%20Taki%20(feat.%20Cardi%20B%2C%20Selena%20Gomez%20%26%20Ozuna).mp3?alt=media&token=ee309921-4ab6-44ce-9092-6553064eeee5";
        String url5 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FDilwale%20Dulhania%20Le%20Jayenge%20-%20Zara%20Sa%20Jhoom%20Loon%20Main.mp3?alt=media&token=b36b20b7-e004-41dd-a635-731ba623ebfb";
        String url6 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FChirutha%20(Ramcharan%2C%20Neha%20Sharma)%20-%20Chirutha%20Songs%20Chamka%20Chamka%20Video%20Song%20Telugu%20Latest%20Video%20Songs%20Ram%20Charan.mp3?alt=media&token=e1fe0460-aafd-403c-9f7a-498b2f5e259e";
        String url7 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/English%20Songs%2FJustin%20Bieber%20-%20Love%20Yourself.mp3?alt=media&token=aa698018-2209-40f7-b036-ff96694135b9";
        String url8 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FNeha%20Kakkar%2CShekhar%20Ravjiani%20-%20The%20Hook%20Up%20Song%20(Student%20of%20the%20Year%202).mp3?alt=media&token=abf342ba-e024-405e-a3f7-624b12b8643b";
        String url9 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Telugu%20Songs%2FTelugu%20song%20-%20Anaganaga%20Kadhala.mp3?alt=media&token=b097a13a-5118-42da-9ddf-298f4d7b5896";
        String url10 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FZiyoda%20-%20Best%20Hindi%20Songs.mp3?alt=media&token=c04183e7-f687-4f13-b1a9-f32281a5ba7b";

        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Get Low",url1));
        jcAudios.add(JcAudio.createFromURL("pulkti smarat",url2));
        jcAudios.add(JcAudio.createFromURL("Bahuballi-kannaa Nidurinchara",url3));
        jcAudios.add(JcAudio.createFromURL("Taki Taki",url4));
        jcAudios.add(JcAudio.createFromURL("Zara Sa Jhoom Loon Main",url5));
        jcAudios.add(JcAudio.createFromURL("Chirutha",url6));
        jcAudios.add(JcAudio.createFromURL("Love Yourself",url7));
        jcAudios.add(JcAudio.createFromURL("The Hook Up Song",url8));
        jcAudios.add(JcAudio.createFromURL("Anaganaga Kadhala",url9));
        jcAudios.add(JcAudio.createFromURL("Show You",url10));

    }
}
