package com.example.user.minorproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 07-04-2016.
 */
public class MyDatabase {

    private MyHelper m;
    private SQLiteDatabase s;

    public MyDatabase(Context c){

        m = new MyHelper(c,"techpalle.db",null,1);

    }

    public void  open(){

        s = m.getWritableDatabase();
    }

    public void insertStudent(String Name,String Mobile,String Email,String Subject,String Description,String Date){

        ContentValues cv = new ContentValues();
        cv.put("sname",Name);
        cv.put("smob",Mobile);
        cv.put("semail",Email);
        cv.put("ssub",Subject);
        cv.put("sdes",Description);
        cv.put("sdate",Date);
        s.insert("student",null,cv);


    }

    public Cursor readStudent(){
        Cursor c = s.query("student", null, null, null, null, null, null);
        return  c;
    }

    // For Searching First take all names here
    public String[] getAllNumbers(){

        String[] str = null;
        Cursor c = s.query("student",new String[]{"smob"},null,null,null,null,null);

        if(c.getCount()>0){
            str = new String[c.getCount()];
            int i = 0;

            while(c.moveToNext()){
                str[i] = c.getString(c.getColumnIndex("smob"));
                i++;
            }
            return str;
        }else{
            return  new String[]{};
        }
    }

    // Take All numbers here

    public String[] getAllNames(){

        String[] str = null;
        Cursor c = s.query("student",new String[]{"sname"},null,null,null,null,null);

        if(c.getCount()>0){
            str = new String[c.getCount()];
            int i = 0;

            while(c.moveToNext()){
                str[i] = c.getString(c.getColumnIndex("sname"));
                i++;
            }
            return str;
        }else{
            return new String[]{};
        }

    }

    public Cursor searchNum(String argument){

        Cursor c = null;
        s = m.getWritableDatabase();
        c = s.query("student",null,"smob=?",new String[]{argument},null,null,null);
        return c;

    }

    public Cursor searchName(String argument){

        Cursor c = null;
        s = m.getWritableDatabase();
        c = s.query("student",null,"sname=?",new String[]{argument},null,null,null);
        return c;

    }




    public  class MyHelper extends SQLiteOpenHelper{

        public MyHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL("create table student(_id integer primary key,sname text,smob text,semail text,ssub text,sdes text,sdate text);");

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
