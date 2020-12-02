package com.example.componentes;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends Activity  {
    Button jbn1, jbn2,jbn3, jbn4,jbn5, jbn6,jbn7, jbn8,jbn9, jbn0, jbnC, jbnR;
    EditText jet1;
    Bundle bdl;
    Intent itn;
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        jet1 = (EditText) findViewById(R.id.xet1);
        jbn1 = (Button) findViewById(R.id.xbn1);
        jbn2 = (Button) findViewById(R.id.xbn2);
        jbn3 = (Button) findViewById(R.id.xbn3);
        jbn4 = (Button) findViewById(R.id.xbn4);
        jbn5 = (Button) findViewById(R.id.xbn5);
        jbn6 = (Button) findViewById(R.id.xbn6);
        jbn7 = (Button) findViewById(R.id.xbn7);
        jbn8 = (Button) findViewById(R.id.xbn8);
        jbn9 = (Button) findViewById(R.id.xbn9);
        jbn0 = (Button) findViewById(R.id.xbn0);
        jbnC = (Button) findViewById(R.id.xbnC);
        jbnR = (Button) findViewById(R.id.xbnR);
        jbnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                itn = new Intent(MainActivity.this, SecondActivity.class );
                bdl = new Bundle();
                bdl.putInt("NUMERO", Integer.parseInt(jet1.getText().toString()));
                itn.putExtras(bdl);
                startActivity(itn);
            }
        });
    }
    public void Clickxbn1(View v){
        jet1.append(jbn1.getText().toString());
    }
    public void Clickxbn2(View v){
        jet1.append(jbn2.getText().toString());
    }
    public void Clickxbn3(View v){
        jet1.append(jbn3.getText().toString());
    }
    public void Clickxbn4(View v){
        jet1.append(jbn4.getText().toString());
    }
    public void Clickxbn5(View v){
        jet1.append(jbn5.getText().toString());
    }
    public void Clickxbn6(View v){
        jet1.append(jbn6.getText().toString());
    }
    public void Clickxbn7(View v){
        jet1.append(jbn7.getText().toString());
    }
    public void Clickxbn8(View v){
        jet1.append(jbn8.getText().toString());
    }
    public void Clickxbn9(View v){
        jet1.append(jbn9.getText().toString());
    }
    public void Clickxbn0(View v){
        jet1.append(jbn0.getText().toString());
    }
    public void Clear(View v){
        jet1.setText("");
    }

}