package com.example.lucas.firebuseye;

import java.util.ArrayList;
import java.util.List;

public class StopTimes {
    static String tripId,arrivalTime,derpatureTime,stopId,stopSequence;
    static List<String> listaStoptimes = new ArrayList<>();

    //GETTERS AND SETTERS
    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDerpatureTime() {
        return derpatureTime;
    }

    public void setDerpatureTime(String derpatureTime) {
        this.derpatureTime = derpatureTime;
    }

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public String getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(String stopSequence) {
        this.stopSequence = stopSequence;
    }

//FIM GETTERS AND SETTERS

//Construtores

    public StopTimes() {
        this.tripId = "";
        this.arrivalTime = "";
        this.derpatureTime = "";
        this.stopId = "";
        this.stopSequence = "";
    }
//FIM Construtores

//Metodos
public static List<String> criarStopTime(String line){
    StopTimes stoptime = new StopTimes();

    String[] infoRota = line.split((","));
    tripId = infoRota[0];
    arrivalTime = infoRota[1];
    derpatureTime = infoRota[2];
    stopId = infoRota[3];
    stopSequence= infoRota[4];

    return listaStoptimes;
}
}
