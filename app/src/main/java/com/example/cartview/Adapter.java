package com.example.cartview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<String> titles;
    List<String> prices;
    List<String> sizes;
    List<String> quantities;
    List<Integer> images;
    LayoutInflater inflater;

    public Adapter(Context ctx, List<String> titles, List<String> prices, List<String> sizes, List<String> quantities, List<Integer> images) {
        this.titles = titles;
        this.prices = prices;
        this.sizes = sizes;
        this.quantities = quantities;
        this.images = images;
        this.inflater = inflater;
        this.inflater=LayoutInflater.from(ctx);
    }
    /*
    public Adapter(Context ctx,List<String> titles, List<Integer> images){
        this.titles=titles;
        this.images=images;
        this.inflater=LayoutInflater.from(ctx);
    }
    
 */

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=inflater.inflate(R.layout.custom_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.title.setText(titles.get(position));
        holder.money.setText(prices.get(position));
        holder.siz.setText(sizes.get(position));
        holder.qnty.setText(quantities.get(position));
        holder.icon.setImageResource(images.get(position));

    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView money;
        TextView siz;
        TextView qnty;
        ImageView icon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.name);
            money=itemView.findViewById(R.id.price);
            siz=itemView.findViewById(R.id.size);
            qnty=itemView.findViewById(R.id.quantity);
            icon=itemView.findViewById(R.id.image);
        }
    }
}
