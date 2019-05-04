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
import android.widget.TextView;

import com.example.lat_3.model.model_kontak;
import com.example.lat_3.R;
import java.util.ArrayList;

public class adapterkontak extends RecyclerView.Adapter<adapterkontak.ActivityKontakViewHolder> {

    private ArrayList<model_kontak> data1;

    public adapterkontak(ArrayList<model_kontak> datalist){
        this.data1 = data1;
    }


    @NonNull
    @Override
    public  adapterkontak.ActivityKontakViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater1 = LayoutInflater.from(parent.getContext());
        View view = layoutInflater1.inflate(R.layout.data_kontak, parent,false);
        return new ActivityKontakViewHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull adapterkontak.ActivityKontakViewHolder holder, int position) {

        holder.txtnamatmn.setText(data1.get(position).getnamatmn());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ActivityKontakViewHolder extends RecyclerView.ViewHolder{
        private TextView txtnamatmn;

        public ActivityKontakViewHolder(View itemView){
            super(itemView);

            txtnamatmn = (TextView) itemView.findViewById(R.id.txtnamatmn);
        }
    }
}
