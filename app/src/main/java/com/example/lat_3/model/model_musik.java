package com.example.lat_3.model;
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
public class model_musik {

    private String judullagu;
    private String penyanyi;


    public model_musik(String judullagu, String penyanyi)
    {

        this.judullagu = judullagu;
        this.penyanyi = penyanyi;


    }
    public String getJudullagu()
    {
        return judullagu;
    }
    public void setNamamusic(String judullagu)
    {
        this.judullagu = judullagu;
    }
    public String getPenyanyi()
    {
        return penyanyi;
    }
    public void setPenyanyi(String penyanyi)
    {
        this.penyanyi = penyanyi;
    }


}
