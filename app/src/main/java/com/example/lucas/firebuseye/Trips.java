package com.example.lucas.firebuseye;

import java.util.ArrayList;
import java.util.List;

public class Trips {
    String routeId,serviceId,tripId,tripHeadSign,directionId,shapeId;
    static List<Trips> listaTrip = new ArrayList<>();
    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getTripHeadSign() {
        return tripHeadSign;
    }

    public void setTripHeadSign(String tripHeadSign) {
        this.tripHeadSign = tripHeadSign;
    }

    public String getDirectionId() {
        return directionId;
    }

    public void setDirectionId(String directionId) {
        this.directionId = directionId;
    }

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public Trips() {
        this.routeId = "";
        this.serviceId = "";
        this.tripId = "";
        this.tripHeadSign = "";
        this.directionId = "";
        this.shapeId = "";
    }

    public static List<Trips> criarTrip(String line){
        Trips trip = new Trips();

        String[] infoRota = line.split((","));
        trip.routeId = infoRota[0];
        trip.serviceId = infoRota[1];
        trip.tripId = infoRota[2];
        trip.tripHeadSign = infoRota[3];
        trip.directionId= infoRota[4];
        trip.shapeId = infoRota[5];
        listaTrip.add(trip);
        return listaTrip;
    }

}
