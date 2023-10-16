package com.example.uasmobileprogramming.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uasmobileprogramming.R;
import com.example.uasmobileprogramming.adapter.adapter_history;
import com.example.uasmobileprogramming.model.transaksi;

import java.util.ArrayList;


public class history_fragment extends Fragment {
    private RecyclerView ListHistory;
    private ArrayList<transaksi> list;
    private adapter_history adapterHistory;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history_fragment, container, false);
        InitiateViews(view);
        return view;
    }

    private void InitiateViews(View view){
        ListHistory = view.findViewById(R.id.ReyclerViewerAdapter);

        list = new ArrayList<>();
        list.add(new transaksi(R.drawable.lisashirt,"Blue Jacket","$ 550","08:27","23-10-2022"));
        list.add(new transaksi(R.drawable.download,"Black T-Shirt","$ 300","09:27","23-10-2022"));
        list.add(new transaksi(R.drawable.jisoshirt,"Blue White Shirt","$ 500","10:27","23-10-2022"));
        adapterHistory = new adapter_history(getContext(),list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        ListHistory.setLayoutManager(layoutManager);
        ListHistory.setAdapter(adapterHistory);
    }
}