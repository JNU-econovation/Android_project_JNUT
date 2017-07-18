package com.example.chaeyeon.registeration;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity{

    RecyclerViewAdapter adapter=null;
    RecyclerView myView=null;
    LinearLayoutManager llm=null;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        intent= getIntent();

        llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        new doit().execute();
    }




    public class doit extends AsyncTask<Void, Void, Void>{
        String words;
        Document doc = null;


        @Override
        protected Void doInBackground(Void... params) {

            try {
                doc = Jsoup.connect("http://cnutoday.jnu.ac.kr/Page/GetHtmlPage.aspx").get();
                words = doc.text();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            super.onPostExecute(aVoid);

            Elements rows = doc.select("table.T_tableA tbody tr td");

            String str1,str2,str3;
            StringBuffer str_Buffer =new StringBuffer();

            ArrayList<String> str_array = new ArrayList<String>();
            ArrayList<String> myValues=new ArrayList<String>();

            int counter=0;
            for (Element row : rows) {


                Elements tdElements = row.getElementsByTag("td");
                //str_Buffer.append(tdElements.get(0).text()+"\n"+"한 식"+tdElements.get(1).text()+"\n\n"+"중 식"+tdElements.get(2).text()+"\n\n"+"양 식"+tdElements.get(3).text()+"\n\n\n");
                //str_Buffer.append(tdElements.get(0).text()+"\n"+"한 식 : \n"+tdElements.get(1).text()+"\n\n");
                str_Buffer.append(tdElements.text());

                str_array.add(str_Buffer.toString());
                //myValues.add(str_Buffer_array.get(counter).toString());

                str_Buffer.setLength(0);
                counter++;

            }

           /////////////////////////////////////////////1생/////////////////////////////////////////////////////
            if(intent.getExtras().getInt("rest_name")==1) {
                str_Buffer.append("1학생회관(1생)");
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(1);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(2);
                str2 = str2.replaceAll(" ", "\n");


                str3 = str_array.get(3);
                str3 = str3.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(0).toString() + "\n\n한식\n\n" + str1 + "\n\n양식\n\n" + str2 + "\n\n중식\n\n" + str3);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(5);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(6);
                str2 = str2.replaceAll(" ", "\n");


                str3 = str_array.get(7);
                str3 = str3.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(4).toString() + "\n\n한식\n\n" + str1 + "\n\n양식\n\n" + str2 + "\n\n중식\n\n" + str3);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(9);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(10);
                str2 = str2.replaceAll(" ", "\n");


                str3 = str_array.get(11);
                str3 = str3.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(8).toString() + "\n\n한식\n\n" + str1 + "\n\n양식\n\n" + str2 + "\n\n중식\n\n" + str3);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(13);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(14);
                str2 = str2.replaceAll(" ", "\n");


                str3 = str_array.get(15);
                str3 = str3.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(12).toString() + "\n\n한식\n\n" + str1 + "\n\n양식\n\n" + str2 + "\n\n중식\n\n" + str3);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(17);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(18);
                str2 = str2.replaceAll(" ", "\n");


                str3 = str_array.get(19);
                str3 = str3.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(16).toString() + "\n\n한식\n\n" + str1 + "\n\n양식\n\n" + str2 + "\n\n중식\n\n" + str3);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);


            }
///////////////////////////////////////////////////////////////2생/////////////////////////////////////////////////////////////////////////
            if(intent.getExtras().getInt("rest_name")==2) {
                str_Buffer.append("2학생회관(2생)");
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(21);
                str1 = str1.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(20).toString() + "\n\n" + str1);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(23);
                str1 = str1.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(22).toString() + "\n\n" + str1);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(25);
                str1 = str1.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(24).toString() + "\n\n" + str1);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(27);
                str1 = str1.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(26).toString() + "\n\n" + str1);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(29);
                str1 = str1.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(28).toString() + "\n\n" + str1);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);
            }
//////////////////////////////////////////////////////////////////////////햇들마루//////////////////////////////////////////////////////////////////
            if(intent.getExtras().getInt("rest_name")==3) {
                str_Buffer.append("햇들마루");
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(68);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(69);
                str2 = str2.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(66).toString() + "\n\n점심\n\n" + str1 + "\n\n저녁\n\n" + str2);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(72);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(73);
                str2 = str2.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(70).toString() + "\n\n점심\n\n" + str1 + "\n\n저녁\n\n" + str2);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(76);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(77);
                str2 = str2.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(74).toString() + "\n\n점심\n\n" + str1 + "\n\n저녁\n\n" + str2);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(80);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(81);
                str2 = str2.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(78).toString() + "\n\n점심\n\n" + str1 + "\n\n저녁\n\n" + str2);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);

                str1 = str_array.get(84);
                str1 = str1.replaceAll(" ", "\n");

                str2 = str_array.get(85);
                str2 = str2.replaceAll(" ", "\n");

                str_Buffer.append(str_array.get(82).toString() + "\n\n점심\n\n" + str1 + "\n\n저녁\n\n" + str2);
                myValues.add(str_Buffer.toString());
                str_Buffer.setLength(0);
            }


            adapter=new RecyclerViewAdapter(myValues);
            myView=(RecyclerView)findViewById(R.id.recyclerview);

            myView.setHasFixedSize(true);
            myView.setAdapter(adapter);


            myView.setLayoutManager(llm);
        }
    }
}