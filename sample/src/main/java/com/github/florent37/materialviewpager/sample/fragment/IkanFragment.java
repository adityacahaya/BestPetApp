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

import static com.github.florent37.materialviewpager.sample.R.color.ikan;

/**
 * Created by I Kadek Aditya on 5/9/2017.
 */

public class IkanFragment extends Fragment {

    public IkanFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.information_list, container, false);

        final ArrayList<Information> informations = new ArrayList<Information>();
        informations.add(new Information(R.drawable.ikan_manfish_deskripsi,"Manfish",R.drawable.ikan_manfish,"Ikan manfish ( Pterophyllum scalare ) adalah ikan hias air tawar yang indah, di kalangan para hobiis ikan hias juga disebut ikan angelfish. Karena gerakanya yang tenang, wujudnya, serta warnanya yang menarik inilah ikan manfish juga disebut ikan angelfish. Perairan Amazon, Brazil, Columbia, serta Peru di lokasi Amerika Selatan adalah habitat asli ikan manfish. Sekarang ikan manfish atau angelfish ini sudah banyak yang memebudidayanya di Indonesia. Ikan manfish tergolong kedalam family Cichlidea, ciri - ciri morfologis ikan manfish sangat unik dan menarik, dengan betuk tubuh pipih dan sirip bagian atas serta sirip bagian perut yang membentang lebar ke arah ekor menjadikan ikan manfish bak busur panah. Dengan sirip di dada yang panjang dan menjuntai hingga ke ekor membuat ikan manfish sangat menarik. Varian warna ikan manfish yang menarik serta tipe yang beragam, menambah daya tarik tersndiri. Tidak seperti ikan cupang yang memakan burayaknya, ikan manfish adalah ikan yang melindungi serta membuat perlindungan terhadap keturunanya. Dalam hal pakan, ikan manfish sangatlah mudah, karena ikan manfish bersifat omnivora.",R.color.ikan));
        informations.add(new Information(R.drawable.ikan_arwana_deskripsi,"Arwana",R.drawable.ikan_arwana,"Arwana Asia (Scleropages formosus), atau Siluk Merah adalah salah satu spesies ikan air tawar dari Asia Tenggara. Ikan ini memiliki badan yang panjang; sirip dubur terletak jauh di belakang badan. Arwana Asia umumnya memiliki warna keperak-perakan. Arwana Asia juga disebut \"Ikan Naga\" karena sering dihubung-hubungkan dengan naga dari Mitologi Tionghoa. Arwana Asia terdaftar dalam daftar spesies langka yang berstatus \"terancam punah\" oleh IUCN tahun 2004 [1]. Jumlah spesies ini yang menurun dikarenakan seringnya diperdagangkan karena nilainya yang tinggi sebagai ikan akuarium, terutama oleh masyarakat Asia. Pengikut Feng Shui dapat membayar harga yang mahal untuk seekor ikan ini. Arwana adalah ikan bertulang air tawar dari keluarga Osteoglossidae, juga dikenal sebagai bonytongues.[1] Arwana sebenarnya termasuk jenis ikan purba yang hingga kini belum punah.[2] Banyak nama yang melekat padanya, diantaranya ikan siluk, ikan kayangan, ikan kalikasi, dan ikan kelasa. Secara morfologis (ciri-ciri fisik), badan dan kepala arwana agak padat.[4] Tubuhnya pipih dan punggungnya datar, hampir lurus dari mulut hingga sirip punggung.[4] Garis lateral atau gurat sisi yang terletak di samping kiri dan kanan tubuh arwana panjangnya antara 20–24 cm.[4] Bentuk mulutnya mengarah keatas dan mempunyai sepasang sungut pada bibir bawah.[4] Ukuran mulutnya lebar dan rahangnya cukup kukuh.[4] Giginya berjumlah 15-17.[4] Bagian insangnya dilengkapi dengan penutup insang.[4] Letak sirip punggungnya berdekatan dengan pangkal sirip ekor (caudal).[4] Sirip anusnya lebih panjang daripada sirip punggung (dorsal), hampir mencapai sirip perut (ventral).[4] Panjang arwana dewasa sangat variatif, antara 30–80 cm.[4] Bentuk badannya gepeng dan bersisik besar meliuk-liuk indah saat berenang di akuarium.[3] Ditambah tumbuhnya dua sungut di ujung bibir bawah membuat ikan ini mirip liong atau naga.[3] Karena itu, tidak mengherankan jika sebagian masyarakat menyebutnya dengan kimliong atau ikan naga emas.[3] Layaknya naga, arwana juga dianggap sebagai simbol keberhasilan, keperkasaan, dan kejayaan.",R.color.ikan));
        informations.add(new Information(R.drawable.ikan_louhan_deskripsi,"Lou Han",R.drawable.ikan_louhan,"Ikan Lou Han (bahasa Inggris: Flowerhorn) ikan Louhan merupakan salah satu ikan hias terkenal yang dipelihara di dalam akuarium karena warna sisik mereka yang hidup serta benjolan kepala mereka yang berbentuk khas berjuluk \"benjol kelam\". Aslinya mereka hanya berhabitat di Malaysia dan Taiwan, namun saat ini banyak dipelihra oleh penggemar ikan di seluruh dunia. Progam pengembangbiakan telah dimulai sejak tahun 1993.[1] Orang Malaysia terutama banyak yang mengagumi ikan dengan kepala menonjol, yang dikenal sebagai Karoi atau \"kapal perang\", ditemukan di bagian barat negara mereka. Dahi sedikit menonjol dan ekor panjang ikan ini berharga untuk para peminat masyarakat Taiwan sebagai tanda pembawa keberuntungan dalam geomansi. Pada tahun 1994, iblis merah Cichlid (genus Amphilophus) yang diimpor dari Amerika Tengah ke Malaysia dan hasil hibrida parrot cichlid yang diimpor dari Taiwan ke Malaysia dan dibesarkan ikan ini secara bersamaan, menandai kelahiran ikan lou han tersebut. Pada tahun 1995, perkawinan persilangan diadakan lebih lanjut dengan Human Face Red God of Fortune, yang menghasilkan jenis baru yang disebut Five-Colors God of Fortune.[1] Karena warnanya yang indah, ikan ini menjadi cepat populer. Penyempurnaaan secara selektif terus berlanjut hingga tahun 1998, ketika Seven-Colors Blue Fiery Mouth (yang juga disebut sebagai Greenish Gold Tiger) yang diimpor dari Amerika Tengah, dan hasil perkawinan silangnya dengan Jin Gang Blood Parrot dari Taiwan.[1] Pembelesteran ini akhirnya menghasilkan generasi pertama hibrida flowerhorn Hua Luo Han, yang kemudian diikuti dengan perkenalan flowerhorn berikutnya",R.color.ikan));
        informations.add(new Information(R.drawable.ikan_koi_deskripsi,"Koi",R.drawable.ikan_koi,"Koi atau secara spesifiknya koi berasal dari bahasa Jepang yang berarti ikan karper. Lebih spesifik lagi merujuk pada nishikigoi (錦鯉?, English /ˈ[unsupported input]/), yang kurang lebih bermakna ikan karper yang bersulam emas atau perak. Di Jepang, koi menjadi semacam simbol cinta dan persahabatan. Ini karena koi merupakan homofon untuk kata lain yang juga bermakna kasih sayang atau cinta. Ikan Koi adalah sejenis ikan yang termasuk ikan mas (Cyprinus carpio) yang mempunyai ornamen yang sangat indah dan jinak. Koi biasanya dipelihara sebagai hiasan dengan tujuan keindahkan dan keberuntungan di dalam rumah dan luar rumah (kolam koi atau taman air, karena ikan koi dipercaya membawa keberuntungan. Karena ikan koi sangat dekat berkerabat dengan ikan mas, dan oleh karena itu di Indonesia banyak orang menyebutnya ikan mas koi. Jenis ikan koi dibedakan tergantung dari warnanya, polanya, dan ukurannya. Beberapa unsur warnanya adalah putih, hitam, merah, kuning, biru, dan krem. Jenis koi paling dikenal adalah jenis ''Gosanke'', yang terdiri dari Kohaku, Taisho Sanshoku, and Showa Sanshoku.",R.color.ikan));
        informations.add(new Information(R.drawable.ikan_mas_deskripsi,"Ikan Mas Hias",R.drawable.ikan_mas,"Ikan mas hias (Carassius auratus auratus) adalah ikan air tawar dari familia Cyprinidae dan ordo Cypriniformes. Ikan ini adalah salah satu ikan yang pertama kali berhasil didomestikasi, dipelihara, dan dibudidayakan manusia. Kini ikan mas hias atau kadang disebut secara singkat sebagai ikan mas, adalah salah satu ikan hias akuarium yang paling populer. Varietas Carassius auratus auratus yang telah didomestikasi dan menampilkan mutasi tubuh bersirip ekor ganda dan berbentuk memampat bulat disebut ikan maskoki. Sebagai salah satu anggota keluarga ikan mas (yang juga termasuk ikan koi dan karper krusia), ikan mas hias adalah versi domestikasi budidaya dari ikan spesies Carassius auratus yang aslinya tidak terlalu berwarna yang habitat aslinya di Asia timur. Ikan ini pertama kali dipelihara di Tiongkok lebih dari seribu tahun yang lalu, dan sejak itu beberapa ras berbeda telah dikembangkan. Ikan mas hias memiliki variasi yang luar biasa, seperti perbedaan ukuran, bentuk tubuh, susunan sirip, dan warna (berbagai kombinasi warna antara lain putih, kuning, jingga, merah, cokelat, dan hitam). Di Indonesia istilah ikan mas juga merujuk kepada ikan mas biasa atau ikan karper (Cyprinus carpio), yaitu kerabat ikan yang dapat dikonsumsi sebagai bahan pangan.",R.color.ikan));
        informations.add(new Information(R.drawable.ikan_cupang_deskripsi,"Ikan Cupang",R.drawable.ikan_cupang,"Ikan Cupang (Betta sp.) adalah ikan air tawar yang habitat asalnya adalah beberapa negara di Asia Tenggara, antara lain Indonesia, Thailand, Malaysia, Brunei Darussalam, Singapura, dan Vietnam. Ikan ini mempunyai bentuk dan karakter yang unik dan cenderung agresif dalam mempertahankan wilayahnya. Di kalangan penggemar, ikan cupang umumnya terbagi atas tiga golongan, yaitu cupang hias, cupang aduan, dan cupang liar. Di Indonesia terdapat cupang asli,salah satunya adalah Betta channoides yang ditemukan di Pampang, Kalimantan Timur. Ikan cupang adalah salah satu ikan yang kuat bertahan hidup dalam waktu lama sehingga apabila ikan tersebut ditempatkan di wadah dengan volume air sedikit dan tanpa adanya alat sirkulasi udara (aerator), ikan ini masih dapat bertahan hidup.",R.color.ikan));

        InformationAdapter informationAdapter = new InformationAdapter(getActivity(), informations, ikan);
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
