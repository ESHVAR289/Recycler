package com.einfoplanet.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bridgelabz5 on 7/4/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
  //  private static final int TYPE_HEAD=0;
  //  private static final int TYPE_LIST=1;

    ArrayList<ListProvider> arrayList=new ArrayList<ListProvider>();

    public RecyclerAdapter(ArrayList<ListProvider> arrayList){
        this.arrayList=arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        RecyclerViewHolder recyclerViewHolder;
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);

        recyclerViewHolder=new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        ListProvider listProvider;

        listProvider=arrayList.get(position);
        holder.listImage.setImageResource(listProvider.getImage_id());
        holder.listCountry.setText(listProvider.getCountryName());
        holder.listCapital.setText(listProvider.getCapitalName());
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        //variables for list
        ImageView listImage;
        TextView listCountry,listCapital;

        //variables head section
        TextView titleFlag,titleCountry,titleCapital;

        public RecyclerViewHolder(View view){
            super(view);
            listImage=(ImageView)view.findViewById(R.id.flag_id);
            listCountry=(TextView)view.findViewById(R.id.country_id);
            listCapital=(TextView)view.findViewById(R.id.capital_id);
        }
    }
    
}
