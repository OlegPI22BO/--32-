/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cfa;

import java.util.ArrayList;

/**
 * id - Наименование - Мера - Цех - Участок - Материал + Кол-во ...
 * @author oleg
 */
public class Product {
    int id;
    String name;
    String measure;
    int manufactory_ind;
    int site_ind;
    int[] materials_id;
    float[] quantity;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public int[] getMaterials() {
        return materials_id;
    }

    public void setMaterials(int[] materials) {
        this.materials_id = materials;
    }

    public float[] getQuantity() {
        return quantity;
    }

    public void setQuantity(float[] quantity) {
        this.quantity = quantity;
    }

    public int getManufactory_ind() {
        return manufactory_ind;
    }

    public void setManufactory_ind(int manufactory_ind) {
        this.manufactory_ind = manufactory_ind;
    }

    public int getSite_ind() {
        return site_ind;
    }

    public void setSite_ind(int site_ind) {
        this.site_ind = site_ind;
    }
    
    
    /**
     * Переводит строку из файла в объект "Продукт"
     * @param line Строка файла "products"
     * @param matsys Система работы с материалами
     */
    public Product(String line, MaterialSys matsys)
    {
        String[] line_ar;
        
        line_ar = line.split(" - ");
        this.id = Integer.valueOf(line_ar[0]);
        this.name = line_ar[1];
        this.measure = line_ar[2];
        this.manufactory_ind = Integer.valueOf(line_ar[3]);
        this.site_ind = Integer.valueOf(line_ar[4]);
        
        int count_materials = line_ar.length - 5; //Потому что у нас пять элементов до начала перечисления материалов
        this.materials_id = new int[count_materials / 2];
        this.quantity = new float[count_materials / 2];
        int ind = 0;
                
        for (int i = 5; i < line_ar.length; i = i + 2)
        {
            this.materials_id[ind] = Integer.valueOf(line_ar[i]);
            this.quantity[ind] = Float.valueOf(line_ar[i+1]);
            ind++;
        }
    }

    public Product(int id, String name, String measure, int manufactory_ind, int site_ind, int[] materials_id, float[] quantity) {
        this.id = id;
        this.name = name;
        this.measure = measure;
        this.manufactory_ind = manufactory_ind;
        this.site_ind = site_ind;
        this.materials_id = materials_id;
        this.quantity = quantity;
    }
    
    
    
}
