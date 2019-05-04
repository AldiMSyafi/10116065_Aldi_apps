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
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v4.app.Fragment;
import com.example.lat_3.R;
import com.example.lat_3.adapter.adapterdaily;
import com.example.lat_3.adapter.adapterkontak;
import com.example.lat_3.model.model;
import com.example.lat_3.model.model_kontak;

import java.util.ArrayList;

public class Activity extends Fragment  {
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;

    private adapterdaily adapterdaily;
    private adapterkontak adapterkontak;

    private ArrayList<model> dailyactivity;
    private ArrayList<model_kontak> datakontak;

    public Activity() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_activity, container, false);

        addData();

        RecyclerView recyclerView = (RecyclerView) view.findViewById (R.id.recycle_daily);

        adapterdaily = new adapterdaily(dailyactivity);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterdaily);


            addDataKontak();
        RecyclerView recyclerView1 = (RecyclerView) view.findViewById(R.id.recycle_daily_kontak);
        adapterkontak = new adapterkontak (datakontak);
        if (recyclerView1!=null)
        {
            recyclerView1.setAdapter(adapterkontak);
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(), 1));


        }
        return view;
    }


    void addData() {

        dailyactivity = new ArrayList<>();
        dailyactivity.add(new model("06:00", "Bangun langsung sholat subuh lalu prepare buat kuliah"));
        dailyactivity.add(new model("07:15", "Nyampe kampus langsung masuk kelas matkul pertama"));
        dailyactivity.add(new model("09:00", "Beres kelas nyari sarapan"));
        dailyactivity.add(new model("13:45", "Masuk matkul ke dua "));
        dailyactivity.add(new model("15:15", "Keluar kelas bercengkrama bersama teman-teman"));
        dailyactivity.add(new model("16:00", "Pulang dari kampus"));
        dailyactivity.add(new model("16:45", "Sampai di rumah "));


    }

    void addDataKontak(){

        datakontak = new ArrayList<>();
        datakontak.add(new model_kontak("Hapis Budiman"));
        datakontak.add(new model_kontak("dikky Saputra"));
        datakontak.add(new model_kontak("rezza Jaya"));
        datakontak.add(new model_kontak("Qidam Zola"));
        datakontak.add(new model_kontak("Gilang Fahmi"));
        datakontak.add(new model_kontak("Afif nur"));
        datakontak.add(new model_kontak("Fadhilatul"));
        datakontak.add(new model_kontak("Junan"));
        datakontak.add(new model_kontak("Maman H"));


    }
}
