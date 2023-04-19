/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1906515_student;

/**
 *
 * @author PC
 */
public class Student {
    private String mssv, name, hocky, mh1, mh2, mh3, mh4, mh5;
    private float d1, d2, d3, d4, d5, dtb;

    public Student() {
    }

    public float dtb(){
        float d = 0;
        int n = 0;
        if(d1 <= 10 & d1 >= 0){
            n++;
            d = d + d1;
        }if(d2 <= 10 & d2 >= 0){
            n++;
            d = d + d2;
        }if(d3 <= 10 & d3 >= 0){
            n++;
            d = d + d3;
        }if(d4 <= 10 & d4 >= 0){
            n++;
            d = d + d4;
        }if(d5 <= 10 & d5 >= 0){
            n++;
            d = d + d5;
        }
        dtb = d / n;
        return dtb;
    }
    
    public String Xeploai(){
        if(dtb >= 8){
            return "Giỏi";
        }
        if(dtb >= 6){
            return "Khá";
        }
        if(dtb >= 4){
            return "TB";
        }
        return "Kém";
    }
    
    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getHocky() {
        return hocky;
    }

    public void setHocky(String hocky) {
        this.hocky = hocky;
    }

    public String getMh1() {
        return mh1;
    }

    public void setMh1(String mh1) {
        this.mh1 = mh1;
    }

    public String getMh2() {
        return mh2;
    }

    public void setMh2(String mh2) {
        this.mh2 = mh2;
    }

    public String getMh3() {
        return mh3;
    }

    public void setMh3(String mh3) {
        this.mh3 = mh3;
    }

    public String getMh4() {
        return mh4;
    }

    public void setMh4(String mh4) {
        this.mh4 = mh4;
    }

    public String getMh5() {
        return mh5;
    }

    public void setMh5(String mh5) {
        this.mh5 = mh5;
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public float getD2() {
        return d2;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    public float getD3() {
        return d3;
    }

    public void setD3(float d3) {
        this.d3 = d3;
    }

    public float getD4() {
        return d4;
    }

    public void setD4(float d4) {
        this.d4 = d4;
    }

    public float getD5() {
        return d5;
    }

    public void setD5(float d5) {
        this.d5 = d5;
    }
    
    
}
