package com.example.user.minorproject;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFrag2 extends Fragment {
    TextView tv1,tv2,tv3;
    EditText et1,et2,et3;
    Button b1,b2;
    SharedPreferences sp;


    public LoginFrag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login_frag2,container,false);
        tv1 = (TextView) v.findViewById(R.id.sloginText_1);
        tv2 = (TextView) v.findViewById(R.id.sloginText_2);
        tv3 = (TextView) v.findViewById(R.id.sloginText_3);
        et1 = (EditText) v.findViewById(R.id.sloginEdit_1);
        et2 = (EditText) v.findViewById(R.id.sloginEdit_2);
        et3 = (EditText) v.findViewById(R.id.sloginEdit_3);
        b1 = (Button) v.findViewById(R.id.sloginButton_1);
        b2 = (Button) v.findViewById(R.id.sloginButton_2);
        final SharedPreferences sp = getActivity().getSharedPreferences("credentials",0);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = et1.getText().toString().trim();
                String pswd = et2.getText().toString().trim();
                String ename = sp.getString("Ename",null);
                String password = sp.getString("Password",null);
                Log.d("uname",ename);
                Log.d("password",pswd);
                if(uname.equals(ename) && (pswd.equals(password))){
                    MainActivity m = (MainActivity) getActivity();
                    m.getDetailFragByClick();
                }
                else{
                    Toast.makeText(getActivity(),"Invalid Username/password",Toast.LENGTH_LONG).show();
                }

            }
        });

        /*b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = et1.getText().toString().trim();
                String pswd = et2.getText().toString().trim();
                String sname = sp.getString("Ename",null);
                String password = sp.getString("Password",null);
                Log.d("uname",sname);
                Log.d("password",pswd);
                if(uname.equals(sname) && (pswd.equals(password))) {
                    MainActivity m = (MainActivity) getActivity();
                    m.getDetailFragByClick();
                }
            }
        });*/
        return v;
    }

}
