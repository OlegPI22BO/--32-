/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cfa;

/**
 *
 * @author oleg
 */
public class Material {
    int id;
    String name;
    String measure; //мера
    float cost;
    
    public Material()
    {
        
    }
    
    public Material(int id, String name, String measure, float cost)
    {
        this.id = id;
        this.name = name;
        this.measure = measure;
        this.cost = cost;
    }
    
    public Material(String line)
    {
        //"2 | Лист, медный | м2 | 345"
        
        String[] line_ar = line.split(" - ");
        this.id = Integer.valueOf(line_ar[0]);
        this.name = line_ar[1];
        this.measure = line_ar[2];
        this.cost = Float.valueOf(line_ar[3]);
    }

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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    
    
    
}
