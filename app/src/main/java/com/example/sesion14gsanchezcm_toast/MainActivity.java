package com.example.sesion14gsanchezcm_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPrimero,btnSegundo,btnTercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimero=findViewById(R.id.btnPrimero);
        btnSegundo=findViewById(R.id.btnSegundo);
        btnTercero=findViewById(R.id.btnTercero);
    }

    public void primerToast (View view){
        Context context = getApplicationContext();
        CharSequence mensaje = "Mensaje TOAST \n GSanchez \n CM";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, mensaje, duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        Toast.makeText(this, "ventana emergente 2", Toast.LENGTH_LONG).show();
    }

    public void segundoToast (View view){
        Context context = getApplicationContext();
        CharSequence mensaje = "Mensaje TOAST 2 \n GSanchez \n CM";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, mensaje, duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        Toast.makeText(this, "ventana emergente 2", Toast.LENGTH_LONG).show();
    }

    public void tercerToast (View view){
        Context context = getApplicationContext();
        CharSequence mensaje = "Mensaje TOAST 3 \n GSanchez \n CM";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, mensaje, duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        Toast.makeText(this, "ventana emergente 2", Toast.LENGTH_LONG).show();
    }

    //Toast personalizado con XML
    public void toastPersonalizadoXML1 (View view){

        //Inflater--> Ejecución, visualización, desplegado de una vista
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2, null);

        Toast toastXML = new Toast(getApplicationContext());
        toastXML.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toastXML.setDuration(Toast.LENGTH_LONG);

        //integración de los elementos
        toastXML.setView(layout);
        toastXML.show();



    } // termina método


}