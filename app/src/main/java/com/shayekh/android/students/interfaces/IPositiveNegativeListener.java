package com.shayekh.android.students.interfaces;

@FunctionalInterface
public interface IPositiveNegativeListener {

    void onPositive();

    default void onNegative() {

    }
}
