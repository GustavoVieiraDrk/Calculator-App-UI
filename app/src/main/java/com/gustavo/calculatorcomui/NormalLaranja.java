package com.gustavo.calculatorcomui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class NormalLaranja extends AppCompatActivity implements View.OnClickListener {

    private TextView mathResult, mathExpresion, numOne, numTwo, numThree, numFour, numFive, numSix,
             numSeven, numEight, numNine, numZero, dot, sum, sub, mult, div, equal, clean, backspace, devBrand, happyFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_laranja);

        initComponents();
        getSupportActionBar().hide();

        numOne.setOnClickListener(this);
        numTwo.setOnClickListener(this);
        numThree.setOnClickListener(this);
        numFour.setOnClickListener(this);
        numFive.setOnClickListener(this);
        numSix.setOnClickListener(this);
        numSeven.setOnClickListener(this);
        numEight.setOnClickListener(this);
        numNine.setOnClickListener(this);
        numZero.setOnClickListener(this);
        //clean.setOnClickListener(this);
        dot.setOnClickListener(this);
        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        mult.setOnClickListener(this);
        devBrand.setOnClickListener(this);
        //happyFace.setOnClickListener(this);

    }

    private void initComponents() {

        mathResult = findViewById(R.id.mathResult);
        mathExpresion = findViewById(R.id.MathExpression);
        numOne = findViewById(R.id.NumOne);
        numTwo = findViewById(R.id.NumTwo);
        numThree = findViewById(R.id.NumThree);
        numFour = findViewById(R.id.NumFour);
        numFive = findViewById(R.id.NumFive);
        numSix = findViewById(R.id.NumSix);
        numSeven = findViewById(R.id.NumSeven);
        numEight = findViewById(R.id.NumEigth);
        numNine = findViewById(R.id.NumNine);
        numZero = findViewById(R.id.NumZero);
        clean = findViewById(R.id.Clear);
        dot = findViewById(R.id.NumDot);
        sum = findViewById(R.id.NumSum);
        sub = findViewById(R.id.Subt);
        mult = findViewById(R.id.Mult);
        div = findViewById(R.id.Divide);
        equal = findViewById(R.id.NumEqual);

        devBrand = findViewById(R.id.BrandDevelopment);
        //happyFace = findViewById(R.id.HappyFace);

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpresion.setText("");
                mathResult.setText("");
            }
        });

//        backspace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TextView equacao = findViewById(R.id.MathExpression);
//                String caracter = equacao.getText().toString();
//            }
//        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Expression expression = new ExpressionBuilder(mathExpresion.getText().toString()).build();
                    double result = expression.evaluate();
                    long longResult = (long) result;

                    if(result == (double)longResult){
                        mathResult.setText((CharSequence)String.valueOf(longResult));
                    } else {
                        mathResult.setText(String.valueOf(result));
                    }
                } catch (Exception e){
                    mathExpresion.setText("Error");
                }
            }
        });
    }

    public void addExpressionData(String string, boolean cleanData) {

        if(mathResult.getText().equals("")){
            mathExpresion.setText(" ");
        }

        if(cleanData){
            mathResult.setText(" ");
            mathExpresion.append(string);
        } else {
            mathExpresion.append(mathResult.getText());
            mathExpresion.append(string);
            mathResult.setText(" ");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.NumOne:
                addExpressionData("1", true);
                break;
            case R.id.NumTwo:
                addExpressionData("2", true);
                break;
            case R.id.NumThree:
                addExpressionData("3", true);
                break;
            case R.id.NumFour:
                addExpressionData("4", true);
                break;
            case R.id.NumFive:
                addExpressionData("5", true);
                break;
            case R.id.NumSix:
                addExpressionData("6", true);
                break;
            case R.id.NumSeven:
                addExpressionData("7", true);
                break;
            case R.id.NumEigth:
                addExpressionData("8", true);
                break;
            case R.id.NumNine:
                addExpressionData("9", true);
                break;
            case R.id.NumZero:
                addExpressionData("0", true);
                break;
            case R.id.NumDot:
                addExpressionData(".", false);
                break;
            case R.id.NumSum:
                addExpressionData("+", false);
                break;
            case R.id.Subt:
                addExpressionData("-", false);
                break;
            case R.id.Divide:
                addExpressionData("/", false);
                break;
            case R.id.Mult:
                addExpressionData("*", false);
                break;
            case R.id.BrandDevelopment:
                mathExpresion.setText("Developed By Gustavo");
                break;
//            case R.id.HappyFace:
//                happyFace.setText("^-^");
//                break;
        }
    }
}