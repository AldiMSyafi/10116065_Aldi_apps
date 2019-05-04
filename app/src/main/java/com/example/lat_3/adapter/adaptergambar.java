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
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.lat_3.R;

public class adaptergambar extends RecyclerView.Adapter<adaptergambar.ViewHolder> {

    private int[] datagambar;

    public  adaptergambar(){
        datagambar = new int[30];
        for (int i = 0; i < 30; i++)
        {
            datagambar[i] = R.drawable.tannk;
        }
    }
    @NonNull
    @Override
    public adaptergambar.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.galeri, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptergambar.ViewHolder holder, int position) {

        holder.imageView.setImageResource(datagambar[position]);
    }

    @Override
    public int getItemCount() {

        return datagambar.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;

        public ViewHolder(View itemView){
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.tanker_img);
        }


    }
}
