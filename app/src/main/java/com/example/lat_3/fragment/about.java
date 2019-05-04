package com.example.lat_3.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lat_3.R;
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
/**
 * A simple {@link Fragment} subclass.
 */
public class about extends Fragment {

    public about() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);




        return view;

    }
}
