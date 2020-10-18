package com.example.transferwiseapp.Model;

import android.widget.TextView;

public class HomepageModel {

    private String txt_recipientname, txt_amounttransfer, txt_status, txt_convertsamount;

    public String getTxt_recipientname() {
        return txt_recipientname;
    }

    public void setTxt_recipientname(String txt_recipientname) {
        this.txt_recipientname = txt_recipientname;
    }

    public String getTxt_amounttransfer() {
        return txt_amounttransfer;
    }

    public void setTxt_amounttransfer(String txt_amounttransfer) {
        this.txt_amounttransfer = txt_amounttransfer;
    }

    public String getTxt_status() {
        return txt_status;
    }

    public void setTxt_status(String txt_status) {
        this.txt_status = txt_status;
    }

    public String getTxt_convertsamount() {
        return txt_convertsamount;
    }

    public void setTxt_convertsamount(String txt_convertsamount) {
        this.txt_convertsamount = txt_convertsamount;
    }
}
