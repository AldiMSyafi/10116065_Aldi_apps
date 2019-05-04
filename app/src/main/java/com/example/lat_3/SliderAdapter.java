package com.example.lat_3;
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
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){

        this.context = context;
    }

    //arrays
    public int[] slide_image = {

                R.drawable.soldier,
                R.drawable.walkie,
                R.drawable.radar,

    };
    public String[] slide_heading = {
                "WELCOME",
                "ABOUT APPLICATION",
                "CONNECT WITH ME"
    };
    public String[] slide_desc = {

                "Hallo selamat datang di aplikasi saya,nama saya aldi.Ada apa aja di aplikasi ini? swipe untuk ke slide selanjutnya",
                "Di aplikasi ini ada biodata mengenai saya ada juga gallery berisi kegiatan-kegiatan saya dan juga ada playlist musik dan video",
                "untuk info lebih lanjut bisa kontak saya melalui email maupun no hp,jangan lupa juga follow social media saya,terimakasih hope you enjoy"
    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject( View view,  Object o) {
        return view == (ConstraintLayout)o;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position){

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container,false);

        ImageView slideImageView =(ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading =(TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription =(TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_image[position]);
        slideHeading.setText(slide_heading[position]);
        slideDescription.setText(slide_desc[position]);

        container.addView(view);

        return view;
    }
      public void destroyItem(ViewGroup container, int position,Object object) {

        container.removeView((ConstraintLayout)object);


    }
}
