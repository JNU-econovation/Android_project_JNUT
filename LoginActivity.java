package com.example.chaeyeon.registeration;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class LoginActivity extends AppCompatActivity {

    EditText idText, passwordText, nameText;
    String id_str, password_str, name_str;
    String urladdress;
    String response = "";
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        idText = (EditText) findViewById(R.id.idText);
        passwordText = (EditText) findViewById(R.id.passwordText);
        nameText = (EditText) findViewById(R.id.nameText);



        // 버튼 누르면 해당 url에 떠있는 json 긁어오기
        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                id_str = idText.getText().toString();
                password_str = passwordText.getText().toString();
                name_str = nameText.getText().toString();

                try {
                    name_str = URLEncoder.encode(name_str, "UTF-8");  // 한글을 유니코드로 인코딩해서 url에 넣어야 인식가능하다
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                urladdress = "http://portal.jnu.ac.kr/jnuapi/api/JnuUserYN?login_id=" + id_str + "&birth=" + password_str + "&name=" + name_str + "&apikey=E269ACC5-87CA-4F67-9803-BB415575B68F";


                new doit().execute();  // 통신 스레드 시작


            }
        });

    }


    public class doit extends AsyncTask<Void, Void, Void> {

        URL url;

        @Override
        protected Void doInBackground(Void... params) {
            try {

                url = new URL(urladdress);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                conn.setRequestMethod("GET");
                conn.setRequestProperty("Content-Type", "application/json");



                if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {   // url 연결 확인 후 긁어오기
                    String line;
                    BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    while ((line = br.readLine()) != null) {
                        response += line;
                    }
                    response = response.trim();  // json 빈칸 제거
                } else {
                    response = Integer.toString(conn.getResponseCode());  // http 통신 실패하면 해당 번호를 출력한다.

                }




            } catch (Exception e) {
                response = "shit";
                e.printStackTrace();

            }




            try {

                JSONObject json = new JSONObject(response);   // string에 들어있는 json 값을 변환한다.
                result = json.getInt("result");

            } catch (JSONException e) {
                e.printStackTrace();
            }





            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            if (result == 2) {
                Toast toast = Toast.makeText(getApplicationContext(), "전남대학교 재학생입니다.", Toast.LENGTH_SHORT);
                toast.show();
                response = "";
                urladdress = "";
                Intent intent = new Intent(LoginActivity.this, SignInActivity.class);
                LoginActivity.this.startActivity(intent);
            } else {
                Toast toast = Toast.makeText(getApplicationContext(), Integer.toString(result), Toast.LENGTH_SHORT);
                toast.show();
                response = ""; // 초기화 시켜줘야됌. 안그러면 클릭할때마다 계속 누적해서 문자열 저장
            }

        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }


    }

}