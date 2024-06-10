/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cfa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



/**
 *Система работы с материалами: модель для работы со списком материалов предприятия
 * Обрабатывает все действия с объектом "Материал" и файлом материалов
 * @author oleg
 */
public class MaterialSys {
    
    ArrayList<Material> materials;
    int last_index;
    
    public MaterialSys()
    {
    
    }
    
    private void initializeMaterials()
    {
        
    }
    
    private void addMonths()
    {
        
    }
    
    private String getLastIndex()
    {
        return String.valueOf(last_index);
    }
    
    public void addMaterial(String line)
    {
        File file = new File("/home/oleg/NetBeansProjects/CFA/src/main/java/com/mycompany/cfa/database/materials.txt");
        Material material = new Material(line);
        try
        {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bwriter = new BufferedWriter(writer);
            bwriter.newLine();
            bwriter.write(this.last_index + " - " + material.getName() + " - " + material.getMeasure() + " - " + material.getCost());
            this.last_index++;
            bwriter.close();
            writer.close();
        }
        catch(IOException ex)
        {
            System.out.println("Ошибка! Файл не найден!");
        }
        catch(Exception ex)
        {
            System.out.println("Произошла непредвиденная ошибка!");
        }
        
    }
    
    public Material getById(int id)
    {
        String line;
        String[] line_ar;
        File file = new File("../com.mycompany.cfa.database/materials.txt");
        
        try
        {
            
            FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            breader.readLine();
            breader.readLine();
            while ((line = breader.readLine()) != null)
            {
                line_ar = line.split(" | ");
                if (Integer.valueOf(line_ar[0]) == id)
                {
                    breader.close();
                    reader.close();
                    return new Material(line);
                }
            }
            throw new Exception("ID not found");
            
        
        
        }
        catch (Exception ex)
        {
            System.out.println("Произошла ошибка!");
            System.out.println(ex.toString());
        }
        
        return new Material();
    }
    
    public void getMaterialList()
    {
        ArrayList<Material> materials = new ArrayList<>();
        int count = 0;
        
        File file = new File("/home/oleg/NetBeansProjects/CFA/src/main/java/com/mycompany/cfa/database/materials.txt");
        String line;
        
        try
        {
            
            FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            breader.readLine();
            breader.readLine();
            while ((line = breader.readLine()) != null)
            {
                Material material = new Material(line);
                materials.add(material);
                count = material.getId() + 1;
            }
            
            this.materials = materials;
            this.last_index = count;       
        
        }
        catch (IOException ex)
        {
            System.out.println("Файл материалов не обнаружен!");
        }
        
        catch (Exception ex)
        {
            System.out.println("Произошла ошибка!");
            System.out.println(ex.toString());
        }
        
    }
}
