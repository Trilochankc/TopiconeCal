package com.trilochan.topiconecal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GridActivity extends AppCompatActivity {

    CalcClass calcClass=new CalcClass();

    TextView textOperation;
    EditText editTextScreen;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
    button9, buttonEqual, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonDelete;
    public int num1, num2, finalResult;
    public int checkNotation;
    LinearLayout linearLayoutTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        // initilization
        textOperation = findViewById(R.id.topResult);
        editTextScreen = findViewById(R.id.etInput);
        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);

        buttonDelete = findViewById(R.id.delete);
        buttonEqual = findViewById(R.id.btnEqual);
        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMul = findViewById(R.id.btnMul);
        buttonDiv = findViewById(R.id.btnDivide);

        linearLayoutTop = findViewById(R.id.top);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "0");
                textOperation.setText(editTextScreen.getText());

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "1");
                textOperation.setText(editTextScreen.getText());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "2");
                textOperation.setText(editTextScreen.getText());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "3");
                textOperation.setText(editTextScreen.getText());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "4");
                textOperation.setText(editTextScreen.getText());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "5");
                textOperation.setText(editTextScreen.getText());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "6");
                textOperation.setText(editTextScreen.getText());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "7");
                textOperation.setText(editTextScreen.getText());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "8");
                textOperation.setText(editTextScreen.getText());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextScreen.setText(editTextScreen.getText() + "9");
                textOperation.setText(editTextScreen.getText());
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textOperation.setText("");
                num1=0;
                num2=0;
                int length = editTextScreen.getText().length();
                if (length > 0) {
                    editTextScreen.getText().delete(length - 1, length);
                }
            }
        });

        buttonDelete.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                editTextScreen.getText().clear();
                textOperation.setText("");
                num1=0;
                num2=0;
                return true;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Integer.parseInt(editTextScreen.getText().toString());
                calcClass.setOne(num1);
                calcClass.setTwo(num2);
                sumNum();
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNotation = 1;
                num1 = Integer.parseInt(editTextScreen.getText().toString());
                calcClass.setOne(num1);
                textOperation.setText(calcClass.getOne() + "+");
                editTextScreen.getText().clear();
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNotation = 2;
                num1 = Integer.parseInt(editTextScreen.getText().toString());
                calcClass.setOne(num1);
                textOperation.setText( calcClass.getOne() + "-");
                editTextScreen.getText().clear();
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNotation = 3;
                num1 = Integer.parseInt(editTextScreen.getText().toString());
                calcClass.setOne(num1);
                textOperation.setText(calcClass.getOne()  + "*");
                editTextScreen.getText().clear();
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNotation = 4;
                num1 = Integer.parseInt(editTextScreen.getText().toString());
                calcClass.setOne(num1);
                textOperation.setText(calcClass.getOne() + "÷");
                editTextScreen.getText().clear();
            }
        });
    }

    public void sumNum() {
        if (checkNotation == 1) {
            editTextScreen.setText(String.valueOf(calcClass.add()));
            textOperation.setText(num1 + "+" + num2);
        } else if (checkNotation == 2)
        {
            finalResult = num1 - num2;
            editTextScreen.setText(String.valueOf(calcClass.Subtract()));
            textOperation.setText(num1 + "-" + num2);
        }
        else if (checkNotation == 3) {
            finalResult = num1 * num2;
            editTextScreen.setText(String.valueOf(calcClass.Multiply()));
            textOperation.setText(num1 + "x" + num2);

        } else if (checkNotation == 4) {
            finalResult = num1 / num2;
            editTextScreen.setText(String.valueOf(finalResult));
            textOperation.setText(num1 + "÷" + num2);
        }
    }


}