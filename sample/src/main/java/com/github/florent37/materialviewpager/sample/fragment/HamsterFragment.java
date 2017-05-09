package com.github.florent37.materialviewpager.sample.fragment;

import android.content.Intent;
import android.os.Bundle;
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

import static com.github.florent37.materialviewpager.sample.R.color.hamster;

/**
 * Created by I Kadek Aditya on 5/9/2017.
 */

public class HamsterFragment extends Fragment {

    public HamsterFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.information_list, container, false);

        final ArrayList<Information> informations = new ArrayList<Information>();
        informations.add(new Information(R.drawable.hamster_campbell_deskripsi,"Hamster Kerdil Campbell",R.drawable.hamster_campbell,"Hamster kerdil Campbell (Phodopus campbelli) adalah salah satu spesies hamster. Hamster ini ditemukan oleh W.C. Campbell tahun 1902 di Tuva, daerah yang secara geografis dan sejarah terhubung dengan Tiongkok dan Rusia. Hamster ini juga hidup di Asia Tengah, pegunungan Altay, dan provinsi Heilungkiang dan Hebei di Tiongkok timur laut. Habitat aslinya adalah padang rumput, padang pasir dan semi gurun, lebih dapat ditemukan hidup pada tanah dengan substrat lebih kuat daripada roborovski. Hamster tidak suka keadaan berair, panas, dan berangin.. Biasanya di alam lebih sering memakan biji-bijian dan serangga. Campbell adalah hewan nokturnal. Masa kehamilannya 20-22 hari. Pada tahun pertama meraka sangat produktif untuk berkemmbang biak. Hamster campbell adalah hamster yang galak. Dan perlu di juga anda untuk rutin membersihkan kandangnya agar terhindar dari penyakit.",R.color.hamster));
        informations.add(new Information(R.drawable.hamster_eropa_deskripsi,"Hamster Eropa",R.drawable.hamster_eropa,"Hamster Eropa, Cricetus cricetus adalah salah satu spesies hamster yang habitatnya berada di Eropa. Biasanya hamster ini ditemukan di peternakan, walaupun mungkin juga hidup di padang rumput dan kebun. Hamster ini dapat ditemukan di Belgia, Elsas , Rusia dan Rumania. Hamster Eropa lebih besar daripada hamster Suriah atau hamster kerdil dan biasanya disimpan sebagai binatang peliharaan.",R.color.hamster));
        informations.add(new Information(R.drawable.hamster_tiongkok_deskripsi,"Hamster Tiongkok",R.drawable.hamster_tiongkok,"Hamster Tiongkok (juga disebut Cricetulus griseus) adalah salah satu spesies hamster , yang habitatnya terletak di Tiongkok utara dan Mongolia. Binatang memiliki panjang sekitar 7.5 sampai 9 sentimeter dan berat 50-75 gram pada hamster dewasa. Lama hidup hamster ini sekitar 2 sampai 3 tahun. Hamster Tiongkok biasanya disimpan sebagai binatang peliharaan atau menjadi binatang penelitian di laboratorium.",R.color.hamster));
        informations.add(new Information(R.drawable.hamster_roborovski_deskripsi,"Hamster Roborovski",R.drawable.hamster_roborovski,"Roborovskis (Phodopus roborovskii) adalah spesies hamster yang terkecil dan tercepat dari semua hamster dimana paling sering disimpan sebagai binatang peliharaan. Hamster Roborovskis hidup di Gurun Gobi, padang pasir Mongolia dan Tiongkok utara. Mereka biasanya menggali lubang di antara 60 sampai 200 sentimeter dibawah tanah.Hamster Roborovski (Phodopus roborovskii) adalah hamster terkecil dan tercepat dari beberapa hamster yang lain. hamster ini berasal dari mongol bagian barat dan timur serta sebelah utara cina. Roborovski hidup di dalam lubang sedalam 50 – 150 cm. Umur hamster ini dapat hidup sekitar 2 sampai 3 tahun. Hamster sangat jarang menggigit dan cenderung takut pada manusia dibandingkan yang lain. Hamster jenis ini memiliki kumis yang sangat banyak. Hamster jenis ini tidak disarankan untuk pemula. Roborovski adalah hamster yang sangat romantis dan sayang satu sama lain. Jika hamster roborovski tinggal bersama-sama pada usia dini, mereka akan tidur bersama-sama, makan dan bermain bersama-sama. Roborovskis tumbuh sekitar 4 – 5cm panjang dan tidak sampai 7cm sebagaimana banyak sumber mengatakan. Memiliki tubuh berbentuk peluru dan kaki belakang yang sangat panjang untuk berjalan cepat. Dan berhati-hatilah saat anda memegangnya, karena hamster ini dapat berlari-lari dan ketakutan. Hamster ini menghasilkan 4-6 bayi hamster. Dan masa hamil hamser roborovski adalah 23-30 hari. Kelebihan dan kekurangan hamster roborovski adalah Kelebihan hamster roborovski: Salah satu hamster yang paling digemari juga karena ukurannya yang paling kecil. Mukanya yang paling berbeda dibanding hamster lain. Lincah dan suka bermain jadi terlihat lebih aktif. Kekurangan Hamster Roborovski: Sulit dipegang karena biasanya mereka melompat jika berada di tangan manusia. Terlalu kecil untuk digenggam dengan nyaman. Sifatnya terlalu penakut. Hamster yang paling tidak cocok untuk anak-anak kecil yang baru mulai belajar memelihara binatang. Hamster satu ini paling susah untuk diternakkan,  karena gen mereka yg susah untuk dapat terjadi pembuahan di dalam, dan dominan pria dibandingkan betina untuk generasi turunannya. ",R.color.hamster));
        informations.add(new Information(R.drawable.hamster_suriah_deskripsi,"Hamster Suriah",R.drawable.hamster_suriah,"Hamster Suriah atau Hamster Emas, Mesocricetus auratus, adalah seekor jenis hamster anggota subfamili Cricetinae. Pada alam bebas, mereka adalah binatang yang terancam[1], tetapi populer sebagai binatang peliharaan dan binatang untuk penelitian ilmu pengetahuan. Pada hamster Suriah dewasa berkembang dengan panjang 5 sampai 7 inci (12.5 sampau 17.5 sentimeter), dan lama hidupnya sekitar 2 sampai 3 tahun.",R.color.hamster));
        informations.add(new Information(R.drawable.hamster_kerdil_deskripsi,"Hamster Kerdil Putih Rusia",R.drawable.hamster_kerdil,"Hamster kerdil putih rusia adalah spesies hamster pada genus Phodopus. Hamster ini terutama hidup di Siberia dan juga dapat ditemukan di Dzungaria, Kazakhstan, Mongolia dan Manchuria. Lama kehidupan hamster ini berkisar sekitar 1½ sampai 2 tahun, walaupun hamster tersebut dapat hidup lebih lama.",R.color.hamster));

        InformationAdapter informationAdapter = new InformationAdapter(getActivity(), informations, hamster);
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
