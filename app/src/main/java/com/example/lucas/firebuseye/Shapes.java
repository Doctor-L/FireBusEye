package com.example.lucas.firebuseye;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    static List<String> shapePtLon = new ArrayList<>();
    static List <String>shapePtSequence = new ArrayList<>();
    static List<String> shapePtLat=new ArrayList<>();
    static String shapeId;
    static FirebaseDatabase database = FirebaseDatabase.getInstance();
    static DatabaseReference myRef = database.getReference("shapes");
    static int i = 0;


    public static void criarShape(String line){

        String[] infoRota = line.split((","));
        if(shapeId.equals(infoRota[0])){
            ++i;
            myRef.child(infoRota[0]).child("shapePtLat").child(String.valueOf(i)).setValue(infoRota[1]);
            myRef.child(infoRota[0]).child("ShapePtLon").child(String.valueOf(i)).setValue(infoRota[2]);
            shapePtLat.add(infoRota[1]);
            shapePtLon.add(infoRota[2]);
            shapePtSequence.add(infoRota[3]);
        }else {
            i=0;
            myRef.child(infoRota[0]).setValue(infoRota[0]);
            myRef.child(infoRota[0]).child("shapeId").setValue(infoRota[0]);
            myRef.child(infoRota[0]).child("shapePtLat").child(String.valueOf(i)).setValue(infoRota[1]);
            myRef.child(infoRota[0]).child("ShapePtLon").child(String.valueOf(i)).setValue(infoRota[2]);
            myRef.child(infoRota[0]).child("ShapePtSequence").setValue(infoRota[3]);
            //myRef.child("shapes").child(infoRota[0]).child("ShapeDistTraveked").setValue(infoRota[4]);
        }
    }
}
