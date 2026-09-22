package com.lusia.jacek;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("pytanie")
    public String trescpytania;
    @SerializedName("a")
    public String OdpA;
    @SerializedName("b")
    public String OdpB;
    @SerializedName("c")
    public String OdpC;
    @SerializedName("odp")
    public int poprawnaodp;
}
