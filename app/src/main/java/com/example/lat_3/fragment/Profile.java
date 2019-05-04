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
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.ViewUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.lat_3.R;



public class Profile extends Fragment {
         private ImageButton ig;
         private ImageButton tw;
         private ImageButton map;
         private Button about;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        ig = (ImageButton) view.findViewById(R.id.instagram);
        tw = (ImageButton) view.findViewById(R.id.twitter);
        map =(ImageButton) view.findViewById(R.id.maps);
        about = (Button) view.findViewById(R.id.button_about);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        about.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                about fragmentabout = new about();
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentabout)
                        //menggant fragment
                        .addToBackStack(null)
                        //menyimpan fragment
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        //transisi fragment
                        .commit();
                //mengeksekusi fragment transaction
            }
        }));

        map.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gmmIntentUri = "https://www.google.com/maps/@-6.9471847,107.5751038,20z";
                Intent lokasi = new Intent(Intent.ACTION_VIEW);
                lokasi.setData(Uri.parse(gmmIntentUri));
                startActivity(lokasi);
            }
        }));

        ig.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {


                                      ig_fragment fragmentig = new ig_fragment();
                                      getFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentig)
                                              .addToBackStack(null)
                                              .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                                              .commit();

                                  }});
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                twitter_fragment fragmentig = new twitter_fragment();
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentig)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();

            }});


    }

}