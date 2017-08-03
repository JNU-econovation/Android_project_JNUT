package com.example.chaeyeon.registeration;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * Created by ChaeYeon on 2017-05-05.
 *
 * AIzaSyCepzXN5XAby5KwAfBYYlSQR5eDXLxXU9Q  Google api key
 * 애플리케이션에서 이 키를 사용하려면 키를 key=API_KEY 매개변수로 전달하세요
 */

public class MapActivity extends AppCompatActivity
     implements OnMapReadyCallback

    {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_map);

            FragmentManager fragmentManager = getFragmentManager();
            MapFragment mapFragment = (MapFragment)fragmentManager
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }

        @Override
        public void onMapReady(final GoogleMap map) {

            LatLng JNU = new LatLng(35.1759333, 126.90859539999997);

            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(JNU);
            markerOptions.title("전남대학교");
            markerOptions.snippet("한국 최고의 대학");
            map.addMarker(markerOptions);

            map.moveCamera(CameraUpdateFactory.newLatLng(JNU));
            map.animateCamera(CameraUpdateFactory.zoomTo(17));
        }

    }