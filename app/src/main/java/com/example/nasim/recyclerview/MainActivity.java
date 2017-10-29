package com.example.nasim.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.LinearLayout.HORIZONTAL;
import static android.widget.LinearLayout.VERTICAL;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ComplexAdapter complexAdapter1;
    private Stringss stringss;
    private car c;
     RadioButton gridH,linH, stagH,gridV,linV, stagV ;
    ArrayList<Object>st;
    //private ArrayList<Object>car1;

    StaggeredGridLayoutManager staggeredGridLayoutManager;
    GridLayoutManager gridLayoutManager;
    LinearLayoutManager ll;


    Spinner sp;
    int no;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rec1);

        gridV=(RadioButton)findViewById(R.id.gridv);
        linV=(RadioButton) findViewById(R.id.linv);
        stagV=(RadioButton) findViewById(R.id.stagV);
        gridH=(RadioButton)findViewById(R.id.gridh);
        linH=(RadioButton) findViewById(R.id.linh);
        stagH=(RadioButton) findViewById(R.id.stagH);


        sp = (Spinner) findViewById(R.id.spinner2);
        loadSpinner();






//        car cars = new car();
//       car1= cars.getAllCars();




        st = new ArrayList<>();

        //   ComplexAdapter complexAdapter =new ComplexAdapter(this,car1);
      complexAdapter1 =new ComplexAdapter(this, st);




    gridLayoutManager =new GridLayoutManager(this,2);
    gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);

       // staggeredGridLayoutManager =new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(gridLayoutManager);





        //  recyclerView.setAdapter(complexAdapter);
        recyclerView.setAdapter(complexAdapter1);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddItems.class);
                startActivityForResult(intent, 1);
            }
        });



    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (resultCode==2) {

            stringss = (Stringss) data.getSerializableExtra("data");

            st.add(stringss);
           complexAdapter1.notifyDataSetChanged();
        }
        else if(resultCode==3)
        {
            c = (car) data.getSerializableExtra("datas");

            st.add(c);
            complexAdapter1.notifyDataSetChanged();
        }



    }
    public void loadSpinner( ) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        ArrayAdapter <Integer >arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        sp.setAdapter(arrayAdapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                  no = (int) parent.getSelectedItem();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }



    public void radion(View view) {



        if(gridH.isChecked()){

            gridLayoutManager =new GridLayoutManager(this,no);
            gridLayoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        if(stagH.isChecked()){
            staggeredGridLayoutManager =new StaggeredGridLayoutManager(no, StaggeredGridLayoutManager.HORIZONTAL);
            recyclerView.setLayoutManager(staggeredGridLayoutManager);

        }
        if(linH.isChecked()){


            ll=new LinearLayoutManager(this);
            ll.setOrientation(HORIZONTAL);
            recyclerView.setLayoutManager(ll);


        }
        if(gridV.isChecked()){
            gridLayoutManager =new GridLayoutManager(this,no);
            gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        if(stagV.isChecked()){
            staggeredGridLayoutManager =new StaggeredGridLayoutManager(no, StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(staggeredGridLayoutManager);

        }
        if(linV.isChecked()){

            ll=new LinearLayoutManager(this);
            ll.setOrientation(VERTICAL);
            recyclerView.setLayoutManager(ll);
        }
    }



}
