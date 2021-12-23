/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefixevaluator;
import java.util.*;
/**
 *
 * @author Thy Tran
 */
public class PrefixEvaluator {

    public static void main(String[] args) {
        //Prompt the user for entering the operators and the expression
        Scanner console = new Scanner(System.in);
        System.out.println("This program evaluates prefix");
        System.out.println("expressions that include the");
        System.out.println("operators +, -, *, / and %");
        System.out.print("expression? ");
        double value = evaluate(console);
        System.out.println("value = " + value);
    }
    
    //pre: input contains a legal prefix expression
    //post: expression is consumed and the result is returned
    public static double evaluate(Scanner input) {
        if(input.hasNextDouble()) {
            return input.nextDouble();
        } else {
            String operator = input.next();
            double operand1 = evaluate(input);
            double operand2 = evaluate(input);
            return apply(operator, operand1, operand2);
        }
    }
    
    //pre: operator is one of +. -, *, / or %
    //post: returns the result of applying the given operator
    //      to the given operands
    public static double apply(String operator, double operand1, double operand2) {
        if(operator.equals("+")) {
            return operand1 + operand2;
        } else if (operator.equals("-")) {
            return operand1 - operand2;
        } else if (operator.equals("*")) {
            return operand1 * operand2;
        } else if (operator.equals("/")) {
            return operand1 / operand2;
        } else if (operator.equals("%")) {
            return operand1 % operand2;
        } else {
            throw new IllegalArgumentException("bad operator: " + operator);
        }
    }
}
