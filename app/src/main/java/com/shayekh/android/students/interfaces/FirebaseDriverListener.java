package com.shayekh.android.students.interfaces;


//import spartons.com.javapassengerapp.model.Driver;
import com.shayekh.android.students.model.Driver;

public interface FirebaseDriverListener {

    void onDriverAdded(Driver driver);

    void onDriverRemoved(Driver driver);

    void onDriverUpdated(Driver driver);

}
