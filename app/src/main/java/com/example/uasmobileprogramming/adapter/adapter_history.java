package com.example.uasmobileprogramming.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uasmobileprogramming.R;
import com.example.uasmobileprogramming.model.transaksi;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class adapter_history extends RecyclerView.Adapter<adapter_history.ViewHolder> {
    private Context context;
    private ArrayList<transaksi> list;

    public adapter_history(Context context, ArrayList<transaksi> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        transaksi transaksi = list.get(position);
        holder.image.setImageResource(transaksi.getId_image());
        holder.fashionname.setText(transaksi.getNama_fashion());
        holder.price.setText(transaksi.getPrice());
        holder.date.setText(transaksi.getTanggal_transaksi());
        holder.time.setText(transaksi.getWaktu_transaksi());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ShapeableImageView image;
        private TextView fashionname, price, date, time;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imagehistory);
            fashionname = itemView.findViewById(R.id.TextFashion);
            price = itemView.findViewById(R.id.TextPrice);
            date = itemView.findViewById(R.id.TextDate);
            time = itemView.findViewById(R.id.TextHours);
        }
    }
}
