package com.example.locationtutorial.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.lang.reflect.Array;

public class NameViewModel extends ViewModel {

    // Create a LiveData with a String
    private MutableLiveData<String> currentName;
    private MutableLiveData<Double> latValue;
    private MutableLiveData<Double> lonValue;


    private MutableLiveData<Double[]> latLonValue;
    public MutableLiveData<Double[]> getLatLonValue() {
        if (latLonValue == null) {
            latLonValue = new MutableLiveData<Double[]>();
        }
        return latLonValue;
    }

    public MutableLiveData<Double> getLatVal() {
        if (latValue == null) {
            latValue = new MutableLiveData<Double>();
        }
        return latValue;
    }

    public MutableLiveData<Double> getLonVal() {
        if (lonValue == null) {
            lonValue = new MutableLiveData<Double>();
        }
        return lonValue;
    }

    public MutableLiveData<String> getCurrentName() {
        if (currentName == null) {
            currentName = new MutableLiveData<String>();
        }
        return currentName;
    }

// Rest of the ViewModel...
}

