package dz8;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i<50; i++) {
            System.out.println(genStr((int)(Math.random()*20 + 5)));
        }
    }

    public static String genStr(int len){
        String res = "";
        final char[] masChar = "ABCDabcd".toCharArray();
        for (int i = 0; i<len; i++){
            char t = masChar[(int)(Math.random()* masChar.length)];
            res = res + String.valueOf(t);
        }
        return res;
    }
}

