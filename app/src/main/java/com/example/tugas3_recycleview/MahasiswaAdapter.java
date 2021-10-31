package com.example.tugas3_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
    private ArrayList<Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.imPP.setImageResource(dataList.get(position).getFoto());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtAngkatan.setText(dataList.get(position).getAngkatan());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNim, txtAngkatan;
        private ImageView imPP;
        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            imPP = (ImageView) itemView.findViewById(R.id.img_pp);
            txtNama = (TextView) itemView.findViewById(R.id.tv_nama);
            txtNim = (TextView) itemView.findViewById(R.id.tv_nim);
            txtAngkatan = (TextView) itemView.findViewById(R.id.tv_angkatan);
        }
    }
}
