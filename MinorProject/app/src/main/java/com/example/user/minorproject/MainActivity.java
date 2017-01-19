package com.example.user.minorproject;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();
        LoginFrag f1 = new LoginFrag();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container1, f1);
        ft.commit();


}

    public void getViewRegisterByClick() {
        FragmentManager fm = getSupportFragmentManager();
        Register_Frag f1 = new Register_Frag();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container1, f1);
        ft.commit();
    }

    public void getLoginFragOnClick(){
        FragmentManager fm = getSupportFragmentManager();
        LoginFrag2 f1 = new LoginFrag2();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container1, f1);
        ft.commit();

    }

    public  void getDetailFragByClick(){
        FragmentManager fm = getSupportFragmentManager();
        DetailsFrag f1 = new DetailsFrag();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container1,f1);
        ft.commit();
    }
    public  void getStudentDetailByClick(){
        FragmentManager fm = getSupportFragmentManager();
        StudentDetail f1 = new StudentDetail();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container1,f1,"studentdetail");
        ft.commit();

    }

    public  void getDataLIstViewByClick(){
        FragmentManager fm = getSupportFragmentManager();
        DataListView f1 = new DataListView();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container1,f1);
        ft.commit();
    }

    public void getSearchByClick(){
        FragmentManager fm = getSupportFragmentManager();
        SearchFrag f1 = new SearchFrag();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container1,f1);
        ft.commit();

    }

    public void getDialogFragment(){
        FragmentManager fm = getSupportFragmentManager();
        DialogFrag1 df = new DialogFrag1();
       /* FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container1,df);
        ft.commit();*/
        df.show(getSupportFragmentManager(),"Date");
    }
    }


