package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Payroll {

    public static void main(String[] args) {
        String fileName = "employees.csv";

        try{
            BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = bufferReader.readLine()) != null){
                String[] tokens = line.split("\\|");


            }
        }catch(Exception ex){

        }

    }
}
