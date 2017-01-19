package com.example.user.minorproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFrag extends Fragment {
    Button b1,b2;
    TextView tv1,tv2,tv3;
    ImageView iv1,iv2;


    public LoginFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login,container,false);
        tv1 = (TextView) v.findViewById(R.id.loginText_1);
        tv2 = (TextView) v.findViewById(R.id.loginText_2);
        tv3 = (TextView) v.findViewById(R.id.loginText_3);
        iv1 = (ImageView) v.findViewById(R.id.loginImageView_1);
        iv2 = (ImageView) v.findViewById(R.id.loginImageView_2);
        b1 = (Button) v.findViewById(R.id.loginButton_1);
        b2 = (Button) v.findViewById(R.id.loginButton_2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity m = (MainActivity) getActivity();
                m.getViewRegisterByClick();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.getLoginFragOnClick();

            }
        });
        return v;
    }

}
