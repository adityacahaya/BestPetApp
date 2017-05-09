package com.github.florent37.materialviewpager.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.github.florent37.materialviewpager.MaterialViewPager;

import butterknife.BindView;

import static java.security.AccessController.getContext;

public class InformationDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_detail);

        Intent intent = getIntent();
        Information information = (Information) intent.getSerializableExtra("pass_information");

        TextView textViewJudul = (TextView)findViewById(R.id.tv_judul);
        textViewJudul.setText(information.getNamaTempat());

        ImageView imageViewTempat = (ImageView)findViewById(R.id.tv_imageInformasi);
        imageViewTempat.setImageResource(information.getGambarDeskripsi());

        TextView textViewInfo = (TextView)findViewById(R.id.tv_informasi);
        textViewInfo.setText(information.getDeskripsiTempat());

        View view = this.findViewById(R.id.informasi_detil_layout_scroll);
        int color = ContextCompat.getColor(this,information.getBackgroundWarna());
        view.setBackgroundColor(color);

        setTitle(textViewJudul.getText());

        ImageButton imageButton = (ImageButton)findViewById(R.id.btn_back);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationDetail.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
