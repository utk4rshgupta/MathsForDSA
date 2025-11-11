package com.utkarsh;
public class appearsOnce {
    //given an array of integers every element appears twice except one find that number
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,2,3,1};
        int unique =0;
        for(int n :arr){
            unique ^=n;
        }
        System.out.println(unique);
}

}
