package com.vinod.viewpagerapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tablayout_in_Android.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tablayout_in_Android#newInstance} factory method to
 * create an instance of this fragment.
 */
@SuppressLint("ValidFragment")
public class Tablayout_in_Android extends Fragment {

    private   ArrayList<String> list;
    private ArrayAdapter<String> adapter = null;
    Context context;
    int position ;
    @SuppressLint("ValidFragment")
    public Tablayout_in_Android(ArrayList<String> list,Context context ) {
        // Required empty public constructor
        this.list=list;
        this.context=context;

        log("Constructor  ");

    }
    void log(String str)
    {
        Log.d("Fragment : ", str);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("OnCreate ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout llmain = (FrameLayout) inflater.inflate(R.layout.fragment_tablayout_in__android, container, false);
        ListView lv = llmain.findViewById(R.id.lv);
        adapter = new ArrayAdapter<String>(context , android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adapter);
        log("onCreateVew "+position);
        return  llmain;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        log("onActivityCreated  "+position);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        log("onViewCreated  "+position);
    }

    @Override
    public void onStart() {
        log("onStart  "+position);
        super.onStart();
    }


    @Override
    public void onResume() {
        super.onResume();
        log("onResume  "+position);
    }

    @Override
    public void onPause() {
        super.onPause();
        log("onPause  "+position);
    }

    @Override
    public void onStop() {
        super.onStop();
        log("onStop  "+position);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        log("onDestory  "+position);
    }
}
