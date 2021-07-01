package com.example.pacman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
SensorManager sensorManager;
Sensor acelerometro;
long lastUpdate=0;
    TextView txtCords;
ImageButton pocman;
int screenWidth=0;
int screenHeight=0;
int ranx=0, rany=0;
ImageView arreglo[];
int cuantos=0;
RelativeLayout padre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCords=findViewById(R.id.txtCord);
        pocman=findViewById(R.id.pacman);
        padre=findViewById(R.id.padre);
        Display display=getWindowManager().getDefaultDisplay();
        Point point=new Point();
        display.getSize(point);
        screenWidth=point.x;
        screenHeight=point.y;
        sensorManager=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        acelerometro=sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, acelerometro, SensorManager.SENSOR_DELAY_NORMAL);
    pocman.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            Random r=new Random();
            pocman.setX(screenWidth/2-50);
            pocman.setY(screenHeight/2-50);
            cuantos=r.nextInt(20-6)+6;
           if (arreglo!=null) {
               Log.e("Entero", "sd");
               for (int j = 0; j < arreglo.length; j++) {
                   ImageView dot = arreglo[j];
                   ViewGroup layout = (ViewGroup) dot.getParent();
                   if (layout != null) {
                       layout.removeView(dot);
                   }
               }
           }
            generar();
            pocman.bringToFront();

            return false;
        }
    });
    }

    public void generar(){
        int x=screenWidth /cuantos;
        int y=screenHeight /cuantos;
        int cont=0;
        arreglo=new ImageView[cuantos*cuantos];
        for (int j=0;j<cuantos;j++){
            for (int i=0;i<cuantos;i++) {
                ImageView img = new ImageView(getApplicationContext());
                img.setLayoutParams(new ViewGroup.LayoutParams(x, y));
                img.setX((j * x));
                img.setY((j * y));
                img.setId(j);
                img.setImageResource(R.drawable.pizza);
                arreglo[cont] = img;
                padre.addView(arreglo[cont]);
                cont++;
            }
        }//iabe del for

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor mySensor= sensorEvent.sensor;
        if (mySensor.getType()==Sensor.TYPE_ACCELEROMETER){
          long currTime= System.currentTimeMillis();//tiempo que lleva la app prendida
            if ((currTime - lastUpdate)>100 && arreglo!=null){
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
                //detectar colision
                for (int j=0;j<arreglo.length;j++){
                    ImageView dot=arreglo[j];
                    int _x=(int)dot.getX();
                    int _y=(int)dot.getY();
                    int _w=screenWidth/cuantos;
                    int _h=screenHeight/cuantos;
                    int pX=(int) pocman.getX();
                    int pY=(int) pocman.getY();
                    int cpX=pX+(pocman.getWidth()/2);
                    int cpY=pX+(pocman.getHeight()/2);

                    if (dot.getVisibility()==View.VISIBLE){
                        if (cpX>=_x && cpX<(_x+_w) && cpY> _y &&
                        cpY < _y +_h){
                            Log.e("Entroo", "ENTRO");
                            dot.setVisibility(View.INVISIBLE);

                        }
                    }

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