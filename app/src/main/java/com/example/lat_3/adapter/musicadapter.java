package com.example.lat_3.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lat_3.R;
import com.example.lat_3.adapter.musicadapter;
import com.example.lat_3.model.model_musik;

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

import java.util.ArrayList;

public class musicadapter extends RecyclerView.Adapter<musicadapter.MusicViewHolder> {

    private ArrayList<model_musik> datalist2;

    public musicadapter(ArrayList<model_musik> datalist2)
    {
        this.datalist2 = datalist2;
    }

    @NonNull
    @Override
    public musicadapter.MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.musik, parent, false);
        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull musicadapter.MusicViewHolder holder, int position) {

        holder.judul.setText(datalist2.get(position).getPenyanyi());
        holder.penyanyi.setText(datalist2.get(position).getJudullagu());


    }

    @Override
    public int getItemCount() {
        return (datalist2 != null ) ? datalist2.size() : 0;
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder{

        private TextView judul, penyanyi;

        public MusicViewHolder(View itemView1)
        {
            super(itemView1);
            judul = (TextView) itemView1.findViewById(R.id.txt_judul_lagu);
            penyanyi = (TextView) itemView1.findViewById(R.id.txt_penyanyi);

        }
    }
}