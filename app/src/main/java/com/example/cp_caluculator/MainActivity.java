package com.example.cp_caluculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigInteger;


public class MainActivity extends AppCompatActivity {
    TextView ans;
    EditText num1,num2;
    Button add,sub,mul,div,mod,gcd,lcm,pow,modinv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans = findViewById(R.id.ans);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        mod = findViewById(R.id.mod);
        gcd = findViewById(R.id.gcd);
        lcm = findViewById(R.id.lcm);
        modinv = findViewById(R.id.modinv);
        pow = findViewById(R.id.pow);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a,b,fans;
                String fi = num1.getText().toString();
                String se = num2.getText().toString();
                String last;
                if(fi.equals("") || se.equals("")){
                    ans.setText("put values");
                }
                else{
                    a = Double.parseDouble(fi);
                    b = Double.parseDouble(se);
                    fans = a+b;
                    last = Double.toString(fans);
                    if(last.endsWith(".0")){
                        last = last.replace(".0","");
                    }
                    ans.setText(last);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a,b,fans;
                String fi = num1.getText().toString();
                String se = num2.getText().toString();
                String last;
                if(fi.equals("") || se.equals("")){
                    ans.setText("put values");
                }
                else{
                    a = Double.parseDouble(fi);
                    b = Double.parseDouble(se);
                    fans = a-b;
                    last = Double.toString(fans);
                    if(last.endsWith(".0")){
                        last = last.replace(".0","");
                    }
                    ans.setText(last);
                }

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a,b,fans;
                String fi = num1.getText().toString();
                String se = num2.getText().toString();
                String last;
                if(fi.equals("") || se.equals("")){
                    ans.setText("put values");
                }
                else{
                    a = Double.parseDouble(fi);
                    b = Double.parseDouble(se);
                    fans = a*b;
                    last = Double.toString(fans);
                    if(last.endsWith(".0")){
                        last = last.replace(".0","");
                    }
                    ans.setText(last);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a,b,fans;
                String fi = num1.getText().toString();
                String se = num2.getText().toString();
                String last;
                if(fi.equals("") || se.equals("")){
                    ans.setText("put values");
                }
                else{
                    a = Double.parseDouble(fi);
                    b = Double.parseDouble(se);
                    if(b== 0.0){
                        ans.setText("Invalid");
                    }
                    else{
                        fans = a/b;
                        last = Double.toString(fans);
                        if(last.endsWith(".0")){
                            last = last.replace(".0","");
                        }
                        ans.setText(last);

                    }
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer a,b,fans;
                String fi = num1.getText().toString();
                String se = num2.getText().toString();

                if(fi.equals("") || se.equals("")){
                    ans.setText("put values");
                }
                else{
                    if(fi.contains(".") || se.contains(".")){
                        ans.setText("Only Integer Values");
                    }
                    else{
                        a = Integer.parseInt(fi);
                        b = Integer.parseInt(se);
                        fans = a%b;
                        ans.setText(Integer.toString(fans));
                    }

                }
            }
        });
        gcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer a,b,fans;
                String fi = num1.getText().toString();
                String se = num2.getText().toString();

                if(fi.equals("") || se.equals("")){
                    ans.setText("put values");
                }
                else{
                    if(fi.contains(".") || se.contains(".")){
                        ans.setText("Only Integer Values");
                    }
                    else{
                        a = Integer.parseInt(fi);
                        b = Integer.parseInt(se);
                        BigInteger aa,bb,ggcd;
                        aa = BigInteger.valueOf(a);
                        bb = BigInteger.valueOf(b);
                        ggcd = aa.gcd(bb);
                        ans.setText("gcd : "+ggcd);
                    }
                }
            }
        });
        lcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer a,b,fans;
                String fi = num1.getText().toString();
                String se = num2.getText().toString();

                if(fi.equals("") || se.equals("")){
                    ans.setText("put values");
                }
                else{
                    if(fi.contains(".") || se.contains(".")){
                        ans.setText("Only Integer Values");
                    }
                    else{
                        a = Integer.parseInt(fi);
                        b = Integer.parseInt(se);
                        BigInteger aa,bb,ggcd;
                        aa = BigInteger.valueOf(a);
                        bb = BigInteger.valueOf(b);
                        ggcd = aa.gcd(bb);
                        BigInteger llcm;
                        llcm = (aa.multiply(bb)).divide(ggcd);
                        ans.setText("lcm : "+llcm);
                    }
                }
            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer a,b,fans;
                String fi = num1.getText().toString();
                String se = num2.getText().toString();

                if(fi.equals("") || se.equals("")){
                    ans.setText("put values");
                }
                else{
                    if(fi.contains(".") || se.contains(".")){
                        ans.setText("Only Integer Values");
                    }
                    else{
                        try{
                            a = Integer.parseInt(fi);
                            b = Integer.parseInt(se);
                            BigInteger aa,bb,ppow;
                            aa = BigInteger.valueOf(a);
                            bb = BigInteger.valueOf(b);
                            ppow = aa.pow(b);
                            if(ppow.compareTo(BigInteger.TEN.pow(10))>=0){
                                ans.setText("Answer is very large");
                            }
                            else{
                                ans.setText("a^b : "+ppow);
                            }
                        }
                        catch (Exception e){
                            ans.setText("Answer is very large");
                        }
                    }
                }
            }
        });
        modinv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer a,b,fans;
                String fi = num1.getText().toString();
                String se = num2.getText().toString();

                if(fi.equals("") || se.equals("")){
                    ans.setText("put values");
                }
                else{
                    if(fi.contains(".") || se.contains(".")){
                        ans.setText("Only Integer Values");
                    }
                    else{
                        try {
                            a = Integer.parseInt(fi);
                            b = Integer.parseInt(se);
                            BigInteger aa,bb,mmodinv;
                            aa = BigInteger.valueOf(a);
                            bb = BigInteger.valueOf(b);
                            mmodinv = aa.modInverse(bb);
                            ans.setText("modinv : "+mmodinv);
                        }
                        catch (ArithmeticException e){
                            ans.setText("Not Exist");
                        }
                    }
                }
            }
        });
    }
}