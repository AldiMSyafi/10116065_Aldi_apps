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
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private ConstraintLayout mDotLayout;

    private TextView[] mDots;


    private SliderAdapter sliderAdapter;
    private Button mNextbtn;
    private Button mBackbtn;

    private int mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mSlideViewPager= (ViewPager) findViewById(R.id.slideviewpager);
        mDotLayout = (ConstraintLayout) findViewById(R.id.dotsLayout);

        mNextbtn = (Button)findViewById(R.id.NextBtn);
        mNextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openhome2();
            }
        });



        mBackbtn = (Button)findViewById(R.id.BackBtn);

        sliderAdapter = new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);
       addDotsIndicator(0);

       mSlideViewPager.addOnPageChangeListener(viewListener);
    }

        public void openhome2 (){
            Intent intent =new Intent(this,home2.class);

            startActivity(intent);

        }


    public void addDotsIndicator(int position){
            mDots = new TextView[3];

            for(int i = 0; i < mDots.length; i++){

                mDots [i] = new TextView(this);
                mDots [i].setText(Html.fromHtml("&#8226;"));
                mDots [i].setTextSize(35);
                mDots [i].setTextColor(getResources().getColor(R.color.colorTransparentwhite));

                mDotLayout.addView(mDots[i]);
            }
            if(mDots.length > 0){

                mDots[position].setTextColor(getResources().getColor(R.color.colorwhite));
            }

        }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(0);
            mCurrentPage = i;

            if(i == 0){

                mNextbtn.setEnabled(false);
                mBackbtn.setEnabled(false);
                mBackbtn.setVisibility(View.INVISIBLE);

                mNextbtn.setText("");
                mBackbtn.setText("");
            }else if(i == mDots.length -1 ){

                mNextbtn.setEnabled(true);
                mBackbtn.setEnabled(false);
                mBackbtn.setVisibility(View.VISIBLE);

                mNextbtn.setText("MULAI");
                mBackbtn.setText("");
            }else{
                mNextbtn.setEnabled(false);
                mBackbtn.setEnabled(false);
                mBackbtn.setVisibility(View.INVISIBLE);

                mNextbtn.setText("");
                mBackbtn.setText("");

            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    }



