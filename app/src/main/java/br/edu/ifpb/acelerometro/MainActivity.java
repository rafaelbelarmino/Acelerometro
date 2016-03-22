package br.edu.ifpb.acelerometro;

import android.hardware.SensorEventListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity implements SensorEventListener{

    private TextView x;
    private TextView y;
    private TextView z;
    private sensor sensormanager;
    private sensormeter SensorAcelerometer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = (TextView) findViewById (R.id.x);
        y = (TextView) findViewById (R.id.y);
        z =(TextView) findViewById (R.id.z);

        sensormanager = (sensor) getSystemService(Context.SENSOR_SERVICE);
        SensorAcelerometer = (sensormeter) .getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }
    public void onSensorChanged(SensorEvent event) {
        Float x = event.values[0];
        Float y = event.values[1];
        Float z = event.values[2];

        x.setText( " posiçao X:" + x.intValue() + "Float" + x);

    }
}
