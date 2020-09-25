package com.example.ceng319w20assignment1;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment2 extends Fragment {
    TextView textView;
    String a = "\t\t\t\t" + "Main Activity" +"\n\t\t\t\t" + "onCreate Executed " + "\n\t\t\t\t" + "onStart Executed" ;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment2 newInstance(String param1, String param2) {
        fragment2 fragment = new fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);

        fragment.getView().setBackgroundColor(Color.RED);


        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =inflater.inflate(R.layout.bottomfragment, container, false);
        textView = (TextView) view.findViewById(R.id.bottomfragment);
        textView.setText(a);
        textView.setTextSize(30);

        return view;

    }


    public void onStart()
    {
        super.onStart();
        textView.setText(a);
        Log.d("Main Activity", "OnStart Executed");
        Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onStart Executed",Toast.LENGTH_LONG);
        toast.show();
    }

    public void onStop()
    {
        super.onStop();
        textView.setText(a);
        Log.d("Main Activity", "OnStop Executed");
    }

    public void onDestroy()
    {
        super.onDestroy();
        textView.setText(a);
        Log.d("Main Activity", "OnDestroy Executed");
    }



}