package com.example.sebastian.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText pant;

    public double numero1;
    public double numero2;
    public double resultado;
    public String operador;
    int ope;
    static final int opeSuma = 1, opeResta = 2, opeDivi = 3, opeMilti = 4,
                     opeSeno = 5, opeCoseno = 6, opeTangente = 7,
                     opeCsc = 8, opeSecante = 9, opeCotangente = 10,
                     opeRaiz = 11, opeLogaritmo = 12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Text es como se llama donde se escriben los numeros
        pant =(EditText)findViewById(R.id.Text);
    }
    // METODOS PARA ESCRIBIR LOS NUMEROS
    public void Num1(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"1";
        pant.setText(Cap);
    }

    public void Num2(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"2";
        pant.setText(Cap);
    }
    public void Num3(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"3";
        pant.setText(Cap);
    }
    public void Num4(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"4";
        pant.setText(Cap);
    }
    public void Num5(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"5";
        pant.setText(Cap);
    }
    public void Num6(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"6";
        pant.setText(Cap);
    }
    public void Num7(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"7";
        pant.setText(Cap);
    }
    public void Num8(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"8";
        pant.setText(Cap);
    }
    public void Num9(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"9";
        pant.setText(Cap);
    }
    public void Num0(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+"0";
        pant.setText(Cap);
    }
    public void Punto(View V)
    {
        String Cap = pant.getText().toString();
        Cap = Cap+".";
        pant.setText(Cap);
    }


    // METODO PARA LAS OPERACIONES
    public void Suma(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero2 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = opeSuma;
    }


    public void Resta(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero2 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = opeResta;
    }

    public void Divi(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero2 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = opeDivi;
    }

    public void Multi(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero2 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = opeMilti;
    }

    public void Seno(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero1 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("Sin("+ numero1+")");
        ope = opeSeno;
    }

    public void Coseno(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero1 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("Cos("+ numero1+")");
        ope = opeCoseno;
    }

    public void Tangente(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero1 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("Tan("+ numero1+")");
        ope = opeTangente;
    }

    public void Csc(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero1 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("Csc("+ numero1+")");
        ope = opeCsc;
    }

    public void Sec(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero1 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("Sec("+ numero1+")");
        ope = opeSecante;
    }

    public void Cot(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero1 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("Cot("+ numero1+")");
        ope = opeCotangente;
    }

    public void Raiz(View v)
    {
        try
        {
            String aux = pant.getText().toString();
            numero1 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("√"+ numero1);
        ope = opeRaiz;
    }

    public void Logaritmo(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            numero1 = Double.parseDouble(aux);

        }catch (NumberFormatException nfe){}
        pant.setText("Log("+ numero1+")");
        ope = opeLogaritmo;
    }

    public void Pi(View V)
    {
        try
        {
            String aux = pant.getText().toString();
            if (resultado==0){
                numero1 = Math.PI;
            }
            else
            {
                numero2 = Math.PI;
            }


        }catch (NumberFormatException nfe){}
        pant.setText("3.14159");
        //ope = opePi;
    }



    //METODO PARA EL RESULTADO
    public void Resul(View V)
    {
        try
        {
            String aux2 = pant.getText().toString();
            numero1 = Double.parseDouble(aux2);

        }catch (NumberFormatException nfe){}
        pant.setText("");

        switch (ope) {
            case opeSuma:
                resultado = numero1 + numero2;
                break;

            case opeResta:
                resultado = numero2 - numero1;
                break;

            case opeDivi:
                if (numero1 == 0)
                {
                    pant.setText("Error");
                }
                else
                {
                    resultado = numero2 / numero1;
                }
                break;

            case opeMilti:
                resultado = numero1 * numero2;
                break;

            case opeSeno:
                double rad = Math.toRadians(numero1);
                resultado = (Math.sin(rad));
                break;

            case opeCoseno:
                double radC = Math.toRadians(numero1);
                resultado = (Math.cos(radC));
                break;

            case opeTangente:
                double radT = Math.toRadians(numero1);
                resultado = (Math.tan(radT));
                break;

            case opeCsc:
                double anguloC = Math.acos(numero1);
                resultado = (Math.toDegrees(anguloC));
                break;

            case opeSecante:
                double anguloS = Math.asin(numero1);
                resultado = (Math.toDegrees(anguloS));
                break;

            case opeCotangente:
                double anguloCT = Math.atan(numero1);
                resultado = (Math.toDegrees(anguloCT));
                break;

            case opeRaiz:
                resultado=Math.sqrt(numero1);
                break;

            case opeLogaritmo:
                resultado = Math.log10(numero1);
                break;

        }

        pant.setText(""+ resultado);
        numero1 = resultado;

    }

    public void Clear(View V)
    {
        pant.setText("");
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
    }

    public void Borrar(View V)
    {
        if (!pant.getText().toString().equals(""))
        {
            pant.setText(pant.getText().subSequence(0, pant.getText().length()-1)+"");
        }
    }

    public void off(View v)
    {
        finish();
    }




}
