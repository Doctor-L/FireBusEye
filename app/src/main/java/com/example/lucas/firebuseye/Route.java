package com.example.lucas.firebuseye;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Route {
    String routeId, agencyId, routeShortName, routeLongName,routeType,routeColor,routeTextColor;
    static List<Route> listaRota = new ArrayList<>();

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getRouteShortName() {
        return routeShortName;
    }

    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    public String getRouteLongName() {
        return routeLongName;
    }

    public void setRouteLongName(String routeLongName) {
        this.routeLongName = routeLongName;
    }

    public String getRouteType() {
        return routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public String getRouteColor() {
        return routeColor;
    }

    public void setRouteColor(String routeColor) {
        this.routeColor = routeColor;
    }

    public String getRoutTextColor() {
        return routeTextColor;
    }

    public void setRoutTextColor(String routTextColor) {
        this.routeTextColor = routTextColor;
    }

    public Route() {
        this.agencyId="";
        this.routeColor="";
        this.routeId="";
        this.routeLongName="";
        this.routeShortName="";
        this.routeType="";
        this.routeTextColor="";
    }

    public static List<Route> criarRota(String line){
        Route rota = new Route();

            String[] infoRota = line.split((","));
            rota.routeId = infoRota[0];
            rota.agencyId = infoRota[1];
            rota.routeShortName = infoRota[2];
            rota.routeLongName = infoRota[3];
            rota.routeType = infoRota[4];
            rota.routeColor = infoRota[5];
            rota.routeTextColor = infoRota[6];
        listaRota.add(rota);
        return listaRota;
    }
}
