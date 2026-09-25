package com.lusia.jacek;

import com.google.gson.annotations.SerializedName;
/*
https://my-json-server.typicode.com/karameler/jaceklistapytan/pytania
 */
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

    public Pytanie(String trescpytania, String odpA, String odpB, String odpC, int poprawnaodp) {
        this.trescpytania = trescpytania;
        OdpA = odpA;
        OdpB = odpB;
        OdpC = odpC;
        this.poprawnaodp = poprawnaodp;
    }
}
