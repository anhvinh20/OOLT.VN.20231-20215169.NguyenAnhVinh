import javax.swing.*;

public class Lab1_225 {
    public static void main(String[] args) {
        double num1 , num2 , num3, num4, num5;

        String strNum1 ,strNum2 ;

        strNum1 = JOptionPane.showInputDialog(null,
                " Please input the first number: ", " Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);


        strNum2 = JOptionPane.showInputDialog(null,
                " Please input the second number: ", " Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        num2 = Double.parseDouble(strNum2);
        num3= num1 +num2 ;
        num4 = Math.abs(num1-num2);
        num5 = num1/num2 ;
//    JOptionPane.showMessageDialog(null, num1 + "+" + num2+ "="+ num3,
//    		"Show sum two numbers", JOptionPane.INFORMATION_MESSAGE);
//    System.exit(0);

        JOptionPane.showMessageDialog(null, num1 + "+" + num2+ "="+ num3+"\n"+"|"+num1 + "-" + num2+"|"+ "="+ num4 +"\n"+num1 + "/" + num2 + "="+ num5+"\n",
                "Show two numbers sum,diff,div: ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

//        JOptionPane.showMessageDialog(null, num1 + "/" + num2 + "="+ num5,
//                "Show div two numbers", JOptionPane.INFORMATION_MESSAGE);
//        System.exit(0);

    }
}
