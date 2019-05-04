package com.example.lat_3.adapter;

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
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lat_3.R;
import com.example.lat_3.model.model;
import java.util.ArrayList;

public class adapterdaily  extends RecyclerView.Adapter<adapterdaily.DailyViewHolder> {

    private ArrayList<model> dataList;

    public adapterdaily(ArrayList<model>dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public adapterdaily.DailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_layout,parent,false);
        return new DailyViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterdaily.DailyViewHolder dailyViewHolder, int position) {
        dailyViewHolder.txtjudul.setText(dataList.get(position).getJudul());
        dailyViewHolder.txtdeskripsi.setText(dataList.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


        class DailyViewHolder extends RecyclerView.ViewHolder {
            private TextView txtjudul,txtdeskripsi;

         public DailyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtjudul = (TextView) itemView.findViewById(R.id.judul_daily);
            txtdeskripsi = (TextView) itemView.findViewById(R.id.deskripsi_daily);
        }
    }
}

