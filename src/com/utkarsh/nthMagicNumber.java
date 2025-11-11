package com.utkarsh;

public class nthMagicNumber {
    public static void main(String[] args) {
        // Magic number is binary digits to the power of 5
        int n =6;
        int ans =0;
        int base =5;
        while(n>0){
            int last = (n&1);
            n = n>>1;
            ans+=last*base;
            base*=base;
        }
        System.out.println(ans);
    }
}
