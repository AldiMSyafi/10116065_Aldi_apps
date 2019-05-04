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
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lat_3.adapter.adaptergambar;
import com.example.lat_3.R;

public class Gallery extends Fragment {


    private RecyclerView recyclerView1;
    private adaptergambar galleri;

    public Gallery() {


    }



    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery,container,false);

        galleri = new adaptergambar();

        RecyclerView recyclerView1 = (RecyclerView) view.findViewById(R.id.recycle_gambar);
        if (recyclerView1!=null){
            recyclerView1.setAdapter(galleri);
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        }
        return view;
    }
}
