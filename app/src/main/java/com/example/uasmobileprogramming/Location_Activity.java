package com.example.uasmobileprogramming;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.StrictMode;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;

import org.osmdroid.api.IMapController;
import org.osmdroid.bonuspack.location.NominatimPOIProvider;
import org.osmdroid.bonuspack.location.POI;
import org.osmdroid.bonuspack.overlays.GroundOverlay;
import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.FolderOverlay;
import org.osmdroid.views.overlay.Marker;

import java.util.ArrayList;

public class Location_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = getApplicationContext();
        Configuration.getInstance().load(context, PreferenceManager.getDefaultSharedPreferences(context));
        setContentView(R.layout.activity_location);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        MapView map = (MapView) findViewById(R.id.map);
        map.setMultiTouchControls(true);
        GeoPoint Outlet_A = new GeoPoint(-6.915845285206341,107.58613438261567);
        GeoPoint Outlet_B = new GeoPoint(-6.916319633556482,107.59370478791487);
        GeoPoint Outlet_C = new GeoPoint(-6.912804868628957,107.59174141113208);

        IMapController mapController = map.getController();
        mapController.setZoom(18);
        mapController.setCenter(Outlet_A);

        NominatimPOIProvider poiProvider = new NominatimPOIProvider("OSMBonusPackTutoUserAgent");
        ArrayList<POI> pois = poiProvider.getPOICloseTo(Outlet_A, "Outlet", 50, 1);

        // Outlet A
        Marker OutletA = new Marker(map);
        OutletA.setTitle("Outlet A");
        OutletA.setIcon(getResources().getDrawable(R.drawable.pin));
        OutletA.setPosition(Outlet_A);
        OutletA.setSnippet("Bandung, Ciroyom, Kec. Andir, Kota Bandung, Jawa Barat 40182");
        OutletA.setPosition(Outlet_A);
        OutletA.setImage(getResources().getDrawable(R.drawable.aaa));
        OutletA.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(OutletA);

        // Outlet B
        Marker OutletB = new Marker(map);
        OutletB.setTitle("Outlet B");
        OutletB.setIcon(getResources().getDrawable(R.drawable.pin));
        OutletB.setSnippet("Jl. Kebon Jati No.218, Kb. Jeruk, Kec. Andir, Kota Bandung, Jawa Barat 40181");
        OutletB.setPosition(Outlet_B);
        OutletB.setImage(getResources().getDrawable(R.drawable.bbb));
        OutletB.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(OutletB);

        // Outlet C
        Marker OutletC = new Marker(map);
        OutletC.setTitle("Outlet C");
        OutletC.setIcon(getResources().getDrawable(R.drawable.pin));
        OutletC.setSnippet("Jl. Simpang Industri 3-5, Arjuna, Kec. Cicendo, Kota Bandung, Jawa Barat 40172");
        OutletC.setPosition(Outlet_C);
        OutletC.setImage(getResources().getDrawable(R.drawable.ccc));
        OutletC.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(OutletC);
    }
}