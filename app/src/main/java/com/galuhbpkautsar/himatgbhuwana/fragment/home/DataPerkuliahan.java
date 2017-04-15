package com.galuhbpkautsar.himatgbhuwana.fragment.home;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.galuhbpkautsar.himatgbhuwana.MainActivity;
import com.galuhbpkautsar.himatgbhuwana.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DataPerkuliahan extends Fragment {

    public DataPerkuliahan() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data_perkuliahan, container, false);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Data Perkuliahan");

        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        WebView wv1 = (WebView) view.findViewById(R.id.my_web_view);
        wv1.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
            }
        });

        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.loadUrl("http://sites.google.com/site/dataperkuliahantgunila");

        return view;
    }
}
