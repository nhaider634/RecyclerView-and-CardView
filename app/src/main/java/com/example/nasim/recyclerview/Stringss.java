package com.example.nasim.recyclerview;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by NASIM on 9/25/2017.
 */

public class Stringss implements Serializable {

    private String carname;

    private String carManufacturer;
    private int carImage;



    public Stringss(String marcidiz, String benjdfdffdfdfdzfzdfddfdfzdfdz) {
        carname= marcidiz;
        carManufacturer=benjdfdffdfdfdzfzdfddfdfzdfdz;

    }

    public Stringss(int carImage) {
        this.carImage = carImage;
    }


    public Stringss() {

    }


    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }



    public String getCarname() {
        return carname;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }




    public int getCarImage() {
        return carImage;
    }

    public void setCarImage(int carImage) {
        this.carImage = carImage;
    }


//    public ArrayList<Object> getAllStringss(){
//        ArrayList<Object>st = new ArrayList<>();
//
//        st.add(new Stringss("Marcidiz", "Befuddled"));
//        st.add(new Stringss("jbzsibkjzbciuz ", "Befuddled"));
//        st.add("asas");
//
//
//
//        return st;
//    }








}
