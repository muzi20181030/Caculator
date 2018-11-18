package cn.edu.bistu.cs.se.caculator113;

import java.math.BigDecimal;
import java.util.Stack;

/*
 * 后序表达式求值实现
 */
public class BackExpression {
    public static BigDecimal evaluate(String s){
        String str;
        str = CenterToBack.transform(s);    //中序表达式转换为后序表达式
        System.out.println(str);
        Stack<BigDecimal> num = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'||str.charAt(i)=='.'||(i==0)&&(str.charAt(i)=='-'||str.charAt(i)=='+')||(i>0)&&str.charAt(i-1)==' ')
            {
                String number=new String();
                number+=str.charAt(i);
                while(i!=str.length()-1)
                {
                    i++;
                    if(str.charAt(i)>'0'&&str.charAt(i)<='9'||str.charAt(i)=='.')
                    {
                        number+=str.charAt(i);
                    }
                    else
                    {
                        i--;
                        break;
                    }
                }
                BigDecimal num1=new BigDecimal(number);
                num.push(num1);
            }
            else
            {
                if(str.charAt(i)=='+')
                {
                    BigDecimal num1=num.pop();
                    BigDecimal num2=num.pop();
                    BigDecimal num3=num1.add(num2);
                    num.push(num3);
                }
                else if(str.charAt(i)=='-')
                {
                    BigDecimal num1=num.pop();
                    BigDecimal num2=num.pop();
                    BigDecimal num3=num2.subtract(num1);
                    num.push(num3);
                }
                else if(str.charAt(i)=='*')
                {
                    BigDecimal num1=num.pop();
                    BigDecimal num2=num.pop();
                    BigDecimal num3=num2.multiply(num1);
                    num.push(num3);
                }
                else if(str.charAt(i)=='/')
                {
                    BigDecimal num1=num.pop();
                    BigDecimal num2=num.pop();
                    BigDecimal num3=num2.divide(num1,10,BigDecimal.ROUND_HALF_UP);
                    num.push(num3);
                }
            }
        }
        return num.pop();
    }
}

