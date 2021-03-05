package com.example.vize2;

public class Ucgen {
    private int kenar1;
    private int kenar2;
    private int kenar3;

    public  Ucgen (int kenar11, int kenar22, int kenar33) {
        kenar1=kenar11;
        kenar2=kenar22;
        kenar3=kenar33;


    }
    public int getkenar1() {
        return kenar1;
    }
    public int getkenar2() {
        return kenar2;
    }
    public int getkenar3() {
        return kenar3;
    }
    //|b-c|<a<b+c
    public boolean isValid()  {
        if ((Math.abs(kenar2-kenar3) <kenar1) && (kenar2+kenar3>kenar1)) {
            return true;
        }else{
            return false;
        }
    }

}
