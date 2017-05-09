package com.github.florent37.materialviewpager.sample;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

import static com.github.florent37.materialviewpager.sample.R.id.tv_namaTempat;

public class InformationAdapter extends ArrayAdapter<Information> {

    private int color;

    public InformationAdapter(Context context, ArrayList<Information> informations) {
        super(context, 0, informations);
    }

    public InformationAdapter(Context context, ArrayList<Information> words, int color) {
        super(context,0,words);
        this.color = color;
    }

    static class ViewHolder {
        TextView text;
        ImageView icon;
        View progress;
        int position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Information information = getItem(position);

        final ViewHolder holder = new ViewHolder();
        holder.icon = (ImageView)listItemView.findViewById(R.id.img_gambarTempat);
        holder.text = (TextView)listItemView.findViewById(tv_namaTempat);
        holder.progress = listItemView.findViewById(R.id.textList);
        listItemView.setTag(holder);

        holder.icon.setImageResource(information.getGambarTempat());
        holder.text.setText(information.getNamaTempat());
        int color = ContextCompat.getColor(getContext(),this.color);
        holder.progress.setBackgroundColor(color);

        return listItemView;
    }
}
