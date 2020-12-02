package com.example.componentes;
import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
public class SecondActivity extends Activity {
    TextView jtv1;
    Bundle bdl;
    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_second);
        jtv1 = (TextView) findViewById(R.id.xtv1);
        bdl = getIntent().getExtras();
        //jtv1.append("Numero " + bdl.getInt("NUMERO"));
        int x = bdl.getInt("NUMERO");
        fibonacci(x);
        IsPrimo(x);
        Maravilloso(x);
        String palabra = String.valueOf(x) ;
        Palindromo(palabra);

    }
    public void fibonacci(int numero){
        int limite = 25;
        int fibo1, fibo2, i;
        while(limite<=1 && limite != 0);
        fibo1=1;
        fibo2=1;
        for( i=2; i <= limite ; i++){
            if( numero == fibo2){

                jtv1.append ( "\n \n El numero " +numero+ " se encuentra en fibonacci");
                break;
            }else if ( i < limite){
                fibo2 = fibo1 + fibo2;
                fibo1 = fibo2 - fibo1;
            }else{
                jtv1.append("\n \n  El numero " + numero + " no se encuentra dentro de la serie de Fibonacci \n");
            }
        }
    }
    public void IsPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        if (numero % 2 == 0) jtv1.append("No es primo");
        //si no, solo revisa los impares
        for(int i=3 ;i * i <= numero ;i += 2) {
            if(numero %i == 0)
                jtv1.append("Es primo");
        }
        //v1.append("\n Es primo");
    }
    public void Maravilloso(int numero){
        jtv1.append("\n NUmero original: "+numero);
        int i=1;
        while(true){
            if(numero == 0) break;
            if(numero == 1){
                jtv1.append("\n Numero maravilloso");
                break;
            }
            if( numero%2 == 0){
                jtv1.append("\n"+numero+" es par:   "+numero);
                numero=numero/2;
                jtv1.append("/2 = " +numero);
            }

            else{
                jtv1.append("\n"+numero+" es impar:  " + numero);
                numero=numero*3+1;
                jtv1.append("*3+1 = " +numero);
            }
            //jtv1.append("\n \t Proceso:"+i);
            i++;
        }
    }
    public void Palindromo(String palabra){
        int inc = 0;
        int des = palabra.length()-1;
        boolean bError = false;
        while ((inc<des) && (!bError)){
            if (palabra.charAt(inc)==palabra.charAt(des)){
                inc++;
                des--;
            } else
                bError = true;
        }
        if (!bError)
            jtv1.append("\n \n"+palabra + " es un PALINDROMO");
        else
            jtv1.append("\n \n"+palabra + " NO es un palindromo");
    }
}
