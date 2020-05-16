package com.gsc.interfaces.impl;

import com.gsc.interfaces.IFaceCapture;

import java.sql.SQLOutput;

public class FaceCaptureImpl implements IFaceCapture {
    @Override
    public void getFaceData(String msg) {
        System.out.println(msg);
    }
}
