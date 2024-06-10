/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cfa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Модель приложения CFA
 * @author oleg
 */
public class CFA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        MaterialSys matsys = new MaterialSys();
//        matsys.getMaterialList();
//        matsys.addMaterial("2 - Лист, медный - м2 - 345");
//        matsys.addMaterial("3 - Пельмени - кг - 100");
//        System.out.println(matsys.last_index);
        File file = new File("/home/oleg/NetBeansProjects/CFA/src/main/java/com/mycompany/cfa/database/products.txt");
        try
        {
            FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            breader.readLine();
            breader.readLine();
            String line = breader.readLine();
            Product product = new Product(line, matsys);
            System.out.println(product.getId());
            System.out.println(product.getName());
            System.out.println(product.quantity[1]);
        }
        catch(Exception ex)
        {
        
        }


    }
}
