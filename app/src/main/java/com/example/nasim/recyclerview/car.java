package com.example.nasim.recyclerview;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by NASIM on 9/25/2017.
 */

public class car implements Serializable {
    public car(int carImage, String carManufactureer) {
        this.carImage = carImage;
        this.carManufactureer = carManufactureer;
    }

    private int carImage;
    private String carManufactureer;

    public String getCarManufactureer() {
        return carManufactureer;
    }

    public void setCarManufactureer(String carManufactureer) {
        this.carManufactureer = carManufactureer;
    }




    public car() {

    }

    public int getCarImage() {
        return carImage;
    }

    public void setCarImage(int carImage) {
        this.carImage = carImage;
    }




}
