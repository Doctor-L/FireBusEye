package com.example.lucas.firebuseye;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    String shapeId,shapePtLat,shapeDistTraveled;
    List<String> shapePtLon = new ArrayList<>();
    List <String>shapePtSequence = new ArrayList<>();
    static List<Shapes> listaShape = new ArrayList<>();
    static Shapes shape;
    static String ver = " ";

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public String getShapePtLat() {
        return shapePtLat;
    }

    public void setShapePtLat(String shapePtLat) {
        this.shapePtLat = shapePtLat;
    }

    public List<String> getShapePtLon() {
        return shapePtLon;
    }

    public void setShapePtLon(List<String> shapePtLon) {
        this.shapePtLon = shapePtLon;
    }

    public List<String> getShapePtSequence() {
        return shapePtSequence;
    }

    public void setShapePtSequence(List<String> shapePtSequence) {
        this.shapePtSequence = shapePtSequence;
    }

    public String getShapeDistTraveled() {
        return shapeDistTraveled;
    }

    public void setShapeDistTraveled(String shapeDistTraveled) {
        this.shapeDistTraveled = shapeDistTraveled;
    }

    public static List<Shapes> getListaShape() {
        return listaShape;
    }

    public static void setListaShape(List<Shapes> listaShape) {
        Shapes.listaShape = listaShape;
    }

    public Shapes() {
        this.shapeId = " ";
        this.shapePtLat = " ";
        this.shapeDistTraveled = " ";
    }

    public static List<Shapes> criarShape(String line){

        String[] infoRota = line.split((","));
        if(ver.equals(infoRota[0])){
            shape = listaShape.get(listaShape.size() - 1);
            shape.shapePtLon.add(infoRota[2]);
            shape.shapePtSequence.add(infoRota[3]);
            listaShape.set(listaShape.size() - 1, shape);
        }else {
            ver = infoRota[0];
            shape = new Shapes();
            shape.shapeId = infoRota[0];
            shape.shapePtLat = infoRota[1];
            shape.shapePtLon.add(infoRota[2]);
            shape.shapePtSequence.add(infoRota[3]);
            shape.shapeDistTraveled= infoRota[4];
            listaShape.add(shape);
        }
            return listaShape;
    }
}
