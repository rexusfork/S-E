package com.example.uasmobileprogramming.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.uasmobileprogramming.Location_Activity;
import com.example.uasmobileprogramming.R;

import java.util.ArrayList;

public class home_fragment extends Fragment {
    private ArrayList<SlideModel> slideModels;
    private ImageSlider slider;

    private ImageButton btnLocationActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_fragment, container, false);
        InitiateViews(view);
        SlideModels();

        btnLocationActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Location_Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    private void InitiateViews(View view){
        slider = (ImageSlider) view.findViewById(R.id.Imageslider);
        btnLocationActivity = view.findViewById(R.id.StoreBtn);
    }

    private void SlideModels(){
        slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.model1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.model2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.model3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.model4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.model5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.model6, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.model7, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.model8, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.model9, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.model10, ScaleTypes.FIT));
        slider.startSliding(2000);
        slider.setSlideAnimation(AnimationTypes.ZOOM_OUT);
        slider.setImageList(slideModels, ScaleTypes.FIT);
    }
}