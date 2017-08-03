package com.example.chaeyeon.registeration;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by ChaeYeon on 2017-07-18.
 */
public class BaseActivity extends AppCompatActivity {

        private ProgressDialog mProgressDialog;

        //loading 창 보여주기
        public void showProgressDialog() {
            if (mProgressDialog == null) {
                mProgressDialog = new ProgressDialog(this);
                mProgressDialog.setCancelable(false);
                mProgressDialog.setMessage("Loading...");
            }

            mProgressDialog.show();
        }

        public void hideProgressDialog() {
            if (mProgressDialog != null && mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }
        }

        //getUid
        public String getUid() {
            return FirebaseAuth.getInstance().getCurrentUser().getUid();
        }

    }
