package com.example.lucas.firebuseye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    InputStream in;
    BufferedReader reader;
    String line;
    List<Route> listaRota;
    List<Trips> listaTrip;
    List<Shapes> listaShape;
    List<String> listaStopT;
    List<Stops> listaStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
/*
//ROTAS
        try {
            in = this.getAssets().open("routes.txt");
            Log.d("YUP", "Abriu");
        } catch (IOException e) {
            Log.d("ERROS", "nao");
            e.printStackTrace();
        }
        reader = new BufferedReader(new InputStreamReader(in));

        try {
            line = reader.readLine();
            while (line != null) {
                // lê da segunda até a última line
                Log.d("LINHA", line);
                listaRota = Route.criarRota(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
//FIM ROTAS

//TRIPS
        try {
            in = this.getAssets().open("trips.txt");
            Log.d("YUP", "Abriu");
        } catch (IOException e) {
            Log.d("ERROS", "nao");
            e.printStackTrace();
        }
        reader = new BufferedReader(new InputStreamReader(in));
        try {
            line = reader.readLine();
            while (line != null) {
                // lê da segunda até a última line
                Log.d("LINHA", line);
                listaTrip = Trips.criarTrip(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//FIM TRIPS
*/

//SHAPES
        try {
            in = this.getAssets().open("shapes.txt");
            Log.d("YUP", "Abriu");
        } catch (IOException e) {
            Log.d("ERROS", "nao");
            e.printStackTrace();
        }
        reader = new BufferedReader(new InputStreamReader(in));
        try {
            line = reader.readLine();
            while (line != null) {
                // lê da segunda até a última line
                Log.d("LINHA", line);
                Shapes.criarShape(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//FIM SHAPES
/*
 //STOP
        try {
            in = this.getAssets().open("stops.txt");
            Log.d("YUP", "Abriu");
        } catch (IOException e) {
            Log.d("ERROS", "nao");
            e.printStackTrace();
        }
        reader = new BufferedReader(new InputStreamReader(in));
        try {
            line = reader.readLine();
            while (line != null) {
                // lê da segunda até a última line
                Log.d("LINHA", line);
                listaStop = Stops.criarPonto(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//FIM STOP
*/
/*
//STOPTIMES
        try {
            in = this.getAssets().open("stop_times.txt");
            Log.d("YUP", "Abriu");
        } catch (IOException e) {
            Log.d("ERROS", "nao");
            e.printStackTrace();
        }
        reader = new BufferedReader(new InputStreamReader(in));
        try {
            line = reader.readLine();
            while (line != null) {
                // lê da segunda até a última line
                Log.d("LINHA", line);
                listaStopT = StopTimes.criarStopTime(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//FIM STOPTIMES
*/
//ENVIA PARA O BD
        DatabaseReference myRef;
  //      DatabaseReference myRef = database.getReference("routes");
    //    myRef.setValue(listaRota);
//        myRef = database.getReference("trips");
  //      myRef.setValue(listaTrip);
          myRef = database.getReference("shapes");
          myRef.setValue(listaShape);
  //        myRef = database.getReference("stops");
//          myRef.setValue(listaStop);
    }
}


        /*
                        // Read from the database
                        myRef.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                String value = dataSnapshot.getValue(String.class);
                                Log.d("ARGH","Value is: " + value);
                            }

                            @Override
                            public void onCancelled(DatabaseError error) {
                                // Failed to read value
                                Log.w("URGH", "Failed to read value.", error.toException());
                            }
                        });
                    }
                }
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        } */