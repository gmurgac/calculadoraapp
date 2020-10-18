package cl.inacap.calculadoraApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText pantalla;
    private Button botones;
    private int sumaParcial;
    private String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.pantalla = findViewById(R.id.n1_txt);
        this.operacion = "";


    }
//TODO: esquema de funcionalidad , logica de numero anterior y numero posterior, se ejecuta siempre la operacion anterior, osea ingresar primer numero, el ingresar operacion guarda primer numero y se establece la operacion a realizar(Bandera), luego al ingresar el siguiente numero y realizar cualquier operacion realiza la ultima operacion registrada.

    public void igual(View v) {



    }

    public void sumar(View v) {

        if (this.operacion == "" || this.operacion == "resultado") {
            this.sumaParcial = Integer.parseInt(this.pantalla.getText().toString());
            this.operacion = "sumando";
            this.pantalla.setText("");

        }else if(this.operacion != ""){

            int resultado = sumaParcial + Integer.parseInt(this.pantalla.getText().toString());
            this.pantalla.setText(""+resultado);
            sumaParcial = resultado;
            this.operacion = "resultado";

        }
    }


    public void numero1(View v) {

        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 1);

        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 1);
        }
    }
    public void numero2(View v) {
        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 2);
        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista+2);
        }
    }
    public void numero3(View v) {
        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 3);
        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista+3);
        }
    }
    public void numero4(View v) {
        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 4);
        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista+4);
        }
    }
    public void numero5(View v) {
        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 5);
        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista+5);
        }
    }
    public void numero6(View v) {
        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 6);
        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista+6);
        }
    }
    public void numero7(View v) {
        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 7);
        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista+7);
        }
    }
    public void numero8(View v) {
        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 8);
        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista+8);
        }
    }
    public void numero9(View v) {
        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 9);
        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista+9);
        }

    }
    public void numero0(View v) {
        if(this.operacion == "resultado") {
            this.pantalla.setText("");
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista + 0);
        }else{
            String vista = this.pantalla.getText().toString();
            this.pantalla.setText(vista+0);
        }
    }
}