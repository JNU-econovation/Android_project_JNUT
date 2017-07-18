package com.example.chaeyeon.registeration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ChaeYeon on 2017-05-05.
 */

public class BoardActivity extends AppCompatActivity {
    EditText editText;
    //private final String fileName = "items.list";
    ArrayList<SingerItem> items = new ArrayList<SingerItem>();
    ListView listView;
    SingerAdapter adapter;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boardmain);
        listView = (ListView) findViewById(R.id.listView);
        adapter = new SingerAdapter();

        /*adapter.addItem(new SingerItem("소녀시대", R.drawable.acorn));
        adapter.addItem(new SingerItem("걸스데이", R.drawable.acorn));
        adapter.addItem(new SingerItem("여자친구",  R.drawable.acorn));
        adapter.addItem(new SingerItem("AOA",  R.drawable.acorn));
        adapter.addItem(new SingerItem("트와이스",  R.drawable.acorn));*/

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id){
                SingerItem item = (SingerItem) adapter.getItem(position);
                Toast.makeText(getApplicationContext(), "선택 : " + item.getName(), Toast.LENGTH_LONG).show();

            }
        });

        //버튼을 누르면 추가가 된다.
        addButton = (Button)findViewById(R.id.add);
        addButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                   // Intent intent = new Intent(BoardActivity.this, Write.class);
                  //  startActivity(intent);
                }
        //adapter.addItem(new SingerItem("블랙핑크", R.drawable.acorn));
        //adapter.notifyDataSetChanged();
    });

    }

    class SingerAdapter extends BaseAdapter {
        //ArrayList<SingerItem> items = new ArrayList<SingerItem>();
        //SingerItem에 저장해 놓은 데이터가 들어간다.


        @Override
        public int getCount() {
            return items.size();
        } //갖고 있는 데이터 개수

        public void addItem(SingerItem item) {
            items.add(item);
        } //추가해 줄 수 있는 메소드

        @Override
        public Object getItem(int position) {
            return items.get(position);
        } //실제 아이템

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            SingerItemView view = new SingerItemView(getApplicationContext());
            //새로만든 singerItem view를 넣어준다.
            SingerItem item = items.get(position);
            view. setName(item.getName());
            view.setImage(item.getResId());

            return view;

        }
    }
}