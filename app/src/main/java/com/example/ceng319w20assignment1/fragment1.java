package com.example.ceng319w20assignment1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment1 extends Fragment {

    String[] top = new String[]
            {
                    "AI Activity","VR Activity"};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment1 newInstance(String param1, String param2) {
        fragment1 fragment = new fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
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
        View view = inflater. inflate(R.layout.topfragment, container, false);
        //ArrayAdapter creates a view for each array item
        // by calling toString() on each item and placing
        // the contents in a TextView.
        ListView listView = (ListView) view.findViewById(R.id.topfragment);
        ArrayAdapter<String> adapter =

                new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, top);
        //bind the list view with array adapter
        listView.setAdapter(adapter);

        Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onCreateExecuted",Toast.LENGTH_LONG);
        toast.show();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(position ==0)
                {
                    Intent intent = new Intent(view.getContext(),AIActivity.class);
                    startActivity(intent);
                }

                if(position ==1)
                {
                    Intent intent = new Intent(view.getContext(),VRActivity.class);
                    startActivity(intent);
                }



            }
        });


        return view;
    }

    public void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onStartExecuted",Toast.LENGTH_LONG);
        toast.show();
    }


}