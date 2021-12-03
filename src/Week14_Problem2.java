import java.util.Stack;
import java.util.Scanner;
public class Week14_Problem2 {
        public static void main(String args[]) {
                Stack<String> Operators=new Stack<String>();
                Stack<Double> Values=new Stack<Double>();
                Scanner StdIn=new Scanner("( 1 + 5 )");
                while (StdIn.hasNext()){
                        String s=StdIn.next();
                        if      (s.equals("("));
                        else if (s.equals("+"))  Operators.push(s);
                        else if(s.equals("-")) Operators.push(s);
                        else if(s.equals(")")){
                                String op= Operators.pop();
                                double v=Values.pop();
                                if   (op.equals("+")) v=Values.pop()+v;
                                if   (op.equals("-")) v=Values.pop()-v;
                                Values.push(v);
                        }
                        else Values.push(Double.parseDouble(s));

                }
                System.out.println(Values.pop());


        }
}

