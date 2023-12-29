package com.classwork.ur33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> movesNameList = new ArrayList<>();
    private RecyclerView rvMoves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        findAdapter();
        loadData();
    }

    private void findId() {
        rvMoves = findViewById(R.id.rv_moves);
    }

    private void findAdapter(){
        MovesAdapter adapter = new MovesAdapter(movesNameList);
        rvMoves.setAdapter(adapter);
    }

    private void loadData(){
        movesNameList.add("hfhftj");
        movesNameList.add("jtjrttrj");
        movesNameList.add("jrrjj");
        movesNameList.add("ikuki");
        movesNameList.add(",jilul");
        movesNameList.add("liulyk");
        movesNameList.add("kyuy");
        movesNameList.add("kiuky");
        movesNameList.add("kyktt");
        movesNameList.add("htyfjyh");
    }
}