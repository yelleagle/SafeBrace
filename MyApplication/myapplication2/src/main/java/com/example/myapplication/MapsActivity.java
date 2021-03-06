package com.example.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float zoom = 15;
        // Add a marker in Sydney and move the camera
        LatLng davis = new LatLng(38.5449, -121.7405);
        mMap.addMarker(new MarkerOptions().position(davis).title("Your Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom (davis, zoom));

        LatLng crime1 = new LatLng(38.555, -121.748);
        mMap.addMarker(new MarkerOptions().position(crime1).title("DUI charge in Anderson/F"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(davis));
        //mMap.animateCamera(CameraUpdateFactory.zoomBy(zoom));
    }

}
