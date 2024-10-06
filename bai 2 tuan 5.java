/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.daonguoc;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Daonguoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi:");
        String s = sc.nextLine();
        String a = "";
        for(int i = s.length() -1 ;i>=0; i--){
            a +=s.charAt(i);
        }
        System.out.println(a);
    }
}
