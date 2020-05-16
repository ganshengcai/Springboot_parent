package com.gsc.service;

import com.gsc.interfaces.IFaceCapture;
import com.gsc.interfaces.impl.FaceCaptureImpl;

public class Face {
    public static void main(String[] args) {
        FaceCaptureService.init();
        new FaceCaptureImpl().getFaceData("safasd");
    }
}
