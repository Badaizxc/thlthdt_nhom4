/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tinhgiaithua;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tinhgiaithua {

    public static void main(String[] args) {
        int n ;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap n ");
        n = sc.nextInt();
        giaithua(n);
               
    }
    public static void giaithua(int n){
        int  ketqua = 1;
        for(int i=1;i <= n ; i++)
            ketqua = ketqua * i;
        System.out.println("giai thua la:"+ ketqua);
    }
}
