package com.example.lucas.firebuseye;

import java.util.ArrayList;
import java.util.List;

public class Stops {
    String stopId,stopName,stopDesc,stopLat,stopLong;
    static List<Stops>  listaStop = new ArrayList<>();

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getStopDesc() {
        return stopDesc;
    }

    public void setStopDesc(String stopDesc) {
        this.stopDesc = stopDesc;
    }

    public String getStopLat() {
        return stopLat;
    }

    public void setStopLat(String stopLat) {
        this.stopLat = stopLat;
    }

    public String getStopLong() {
        return stopLong;
    }

    public void setStopLong(String stopLong) {
        this.stopLong = stopLong;
    }

    public Stops() {
        this.stopId = "";
        this.stopName = "";
        this.stopDesc = "";
        this.stopLat = "";
        this.stopLong = "";
    }

    public static List<Stops> criarPonto(String line){
        Stops stop = new Stops();

        String[] infoRota = line.split((","));
        stop.stopId = infoRota[0];
        stop.stopName = infoRota[1];
        stop.stopDesc = infoRota[2];
        stop.stopLat = infoRota[3];
        stop.stopLong = infoRota[4];

        listaStop.add(stop);
        return listaStop;
    }

}
