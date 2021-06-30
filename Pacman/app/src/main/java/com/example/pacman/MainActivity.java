package com.example.pacman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
SensorManager sensorManager;
Sensor acelerometro;
long lastUpdate=0;
    TextView txtCords;
ImageButton pocman;
int screenWidth=0;
int screenHeight=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCords=findViewById(R.id.txtCord);
        pocman=findViewById(R.id.pacman);
        Display display=getWindowManager().getDefaultDisplay();
        Point point=new Point();
        display.getSize(point);
        screenWidth=point.x;
        screenHeight=point.y;
        sensorManager=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        acelerometro=sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, acelerometro, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor mySensor= sensorEvent.sensor;
        if (mySensor.getType()==Sensor.TYPE_ACCELEROMETER){
          long currTime= System.currentTimeMillis();//tiempo que lleva la app prendida
            if ((currTime - lastUpdate)>100){
                lastUpdate=currTime;
                float x=sensorEvent.values[0];
                float y=sensorEvent.values[1];
                float z=sensorEvent.values[2];
                txtCords.setText("X: " +x +" Y: " +y +" Z: " +z);
                int centerX=screenWidth/2;
                int centerY=screenHeight/2;
                int relX=screenWidth/20;
                int relY=screenHeight/20;
                if (x>0){
                    int _x=(int)(centerX -(relX*(x*-1))-75);
                    pocman.setX(_x);
                }else {
                    pocman.setX((relX*x)-75+centerX);
                }if (y>0){
                    pocman.setY( (centerY+(relY*y))-75);
                }

            }//llave currentotime

        }//if sensor
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, acelerometro, SensorManager.SENSOR_DELAY_NORMAL);    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}