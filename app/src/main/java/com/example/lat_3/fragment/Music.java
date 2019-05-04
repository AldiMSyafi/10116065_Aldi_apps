package com.example.lat_3.fragment;
/*
 10116065
 Aldi Muhamamd Syafi
 AKB-2 / IF-2

 CHANGELOG
 membuat splash screen 25-04-2019 16:44

 membuat slide adapter 26-04-2019 15:00

 membuat view pager 26-04-2019 19:24

 membuat tampilan utama 29-04-2019  16:42

 membuat fragment about,Activity,Galler,Homef,music,profile,Ig_fragment 02-04-2019 12:30

 membuat model,model_kontak,model_musik 03-04-2019 10:40

 membuat adapter daily,gambar,kontak,music 04-05-2019 10:10

*/
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lat_3.R;
import com.example.lat_3.model.model_musik;
import com.example.lat_3.adapter.musicadapter;
import java.util.ArrayList;

public class Music extends Fragment {


    private RecyclerView recyclerView;
    private musicadapter adaptermusic;
    private ArrayList<model_musik> song;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_music,container,false);

        addData();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycle_music);
        adaptermusic = new musicadapter(song);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adaptermusic);

        return view;
    }

    void addData()
    {
        song = new ArrayList<>();
        song.add(new model_musik("R U Mine?", "Arctic Monkey"));
        song.add(new model_musik("505(Five o Five)", "Arctic Monkey"));
        song.add(new model_musik("Snap out", "Arctic Monkey"));
        song.add(new model_musik("Tickets", "Maroon 5"));
        song.add(new model_musik("Rap God", "Eminem"));
        song.add(new model_musik("Hymn for The Weekend", "Coldplay"));
    }
}