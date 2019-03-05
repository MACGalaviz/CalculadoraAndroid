package com.example.calculadorabracamontes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPunto, btnBorrar, btnSumar, btnRestar, btnMultiplicar, btnDividir, btnIgual;
    ImageView btnBorrarUno;
    EditText etPantalla;

    boolean primerUso, reset, resetDespuesDeIgual, errorDividir0;

    //String cadenaTemporal = "";
    //boolean primeraVez = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPantalla = findViewById(R.id.etPantalla);

        btn0 = findViewById(R.id.btnCero);
        btn1 = findViewById(R.id.btnUno);
        btn2 = findViewById(R.id.btnDos);
        btn3 = findViewById(R.id.btnTres);
        btn4 = findViewById(R.id.btnCuatro);
        btn5 = findViewById(R.id.btnCinco);
        btn6 = findViewById(R.id.btnSeis);
        btn7 = findViewById(R.id.btnSiete);
        btn8 = findViewById(R.id.btnOcho);
        btn9 = findViewById(R.id.btnNueve);
        btnPunto = findViewById(R.id.btnPunto);
        btnBorrar = findViewById(R.id.btnborrar);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnIgual = findViewById(R.id.btnIgual);
        btnBorrarUno = findViewById(R.id.btnBorrarUno);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPunto.setOnClickListener(this);
        btnBorrar.setOnClickListener(this);
        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnBorrarUno.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnCero:
                setNum("0");
                // Toast.makeText(this, R.string.strcero, Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnUno:
                setNum("1");
                //etPantalla.setText(etPantalla.getText().toString() + "1");
                // etPantalla.setText(R.string.struno);
                // Toast.makeText(this, R.string.struno, Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnDos:
                setNum("2");
                //etPantalla.setText(etPantalla.getText().toString() + "2");
                //etPantalla.setText(R.string.strdos);
                //Toast.makeText(this, R.string.strdos, Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnTres:
                setNum("3");
                //etPantalla.setText(etPantalla.getText().toString() + "3");
                //etPantalla.setText(R.string.strtres);
                //Toast.makeText(this, R.string.strtres, Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnCuatro:
                setNum("4");
                //etPantalla.setText(etPantalla.getText().toString() + "4");
                //etPantalla.setText(R.string.strcuatro);
                //Toast.makeText(this, R.string.strcuatro, Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnCinco:
                setNum("5");
                //etPantalla.setText(etPantalla.getText().toString() + "5");
                //etPantalla.setText(R.string.strcinco);
                //Toast.makeText(this, R.string.strcinco, Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnSeis:
                setNum("6");
                //etPantalla.setText(etPantalla.getText().toString() + "6");
                //etPantalla.setText(R.string.strseis);
                //Toast.makeText(this, R.string.strseis, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSiete:
                setNum("7");
                //etPantalla.setText(etPantalla.getText().toString() + "7");
                //etPantalla.setText(R.string.strsiete);
                //Toast.makeText(this, R.string.strsiete, Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnOcho:
                setNum("8");
                //etPantalla.setText(etPantalla.getText().toString() + "8");
                //etPantalla.setText(R.string.strocho);
                //Toast.makeText(this, R.string.strocho, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnNueve:
                setNum("9");
                //etPantalla.setText(R.string.strnueve);
                //Toast.makeText(this, R.string.strnueve, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnborrar:
                etPantalla.setText("0");
                primerUso = false;
                reset = false;
                //primeraVez = true;
                break;

            case R.id.btnSumar:
                setChar("+");
                //primeraVez = true;
                break;
            case R.id.btnRestar:
                setChar("-");
                //primeraVez = true;
                break;
            case R.id.btnMultiplicar:
                setChar("*");
                //primeraVez = true;
                break;
            case R.id.btnDividir:
                setChar("/");
                //primeraVez = true;
                break;
            case R.id.btnPunto:
                setPunto(".");
                //primeraVez = true;
                break;
            case R.id.btnIgual:
                try {
                    calcular();
                    //primeraVez = true;
                }catch (Exception e){
                    //Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
                }finally {
                    Toast.makeText(this, "El finally siempre se ejecuta", Toast.LENGTH_SHORT).show();
                }
                    break;
            case R.id.btnBorrarUno:
                if(etPantalla.getText().toString().length()>1)
                {
                    etPantalla.setText(etPantalla.getText().toString().substring(0,etPantalla.getText().toString().length() - 1));
                }
                else
                    {
                        etPantalla.setText("0");
                    }

                break;
        }
    }

    public void setNum(String text){
        primerUso = true;
        if (resetDespuesDeIgual){
            etPantalla.setText(text);
            resetDespuesDeIgual = false;
        }
        else {
            if (etPantalla.getText().toString().equals("0") && !text.equals("0")){
                etPantalla.setText(text);
            }
            else{
                if (!etPantalla.getText().toString().equals("0")) {
                    etPantalla.setText(etPantalla.getText().toString() + text);

                }
            }
        }


    }

    public void setChar(String text){
        String ultimo = etPantalla.getText().toString().substring(etPantalla.getText().toString().length() - 1);
            if (!etPantalla.getText().toString().equals("0") && !ultimo.equals("+") && !ultimo.equals("-") && !ultimo.equals("/")
                                                                                    && !ultimo.equals("*")&& !ultimo.equals(".")) {
                etPantalla.setText(etPantalla.getText().toString() + text);
                resetDespuesDeIgual = false;
            }
    }

    public boolean puedePonerPunto(){
        String textoPantall = etPantalla.getText().toString();
        boolean bandera =true;
        for (char c: textoPantall.toCharArray()
             ) {
            if (bandera){
                if ( c == '.')
                {
                    bandera = false;
                }
            }
            else
            {
                if( c == '+' || c == '-' || c == '/' || c == '*' )
                {
                    bandera = true;
                }
            }
        }
        return bandera;
    }

    public void setPunto(String text){
        String ultimo = etPantalla.getText().toString().substring(etPantalla.getText().toString().length() - 1);
        if (!etPantalla.getText().toString().equals(".") && !ultimo.equals(".")) {
            if (puedePonerPunto())
            {
                if(ultimo.equals("+") || ultimo.equals("-") || ultimo.equals("/") || ultimo.equals("*"))
                {
                    etPantalla.setText(etPantalla.getText().toString() + "0" + text);
                }
                else {
                    etPantalla.setText(etPantalla.getText().toString() + text);
                }
            }
        }
    }

    public void calcular() {
        if (reset || etPantalla.getText().toString().equals("Error") || etPantalla.getText().toString().equals("Infinity")) {
            etPantalla.setText("0");
            reset = false;
        } else {
            String ultimo = etPantalla.getText().toString().substring(etPantalla.getText().toString().length() - 1);
            if (!ultimo.equals(".") && !ultimo.equals("+") && !ultimo.equals("-") && !ultimo.equals("*") && !ultimo.equals("/") && primerUso) {

                String textoPantalla = etPantalla.getText().toString();

                boolean firstIsNegative = textoPantalla.charAt(0) == '-';
                if (firstIsNegative) {
                    textoPantalla = textoPantalla.substring(1);
                }

                String[] numeros = textoPantalla.split("\\+|\\-|\\*|\\/");

                char[] operadores = new char[numeros.length - 1];

                int currentOps = 0;

                for (char c : textoPantalla.toCharArray()) {
                    if (c == '+' || c == '-' || c == '*' || c == '/') {
                        operadores[currentOps] = c;
                        currentOps++;
                    }
                }


                 float result = Float.parseFloat(numeros[0]);
                if (firstIsNegative) {
                    result *= -1;
                }

                for (int i = 0; i < operadores.length; i++) {
                    float next = Float.parseFloat(numeros[i + 1]);

                    switch (operadores[i]) {
                        case '+':
                            resetIgual(currentOps,operadores.length);
                            result += next;
                            break;
                        case '-':
                            resetIgual(currentOps,operadores.length);
                            result -= next;
                            break;
                        case '*':
                            resetIgual(currentOps,operadores.length);
                            result *= next;
                            break;
                        case '/':
                            resetIgual(currentOps,operadores.length);
                            if (dividirCero())
                            {
                                errorDividir0 = true;
                            }
                            else{result /= next;}

                            break;
                    }
                }
                if (errorDividir0)
                {
                    etPantalla.setText("Error");
                    errorDividir0 = false;
                }else{
                    etPantalla.setText("" + result);
                }

            } else {
                if (primerUso) {
                    etPantalla.setText("Error");
                    reset = true;
                }
            }
        }
    }

    public void resetIgual(int count, int countleng)
    {
        if(count == countleng){
            resetDespuesDeIgual = true;
        }
    }
    public boolean dividirCero()
    {
        String ultimo = etPantalla.getText().toString().substring(etPantalla.getText().toString().length() - 1);
        if (ultimo.equals("0"))
        {
            return true;
        }
        return false;
    }

}
