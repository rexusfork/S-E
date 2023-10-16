package com.example.uasmobileprogramming.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.uasmobileprogramming.Login_Activity;
import com.example.uasmobileprogramming.R;

public class profile_fragment extends Fragment {
    private Button BtnLogout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_fragment, container, false);
        InitiateViews(view);

        BtnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Login_Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    private void InitiateViews(View view){
        BtnLogout = view.findViewById(R.id.BtnLogout);
    }
}