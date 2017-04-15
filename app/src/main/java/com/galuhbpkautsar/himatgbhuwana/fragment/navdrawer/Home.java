package com.galuhbpkautsar.himatgbhuwana.fragment.navdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.galuhbpkautsar.himatgbhuwana.HomeItemGridAdapter;
import com.galuhbpkautsar.himatgbhuwana.HomeItemGridAdapter2;
import com.galuhbpkautsar.himatgbhuwana.HomeItemGridAdapter3;
import com.galuhbpkautsar.himatgbhuwana.MainActivity;
import com.galuhbpkautsar.himatgbhuwana.R;
import com.galuhbpkautsar.himatgbhuwana.fragment.home.DataMahasiswa;
import com.galuhbpkautsar.himatgbhuwana.fragment.home.DataPerkuliahan;
import com.galuhbpkautsar.himatgbhuwana.fragment.home.ELecture;
import com.galuhbpkautsar.himatgbhuwana.fragment.home.Gallery;
import com.galuhbpkautsar.himatgbhuwana.fragment.home.WebHima;
import com.galuhbpkautsar.himatgbhuwana.fragment.home.WebJurusan;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

//    private ImageView webHima;
//    private ImageView webJurusan;
//    private ImageView dataPerkuliahan;
//    private ImageView dataMahasiswa;
//    private ImageView gallery;
//    private ImageView eLecture;
//    private ImageView calendar;

    public Home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        webHima = (ImageView) view.findViewById(R.id.web_hima);
//        webJurusan = (ImageView) view.findViewById(R.id.web_jurusan);
//        dataPerkuliahan = (ImageView) view.findViewById(R.id.data_perkuliahan);
//        dataMahasiswa = (ImageView) view.findViewById(R.id.data_mahasiswa);
//        gallery = (ImageView) view.findViewById(R.id.gallery);
//        eLecture = (ImageView) view.findViewById(R.id.e_lecture);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Hima TG Bhuwana");

        Integer[] icons = {R.drawable.ic_web, R.drawable.ic_web, R.drawable.ic_college, R.drawable.ic_student,
                             R.drawable.ic_gallery, R.drawable.ic_lecture, R.drawable.ic_calendar};
        final Class[] classIcon = {WebHima.class, WebJurusan.class, DataPerkuliahan.class, DataMahasiswa.class,
                            Gallery.class, ELecture.class};

        GridView gridView1 = (GridView) view.findViewById(R.id.home_gv_1);
        gridView1.setAdapter(new HomeItemGridAdapter(getContext(), icons));

        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view,
                                    int position, long id) {
                doFragment(position, classIcon);
            }
        });

//
//        GridView gridView2 = (GridView) view.findViewById(R.id.home_gv_2);
//        gridView2.setAdapter(new HomeItemGridAdapter2(getContext()));
//
//        GridView gridView3 = (GridView) view.findViewById(R.id.home_gv_3);
//        gridView3.setAdapter(new HomeItemGridAdapter3(getContext()));

        return view;
    }

    public void doFragment(int position, Class[] classIcon) {
        switch (position) {
            case 0: doFragment2(position, classIcon, new WebHima());
                break;
            case 1: doFragment2(position, classIcon, new WebJurusan());
                break;
            case 2: doFragment2(position, classIcon, new DataPerkuliahan());
                break;
            case 3: doFragment2(position, classIcon, new DataMahasiswa());
                break;
            case 4: doFragment2(position, classIcon, new Gallery());
                break;
            case 5: doFragment2(position, classIcon, new ELecture());
                break;
            case 6: ;
                break;
            default: ;
                break;
        }
    }

    public void doFragment2(int position, Class[] classIcon, Fragment fragment) {
        getFragmentManager().beginTransaction().
                replace(R.id.frame_container,
                        fragment,
                        classIcon[position].getSimpleName())
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



//        webHima.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().
//                        replace(R.id.frame_container,
//                                new WebHima(),
//                                WebHima.class.getSimpleName())
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//        webJurusan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().
//                        replace(R.id.frame_container,
//                                new WebJurusan(),
//                                WebJurusan.class.getSimpleName())
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//        dataPerkuliahan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().
//                        replace(R.id.frame_container,
//                                new DataPerkuliahan(),
//                                DataPerkuliahan.class.getSimpleName())
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//        dataMahasiswa.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().
//                        replace(R.id.frame_container,
//                                new DataMahasiswa(),
//                                DataMahasiswa.class.getSimpleName())
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//        gallery.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().
//                        replace(R.id.frame_container,
//                                new Gallery(),
//                                Gallery.class.getSimpleName())
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//        eLecture.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().
//                        replace(R.id.frame_container,
//                                new ELecture(),
//                                ELecture.class.getSimpleName())
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });

//        calendar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().
//                        replace(R.id.frame_container,
//                                new WebHima(),
//                                WebHima.class.getSimpleName())
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
    }
}
