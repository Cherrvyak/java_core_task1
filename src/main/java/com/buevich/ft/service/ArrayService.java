package com.buevich.ft.service;

import com.buevich.ft.entity.IntArray;
import com.buevich.ft.exception.ArrayException;

public interface ArrayService {
    int findMinValue(IntArray array) throws ArrayException;
    int findMaxValue(IntArray array) throws ArrayException;
    int findSum(IntArray array) throws ArrayException;
    double findAverage(IntArray array) throws ArrayException;
    int countPositiveElements(IntArray array) throws ArrayException;
    int countNegativeElements(IntArray array) throws ArrayException;
    void replaceElements(IntArray array, int oldValue, int newValue) throws ArrayException;
}