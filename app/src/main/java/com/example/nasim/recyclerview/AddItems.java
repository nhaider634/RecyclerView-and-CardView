package com.example.nasim.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AddItems extends AppCompatActivity {
    public static final int RESULT_LOAD_IMAGE = 1;
    ;
    EditText et, et1, title, email, company;
    Boolean img = false;
    Button btn;
    ImageView imageView, countryImage;
    int mGetImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);


        et = (EditText) findViewById(R.id.country);
        et1 = (EditText) findViewById(R.id.capital);
        countryImage = (ImageView) findViewById(R.id.imageView2);

        btn = (Button) findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(img ==true)
                {
                    car c = new car(mGetImage, et.getText().toString());
                    Intent intent = new Intent(AddItems.this, MainActivity.class);

                    intent.putExtra("datas", c);
                    setResult(3, intent);

                    finish();
                }
                else if(img==false)
                {
                    Stringss str = new Stringss(et.getText().toString(), et1.getText().toString());
                    Intent intent = new Intent(AddItems.this, MainActivity.class);

                    intent.putExtra("data", str);
                    setResult(2, intent);

                    finish();
                }

            }
        });

        countryImage.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(AddItems.this, SelectImage.class);
                startActivityForResult(intent2, 1);

              /*  Intent intent = new Intent();
                intent.setType("image*//*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Choose Picture"), 1);*/
            }

        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        mGetImage =data.getExtras().getInt("img",1);
        this.mGetImage=mGetImage;
        countryImage.setImageResource(mGetImage);
       img = true;


    }



}

