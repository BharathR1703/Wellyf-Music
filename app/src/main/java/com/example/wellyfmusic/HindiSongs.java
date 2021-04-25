package com.example.wellyfmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class HindiSongs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_songs);
        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        String url1 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FArjit%20Singh%20-%20Tm%20Hi%20Ho.mp3?alt=media&token=f3f53e6a-8e89-4401-8359-4eb62b2c6744";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FArman%20Malik%20feat.%20Pulkit%20Smrat%20feat.%20Yami%20Gupta%20-%20Sanam%20Re%20Movie%20Song%20Bin%20Tere%20.mp3?alt=media&token=9c564a4c-e81b-46d9-aa23-bc11e1d77ecf";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FDil%20Deewana%20Beqaraar%20Huni%20Laga%20(hindi%20song)%20sjd%20-%20Dil%20Deewana%20Beqaraar%20Huni%20Laga%20(hindi%20song)%20sjd.mp3?alt=media&token=e3868eb1-e5f5-4dd3-88b2-598e5de432eb";
        String url4 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FDilwale%20Dulhania%20Le%20Jayenge%20-%20Mere%20Khwabon%20Mein.mp3?alt=media&token=b711c8c1-2d0a-4173-9178-a8abc5c0185a";
        String url5 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FDilwale%20Dulhania%20Le%20Jayenge%20-%20Zara%20Sa%20Jhoom%20Loon%20Main.mp3?alt=media&token=b36b20b7-e004-41dd-a635-731ba623ebfb";
        String url6 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FEmran%20Ali%20-%20Kuch%20To%20Hai%20Arman%20Malik%20full%20song%20(Do%20Lafzon%20Ki%20Kahani).mp3?alt=media&token=dfe9bf0d-2513-4d45-9376-384b96f17dbb";
        String url7 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FMohabbatein%20-%20aankhein%20khuli%20hon%20ya.mp3?alt=media&token=ab9c2e0a-22f2-4f61-bc88-58a50f705ed3";
        String url8 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FNeha%20Kakkar%2CShekhar%20Ravjiani%20-%20The%20Hook%20Up%20Song%20(Student%20of%20the%20Year%202).mp3?alt=media&token=abf342ba-e024-405e-a3f7-624b12b8643b";
        String url9 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FO%20Saki%20Saki%20Full%20Video%20Song%20-%20Batla%20House%20Song%20-%20Nora%20Fatehi%20-%20Neha%20Kakkar%20new%20song.mp3?alt=media&token=7f45132d-2b5f-49e3-8d69-553310efae52";
        String url10 ="https://firebasestorage.googleapis.com/v0/b/wellyf-music.appspot.com/o/Hindi%20Songs%2FZiyoda%20-%20Best%20Hindi%20Songs.mp3?alt=media&token=c04183e7-f687-4f13-b1a9-f32281a5ba7b";

        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Tum Hi Ho",url1));
        jcAudios.add(JcAudio.createFromURL("pulkti smarat",url2));
        jcAudios.add(JcAudio.createFromURL("Dil Deewana Beqaraar Huni Laga",url3));
        jcAudios.add(JcAudio.createFromURL("Mere Khwabon",url4));
        jcAudios.add(JcAudio.createFromURL("Zara Sa Jhoom Loon Main",url5));
        jcAudios.add(JcAudio.createFromURL("Kuch To Hai",url6));
        jcAudios.add(JcAudio.createFromURL("Aankhein khuli hon ya",url7));
        jcAudios.add(JcAudio.createFromURL("The Hook Up Song",url8));
        jcAudios.add(JcAudio.createFromURL("O Saki Saki",url9));
        jcAudios.add(JcAudio.createFromURL("Ziyoda",url10));


        jcplayerView.initPlaylist(jcAudios, null);

        jcplayerView.createNotification();


    }
}