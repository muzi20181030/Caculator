package cn.edu.bistu.cs.se.caculator113;

import java.util.Stack;

public class CenterToBack {
    public static String transform(String s){
        String st = new String();
        Stack<Character> ops = new Stack<>();    //运算符栈
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'||ch=='.'){
                if(i>=1)
                {
                    if(s.charAt(i-1)>='0'&&s.charAt(i-1)<='9'||s.charAt(i-1)=='.')
                        st=st+ch;
                    else
                    {
                        if(st.length()>=1)
                        {
                            if(st.charAt(st.length()-1)>='0'&&st.charAt(st.length()-1)<='9')
                            {
                                st=st+' ';
                                st=st+ch;
                            }
                            else
                                st=st+ch;
                        }
                        else
                            st=st+ch;
                    }
                }
                else
                    st=st+ch;
            }
            else if(ch == '('){
                ops.push(ch);
            }
            else if(ch == ')'){
                while(true){
                    ch = ops.pop();
                    if(ch == '('){
                        break;
                    }
                    else{

                        st=st+ch;
                    }
                }
            }
            else if(ch=='+'||ch=='-')
            {
                if(i==0)
                    st=st+ch;
                else if(s.charAt(i-1)=='+'||s.charAt(i-1)=='-'||s.charAt(i-1)=='*'||s.charAt(i-1)=='/')
                {
                    st=st+' ';
                    st=st+ch;
                }
                else
                {
                    if(!ops.isEmpty())
                    {
                        while(!ops.isEmpty())
                        {
                            if(ops.peek()!='(')
                            {
                                st=st+ops.pop();
                            }
                            else
                            {
                                break;
                            }
                        }
                        ops.push(ch);
                    }
                    else
                    {
                        ops.push(ch);
                    }
                }
            }
            else
            {
                if(!ops.isEmpty())
                {
                    while(!ops.isEmpty())
                    {
                        if(ops.peek()!='('&&ops.peek()!='+'&&ops.peek()!='-')
                        {
                            st=st+ops.pop();
                        }
                        else
                        {
                            break;
                        }
                    }
                    ops.push(ch);
                }
                else
                {
                    ops.push(ch);
                }
            }
        }
        while(!ops.isEmpty()){
            st=st+ops.pop();
        }
        return st.toString();
    }

}
