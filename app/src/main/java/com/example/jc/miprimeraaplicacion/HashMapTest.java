package com.example.jc.miprimeraaplicacion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class HashMapTest {

    public static void main(String[] arg) {

        HashMap<Integer, String> mapObj = new HashMap<>();

        mapObj.put(10, "casas");
        mapObj.put(20, "oficinas");
        mapObj.put(11, "salon");
        mapObj.put(9, "comedor");
        mapObj.put(15, "cocina");

        /*Iterator<Integer> iterator = mapObj.keySet().iterator();
        int key = 0;
        while(iterator.hasNext()){
            key = iterator.next();
            System.out.println(key);
        }*/

        List<Integer> intLst = mapObj.keySet().stream().filter(x -> x == 8).collect(Collectors.toList());

        //evaluate("2 / 2 + 3 * 4 - 6");
        evaluate("2 + 3 * 4 / 3 - 6 / 3 * 3 + 8");
    }

    public static Double evaluate(String expression) {

        boolean pr = true;
        int opInt = 0;
        while (pr) {

            String strOp = "";

            switch (opInt) {
                case 0:
                    strOp = "*";
                    break;

                case 1:
                    strOp = "/";
                    break;

                case 2:
                    strOp = "+";
                    break;

                case 3:
                    strOp = "-";
                    break;

                case 4:
                    pr = false;
                    break;
            }

            if (!pr)
                break;

            int pos = expression.replaceAll("\\s", "").indexOf(strOp);
            if (pos == -1) {
                opInt++;
                continue;
            }

            String[] splitNum = expression.split(" ");
            pos = OpPosition(splitNum, strOp);
            String op = splitNum[pos];
            Double d1 = Double.valueOf(splitNum[pos - 1]);
            Double d2 = Double.valueOf(splitNum[pos + 1]);
            Double r = Operation(d1, op, d2);

            System.out.println("D1: " + d1);
            System.out.println("D2: " + d2);
            System.out.println("R: " + r);

            StringJoiner joiner = new StringJoiner(" ", "", "");
            joiner.add(splitNum[pos - 1]);
            joiner.add(splitNum[pos]);
            joiner.add(splitNum[pos + 1]);

            expression = expression.replace(joiner.toString(), String.valueOf(r));
        }
        Double dd = Double.valueOf(expression);
        dd = dd*10e6/10e6;
        System.out.print("D:" + dd);

        return Double.valueOf(expression);
    }

    public static Double Operation(Double n1, String op, Double n2) {
        switch (op) {
            case "+":
                return n1 + n2;

            case "-":
                return n1 - n2;

            case "*":
                return n1 * n2;

            case "/":
                return n1 / n2;

            default:
                return 0.0;
        }
    }

    public static int OpPosition(String[] arr, String opStr){
        int pos = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(opStr)){
                pos = i;
                break;
            }
        }
          return pos;
    }
}
