package com.example.dell.techinfo;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class newsfeed extends Fragment {
    Button btn,btn2,btn3,btn4,btn5,btn6;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_newsfeed, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn2 = (Button) getView().findViewById(R.id.news2);
        btn = (Button) getView().findViewById(R.id.news1);
        btn3= (Button) getView().findViewById(R.id.news3);
        btn4= (Button) getView().findViewById(R.id.news4);
        btn5= (Button) getView().findViewById(R.id.news5);
        btn6= (Button) getView().findViewById(R.id.news6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main, new news1());
                ft.addToBackStack(null);
                ft.commit();
            }
        });

         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 FragmentManager fm = getFragmentManager();
                 android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                 ft.replace(R.id.main, new news2());
                 ft.addToBackStack(null);
                 ft.commit();
             }
         });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main, new news3());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main, new news4());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main, new news5());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main, new news6());
                ft.addToBackStack(null);
                ft.commit();
            }
        });





    }


}
