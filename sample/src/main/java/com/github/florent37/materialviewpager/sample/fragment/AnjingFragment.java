package com.github.florent37.materialviewpager.sample.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.github.florent37.materialviewpager.sample.Information;
import com.github.florent37.materialviewpager.sample.InformationAdapter;
import com.github.florent37.materialviewpager.sample.InformationDetail;
import com.github.florent37.materialviewpager.sample.R;

import java.util.ArrayList;

import static com.github.florent37.materialviewpager.sample.R.color.anjing;

/**
 * Created by I Kadek Aditya on 5/8/2017.
 */

public class AnjingFragment extends Fragment {

    public AnjingFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.information_list, container, false);

        final ArrayList<Information> informations = new ArrayList<Information>();
        informations.add(new Information(R.drawable.anjing_pitbull_deskripsi,"American Pit Bull Terrier",R.drawable.anjing_pitbull,getString(R.string.deskripsi_anjing_pitbull), anjing));
        informations.add(new Information(R.drawable.anjing_siberian_deskripsi,"Siberian Husky",R.drawable.anjing_siberian,getString(R.string.deskripsi_anjing_siberian), anjing));
        informations.add(new Information(R.drawable.anjing_labrador_deskripsi,"Labrador Retriever",R.drawable.anjing_labrador,"Labrador Retriever Canis familiaris (atau sering hanya disebut \"Labrador\") adalah salah satu dari beberapa jenis anjing pemungut buruan (retriever) dan salah satu anjing ras terpopuler di dunia karena enerjik, pandai, dan bersahabat sehingga cocok dijadikan anjing pekerja. Labrador Retriever terkenal pintar dan cepat belajar, serta senang dipuji dan diperhatikan. Sebagian besar Labrador sangat senang main air, sehingga sengaja dibiakkan untuk mengambil hewan buruan yang jatuh ke air. Pemburu bebek liar sering ditemani anjing Labrador untuk mengambil bebek hasil buruan di semak-semak atau di air dan memberikannya (retrieve) untuk sang majikan.", anjing));
        informations.add(new Information(R.drawable.anjing_beagle_deskripsi,"Beagle",R.drawable.anjing_beagle,getString(R.string.deskripsi_anjing_beagle), anjing));
        informations.add(new Information(R.drawable.anjing_dobermen_deskripsi,"Dobermann Pinscer",R.drawable.anjing_dobermen,"Karakter lengkap yang dimiliki oleh jenis Dobermann Pinscer (DP) ini antara lain keberanian, kekuatan, kecepatan, ketahanan, kepintaran, serta yang tak kalah adalah kesetiaan kepada sang pemilik. Banyak yang mengatakan bahwa anjing berjenis DP ini merupakan one man dog, yakni jenis anjing yang hanya patuh dan setia kepada pemiliknya saja, namun yang lain berpendapat bahwa DP tak beda dengan jenis anjing lain yang kepatuhan dan kesetiaan yang dimilikinya tergantung dari cara perawatannya sedari kecil. Namun terlepas dari kedua garis besar pendapat tersebut, sesuai dengan sejarah perolehan jenis anjing DP ini, hingga kini DP kerap digunakan sebagai anjing penjaga hingga anjing kepolisian karena memang karakter seperti inilah yang diperlukan. ", anjing));
        informations.add(new Information(R.drawable.anjing_buldog_deskripsi,"Buldog",R.drawable.anjing_buldog,"Bulldog adalah salah satu anjing ras tertua di dunia yang berasal dari Inggris, maka sering dikenal sebagai English Bulldog. Mula-mula anjing ini dipelihara sebagai anjing adu/petarung dengan sapi liar/banteng, sehingga Bulldog merupakan anjing yang agresif dan tangguh. Sekitar tahun 1835, pertarungan anjing dilarang oleh Undang-undang di Inggris, sehingga Bulldog dipelihara dan dibiakkan untuk maksud yang berbeda, yakni anjing sahabat (Companion Dog). Secara bertahap Bulldog dibiakkan menjadi anjing sahabat manusia yang baik, termasuk dengan anak-anak. Anatomi juga mengalami perubahan dari anjing yang cukup tinggi menjadi anjing yang pendek dan lucu serta berhidung pesek. Saat ini Bulldog dikenal sebagai anjing sahabat yang baik , tidak agresif walaupun tampangnya menyeramkan. Bulldog cocok dipelihara di dalam rumah sebagai anjing keluarga yg setia dan baik. Namun simbol sebagai anjing yang tangguh dan berani tetap melekat pada Bulldog. Bulldog banyak digunakan sebagai lambang keberanian dan ketangguhan di militer maupun anjing nasional kebanggaan Inggris.", anjing));

        InformationAdapter informationAdapter = new InformationAdapter(getActivity(), informations, anjing);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(informationAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Information information = informations.get(position);
                Intent intent = new Intent(getActivity(),InformationDetail.class);
                intent.putExtra("pass_information",information);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
