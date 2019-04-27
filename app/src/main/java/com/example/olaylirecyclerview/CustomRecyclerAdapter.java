package com.example.olaylirecyclerview;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {
    private Context context;
    private List<DepoSinif> personUtils;
    public CustomRecyclerAdapter(Context context, List personUtils) {
        this.context = context;
        this.personUtils = personUtils;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.teksatir, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(personUtils.get(position));
        DepoSinif pu = personUtils.get(position);
        holder.pName.setText(pu.getPersonName());
        holder.pJobProfile.setText(pu.getJobProfile());
    }
    @Override
    public int getItemCount() {
        return personUtils.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView pName;
        public TextView pJobProfile;
        public ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            pName = (TextView) itemView.findViewById(R.id.pNametxt);
            pJobProfile = (TextView) itemView.findViewById(R.id.pJobProfiletxt);
            imageView=itemView.findViewById(R.id.userImg);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DepoSinif cpu = (DepoSinif) view.getTag();

                    Toast.makeText(view.getContext(), cpu.getPersonName() + " is " + cpu.getJobProfile(), Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(context, Siniflarca.class);
                    intent.putExtra("send_string",cpu.getID());
                    intent.putExtra("send_ad",cpu.getPersonName());
                    context.startActivity(intent);



                }
            });
        }


    }

}