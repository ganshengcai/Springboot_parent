package com.gsc.service;

import com.gsc.interfaces.IFaceCapture;

public class FaceCaptureService implements IFaceCapture {
    private static String msg = null;

    @Override
    public void getFaceData(String msg) {
        msg = this.msg;
    }

    public static <msg> void init() {
          msg = "abcd";

    }


}
