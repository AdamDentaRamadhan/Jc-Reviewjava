package com.juaracoding;

public class Soalnomor1 {
    public static void main(String[] args) {
        pembahgian(100);

    }
    static void pembahgian(int a ){
        for (int i = 1; i <=a ; i++) {
            if(i % 5 ==0 && i%3 ==0){
                System.out.println("ab");
            }else if(i% 5 == 0){
                System.out.println("a");
            }else if(i%3 == 0){
                System.out.println("b");
            }else{
                System.out.println(i);
            }
        }
    }
}
