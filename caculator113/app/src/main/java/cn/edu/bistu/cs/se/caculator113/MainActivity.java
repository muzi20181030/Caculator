package cn.edu.bistu.cs.se.caculator113;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String str;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        Button btnDelete =(Button) findViewById(R.id.delete);
        Button btnClear = (Button) findViewById(R.id.clear);
        Button btnSub = (Button) findViewById(R.id.sub);
        Button btnPoint = (Button) findViewById(R.id.point);
        Button btnEqual = (Button) findViewById(R.id.equal);
        Button btnMutiply = (Button)findViewById(R.id.multiply);
        Button btnDivide = (Button)findViewById(R.id.divide);
        Button btnZero = (Button)findViewById(R.id.zero);
        Button btnMod = (Button)findViewById(R.id.mod) ;
        btnOne.setOnClickListener(new MyClickListener1());
        btnTwo.setOnClickListener(new MyClickListener2());
        btnThree.setOnClickListener(new MyClickListener3());
        btnFour.setOnClickListener(new MyClickListener4());
        btnFive.setOnClickListener(new MyClickListener5());
        btnSix.setOnClickListener(new MyClickListener6());
        btnSeven.setOnClickListener(new MyClickListener7());
        btnEight.setOnClickListener(new MyClickListener8());
        btnNine.setOnClickListener(new MyClickListener9());
        btnClear.setOnClickListener(new MyClickListenerClear());
        btnPlus.setOnClickListener(new MyClickListenerPlus());
        btnSub.setOnClickListener(new MyClickListenerSub());
        btnDelete.setOnClickListener(new MyClickListenerDelete());
        btnPoint.setOnClickListener(new MyClickListenerPoint());
        btnEqual.setOnClickListener(new MyClickListenerEqual());
        btnMutiply.setOnClickListener(new MyClickListenerMultiply());
        btnDivide.setOnClickListener(new MyClickListenerDivide());
        btnZero.setOnClickListener(new MyClickListener0());
        btnMod.setOnClickListener(new MyClickListenerMod());
    }
    class MyClickListener0 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"0";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListener1 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"1";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListener2 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"2";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListener3 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"3";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListener4 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"4";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListener5 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"5";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListener6 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"6";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListener7 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"7";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListener8 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"8";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListener9 implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0;
            str=str+"9";
            if(txt2.getText().equals("错误")&&txt1.getText().equals(""))
            {
                txt2.setText("");
            }
            txt1.setText(str);
            if(str.length()>=3)
            {
                for (i = 1; i < str.length(); i++)
                {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                        BigDecimal num1 = new BigDecimal(str.substring(0,i));
                        BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                        BigDecimal sum;
                        switch(str.charAt(i)) {
                            case '+':
                                sum = num1.add(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '-':
                                sum = num1.subtract(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '*':
                                sum = num1.multiply(num2);
                                txt2.setText('='+sum.toString());
                                break;
                            case '/':
                                if(num2.compareTo(BigDecimal.ZERO)==0)
                                    txt2.setText("错误");
                                else {
                                    sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                    txt2.setText('=' + sum.toString());
                                }
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
    class MyClickListenerClear implements View.OnClickListener {//清除textview1
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            txt1.setText("");
            txt2.setText("");
        }
    }
    class MyClickListenerDelete implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            if (str.length() > 0) {
                int i = 0;
                str = str.substring(0, str.length() - 1);
                txt1.setText(str);
                if (str.length() >= 2) {
                    if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '*' || str.charAt(str.length() - 1) == '/') {//若最后一位是符号时txt2不显示内容
                        str = str.substring(0, str.length() - 1);
                        txt2.setText("");
                    } else if (str.charAt(str.length() - 1) != '.') {
                        for (i = 1; i < str.length() - 1; i++)//若点击操作符前一位的前面有操作符号的时候，将前面操作符进行运算
                        {
                            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                                BigDecimal num1 = new BigDecimal(str.substring(0, i));
                                BigDecimal num2 = new BigDecimal(str.substring(i + 1, str.length()));
                                BigDecimal sum;
                                switch (str.charAt(i)) {
                                    case '+':
                                        sum = num1.add(num2);
                                        txt2.setText("=" + sum.toString());
                                        break;
                                    case '-':
                                        sum = num1.subtract(num2);
                                        txt2.setText("=" + sum.toString());
                                        break;
                                    case '*':
                                        sum = num1.multiply(num2);
                                        txt2.setText("=" + sum.toString());
                                        break;
                                    case '/':
                                        if (num2.compareTo(BigDecimal.ZERO) == 1) {
                                            sum = num1.divide(num2, 10, BigDecimal.ROUND_HALF_UP);
                                            txt2.setText("=" + sum.toString());
                                        } else {
                                            txt2.setText("错误");
                                        }
                                        break;
                                }
                                break;
                            }
                        }
                        if (i == str.length() - 1)
                            txt2.setText("");
                    }
                    else
                    {
                        for (i = 1; i < str.length() - 1; i++)//若点击操作符前一位的前面是小数点的时候，将前面操作符进行运算
                        {
                            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                                BigDecimal num1 = new BigDecimal(str.substring(0, i));
                                BigDecimal num2 = new BigDecimal(str.substring(i + 1, str.length()-1));
                                BigDecimal sum;
                                switch (str.charAt(i)) {
                                    case '+':
                                        sum = num1.add(num2);
                                        txt2.setText("=" + sum.toString());
                                        break;
                                    case '-':
                                        sum = num1.subtract(num2);
                                        txt2.setText("=" + sum.toString());
                                        break;
                                    case '*':
                                        sum = num1.multiply(num2);
                                        txt2.setText("=" + sum.toString());
                                        break;
                                    case '/':
                                        if (num2.compareTo(BigDecimal.ZERO) == 1) {
                                            sum = num1.divide(num2, 10, BigDecimal.ROUND_HALF_UP);
                                            txt2.setText("=" + sum.toString());
                                        } else {
                                            txt2.setText("错误");
                                        }
                                        break;
                                }
                                break;
                            }
                        }
                    }
                } else if (str.length() == 1) {
                    txt2.setText("");
                }
            }
        }
    }
    class MyClickListenerEqual implements View.OnClickListener {//等于
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String)txt2.getText();
            if(str.equals("错误"))
            {
                txt1.setText("");
            }
            else if(!str.equals(""))
            {
                str=str.substring(1,str.length());
                txt1.setText(str);
                txt2.setText("");
            }
        }
    }
    class MyClickListenerPlus implements View.OnClickListener {//加法运算，当用户点击加法时触发，先判断textview1中的内容是否为空，若为空，此操作符无效
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i;
            if(str.length() >=2 ) {
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/') {//若最后一位是符号时将该符号替换
                    str = str.substring(0,str.length()-1);
                    txt1.setText(str + "+");
                }
                else if(str.charAt(str.length()-1) != '.'){
                    for (i = 1; i < str.length() - 1; i++)//若点击操作符前一位的前面有操作符号的时候，将前面操作符进行运算
                    {
                        if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                            BigDecimal num1 = new BigDecimal(str.substring(0,i));
                            BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                            BigDecimal sum;
                            switch(str.charAt(i)) {
                                case '+':
                                    sum = num1.add(num2);
                                    txt1.setText(sum.toString() + "+");
                                    break;
                                case '-':
                                    sum = num1.subtract(num2);
                                    txt1.setText(sum.toString() + "+");
                                    break;
                                case '*':
                                    sum = num1.multiply(num2);
                                    txt1.setText(sum.toString() + "+");
                                    break;
                                case '/':
                                    if(num2.compareTo(BigDecimal.ZERO)==1)
                                    {
                                        sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                        txt1.setText(sum.toString() + "+");
                                    }
                                    else
                                    {
                                        txt1.setText("");
                                        txt2.setText("错误");
                                    }
                                    break;
                            }
                            break;
                        }
                    }
                    if(i==str.length()-1)
                        txt1.setText(str + "+");
                }
            }
            else if(str.length()==1)
            {
                if(str.charAt(0)!='-')
                {
                    txt1.setText(txt1.getText() + "+");
                }
            }
        }
    }
    class MyClickListenerSub implements View.OnClickListener {//减法运算，当用户点击加法时触发，先判断textview1中的内容是否为空，若为空，此操作符无效
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i;
            if(str.length() > 1 ) {
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/') {//若最后一位是符号时将该符号替换
                    str = str.substring(0,str.length()-1);
                    txt1.setText(str + "-");
                }
                else if(str.charAt(str.length()-1) != '.'){
                    for (i = 1; i < str.length() - 1; i++)//若点击操作符前一位的前面有操作符号的时候，将前面操作符进行运算
                    {
                        if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                            BigDecimal num1 = new BigDecimal(str.substring(0,i));
                            BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                            BigDecimal sum;
                            switch(str.charAt(i)) {
                                case '+':
                                    sum = num1.add(num2);
                                    txt1.setText(sum.toString() + "-");
                                    break;
                                case '-':
                                    sum = num1.subtract(num2);
                                    txt1.setText(sum.toString() + "-");
                                    break;
                                case '*':
                                    sum = num1.multiply(num2);
                                    txt1.setText(sum.toString() + "-");
                                    break;
                                case '/':
                                    if(num2.compareTo(BigDecimal.ZERO)==1)
                                    {
                                        sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                        txt1.setText(sum.toString() + "+");
                                    }
                                    else
                                    {
                                        txt1.setText("");
                                        txt2.setText("错误");
                                    }
                                    break;
                            }
                            break;
                        }
                    }
                    if(i==str.length()-1)
                        txt1.setText(str + "-");
                }
            }
            else if(str.length()==0)
            {
                str=str+'-';
                txt1.setText(str);
            }
            else if(str.length()==1)
            {
                if(str.charAt(0)!='-')
                    txt1.setText(txt1.getText()+"-");
            }
        }
    }
    class MyClickListenerPoint implements View.OnClickListener {//小数点
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i=0,j=0;
            if(str.length() !=0 )
            {
                for(i=1;i<str.length();i++) {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/')
                        break;
                }
                if(i==str.length())
                {
                    for(i=1;i<str.length();i++)
                    {
                        if(str.charAt(i)=='.')
                            break;
                    }
                    if(i==str.length())//如果无运算符号，也无小数点，则可加上改小数点
                        str=str+'.';
                    txt1.setText(str);
                }
                else {
                    for (j = i + 1; j < str.length(); j++) {
                        if (str.charAt(j) == '.')
                            break;
                    }
                    if (j == str.length()&&str.charAt(str.length()-1)!='+'&&str.charAt(str.length()-1)!='-'&&str.charAt(str.length()-1)!='*'&&str.charAt(str.length()-1)!='/') {//如果有符号，符号后无小数点，则可加上改小数点
                        str = str + '.';
                        txt1.setText(str);
                    }
                }
            }

        }
    }
    class MyClickListenerMultiply implements View.OnClickListener {//乘法运算，当用户点击加法时触发，先判断textview1中的内容是否为空，若为空，此操作符无效
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i;
            if(str.length() >=2 ) {
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/') {//若最后一位是符号时将该符号替换
                    str = str.substring(0,str.length()-1);
                    txt1.setText(str + "*");
                }
                else if(str.charAt(str.length()-1) != '.'){
                    for (i = 1; i < str.length() - 1; i++)//若点击操作符前一位的前面有操作符号的时候，将前面操作符进行运算
                    {
                        if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                            BigDecimal num1 = new BigDecimal(str.substring(0,i));
                            BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                            BigDecimal sum;
                            switch(str.charAt(i)) {
                                case '+':
                                    sum = num1.add(num2);
                                    txt1.setText(sum.toString() + "*");
                                    break;
                                case '-':
                                    sum = num1.subtract(num2);
                                    txt1.setText(sum.toString() + "*");
                                    break;
                                case '*':
                                    sum = num1.multiply(num2);
                                    txt1.setText(sum.toString() + "*");
                                    break;
                                case '/':
                                    if(num2.compareTo(BigDecimal.ZERO)==1)
                                    {
                                        sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                        txt1.setText(sum.toString() + "+");
                                    }
                                    else
                                    {
                                        txt1.setText("");
                                        txt2.setText("错误");
                                    }
                                    break;
                            }
                            break;
                        }
                    }
                    if(i==str.length()-1)
                        txt1.setText(str + "*");
                }
            }
            else if(str.length()==1)
            {
                if(str.charAt(0)!='-')
                {
                    txt1.setText(txt1.getText() + "*");
                }
            }
        }
    }
    class MyClickListenerDivide implements View.OnClickListener {//除法运算，当用户点击加法时触发，先判断textview1中的内容是否为空，若为空，此操作符无效
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i;
            if(str.length() >=2 ) {
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/') {//若最后一位是符号时将该符号替换
                    str = str.substring(0,str.length()-1);
                    txt1.setText(str + "/");
                }
                else if(str.charAt(str.length()-1) != '.'){
                    for (i = 1; i < str.length() - 1; i++)//若点击操作符前一位的前面有操作符号的时候，将前面操作符进行运算
                    {
                        if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                            BigDecimal num1 = new BigDecimal(str.substring(0,i));
                            BigDecimal num2 = new BigDecimal(str.substring(i+1,str.length()));
                            BigDecimal sum;
                            switch(str.charAt(i)) {
                                case '+':
                                    sum = num1.add(num2);
                                    txt1.setText(sum.toString() + "/");
                                    break;
                                case '-':
                                    sum = num1.subtract(num2);
                                    txt1.setText(sum.toString() + "/");
                                    break;
                                case '*':
                                    sum = num1.multiply(num2);
                                    txt1.setText(sum.toString() + "/");
                                    break;
                                case '/':
                                    if(num2.compareTo(BigDecimal.ZERO)==1)
                                    {
                                        sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                                        txt1.setText(sum.toString() + "/");
                                    }
                                    else
                                    {
                                        txt1.setText("");
                                        txt2.setText("错误");
                                    }
                                    break;
                            }
                            break;
                        }
                    }
                    if(i==str.length()-1)
                        txt1.setText(str + "/");
                }
            }
            else if(str.length()==1)
            {
                if(str.charAt(0)!='-')
                {
                    txt1.setText(txt1.getText() + "/");
                }
            }
        }
    }
    class MyClickListenerMod implements View.OnClickListener {//取百分数
        @Override
        public void onClick(View v)
        {
            TextView txt1 = (TextView) findViewById(R.id.txt1);
            TextView txt2 = (TextView) findViewById(R.id.txt2);
            String str = (String) txt1.getText();
            int i;
            if(str.length()==1&&str.charAt(0)>='0'&&str.charAt(0)<='9')
            {
                BigDecimal num1 = new BigDecimal(str);
                BigDecimal num2 = new BigDecimal("100");
                BigDecimal sum;
                sum = num1.divide(num2,10,BigDecimal.ROUND_HALF_UP);
                txt1.setText(sum.toString());
            }
            if(str.length()>=2)
            {
                if(str.charAt(str.length()-1) != '.') {//如果最后一位不是小数点
                    for (i = 1; i < str.length(); i++) {
                        if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                            break;
                        }
                    }
                    if (i == str.length()) {
                        BigDecimal num1 = new BigDecimal(str);
                        BigDecimal num2 = new BigDecimal("100");
                        BigDecimal sum;
                        sum = num1.divide(num2, 10, BigDecimal.ROUND_HALF_UP);
                        txt1.setText(sum.toString());
                    }
                }
                else
                {//如果最后一位是小数点
                    for (i = 1; i < str.length(); i++) {
                        if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                            break;
                        }
                    }
                    if (i == str.length()) {
                        BigDecimal num1 = new BigDecimal(str.substring(0,str.length()-1));
                        BigDecimal num2 = new BigDecimal("100");
                        BigDecimal sum;
                        sum = num1.divide(num2, 10, BigDecimal.ROUND_HALF_UP);
                        txt1.setText(sum.toString());
                    }
                }
            }
        }
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
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
                this.finish();
                break;
            default:
                break;
        }
        return true;
    }
}
