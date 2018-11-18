package cn.edu.bistu.cs.se.caculator113;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnOne = (Button) findViewById(R.id.one);
        Button btnTwo = (Button) findViewById(R.id.two);
        Button btnThree = (Button) findViewById(R.id.three);
        Button btnFour = (Button) findViewById(R.id.four);
        Button btnFive = (Button) findViewById(R.id.five);
        Button btnSix = (Button) findViewById(R.id.six);
        Button btnSeven = (Button) findViewById(R.id.seven);
        Button btnEight = (Button) findViewById(R.id.eight);
        Button btnNine = (Button) findViewById(R.id.nine);
        Button btnPlus = (Button) findViewById(R.id.plus);
        Button btnDelete = (Button) findViewById(R.id.delete);
        Button btnClear = (Button) findViewById(R.id.clear);
        Button btnSub = (Button) findViewById(R.id.sub);
        Button btnPoint = (Button) findViewById(R.id.point);
        Button btnEqual = (Button) findViewById(R.id.equal);
        Button btnMutiply = (Button) findViewById(R.id.multiply);
        Button btnDivide = (Button) findViewById(R.id.divide);
        Button btnZero = (Button) findViewById(R.id.zero);
        Button btnLeft = (Button) findViewById(R.id.left_bracket);
        Button btnRight = (Button)findViewById(R.id.right_bracket);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '1';
                txt1.setText(str);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '2';
                txt1.setText(str);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '3';
                txt1.setText(str);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '4';
                txt1.setText(str);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '5';
                txt1.setText(str);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '6';
                txt1.setText(str);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '7';
                txt1.setText(str);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '8';
                txt1.setText(str);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '9';
                txt1.setText(str);
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '0';
                txt1.setText(str);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '+';
                txt1.setText(str);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '-';
                txt1.setText(str);
            }
        });
        btnMutiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                if(str.length()>0) {
                    str = str + '*';
                    txt1.setText(str);
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                if(str.length()>0) {
                    str = str + '/';
                    txt1.setText(str);
                }
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '.';
                txt1.setText(str);
            }
        });
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + '(';
                txt1.setText(str);
            }
        });
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                String str = txt1.getText().toString();
                str = str + ')';
                txt1.setText(str);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1=(TextView)findViewById(R.id.txt1);
                TextView txt2=(TextView)findViewById(R.id.txt2);
                txt1.setText("");
                txt2.setText("");
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                TextView txt2 = (TextView) findViewById(R.id.txt2);
                String str = (String) txt1.getText();
                if (str.length() > 0) {
                    str = str.substring(0, str.length() - 1);
                    txt1.setText(str);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                TextView txt2 = (TextView) findViewById(R.id.txt2);
                String str=txt1.getText().toString();
                try {
                    txt2.setText(BackExpression.evaluate(str).toString());
                }
                catch (Exception ex)
                {
                    txt2.setText("错误");
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item:
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                this.finish();
                break;
            default:
                break;
        }
        return true;
    }
}
