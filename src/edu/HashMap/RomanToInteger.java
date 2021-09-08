package edu.HashMap;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {



        public int romanToInt(String s) {

            Map<Character, Integer> reference = new HashMap<>();
            reference.put('I', 1);
            reference.put('V', 5);
            reference.put('X', 10);
            reference.put('L', 50);
            reference.put('C', 100);
            reference.put('D', 500);
            reference.put('M', 1000);

            if (s.length() < 1 || s.length() > 15) return 0;
            char[] ch = s.toCharArray();

            int result = 0;
            int lastDigit=0;
            int currentDigit=0;
            for (int i=ch.length-1;i>=0;i--) {

               currentDigit=reference.get(ch[i]);
                System.out.println("last digit "+lastDigit);
                if (currentDigit<lastDigit){
                    result-=currentDigit;

                }
                else {
                    result=currentDigit+result;
                }
                System.out.println("result is "+result);
                lastDigit = reference.get(ch[i]);
            }
                return result;
        }

}