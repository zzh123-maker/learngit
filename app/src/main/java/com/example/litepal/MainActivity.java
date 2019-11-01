package com.example.litepal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        LitePal.getDatabase();
        BOOK book=new BOOK();
        book.setName("1");
        book.setPrice(13);
        book.save();
        List<BOOK> books=DataSupport.findAll(BOOK.class);
        for(BOOK book1:books)
            Log.d("MainActivity", String.valueOf(book1.getId()));
        DataSupport.deleteAll(BOOK.class,"id=?","2");
    }
}
