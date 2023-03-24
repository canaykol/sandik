package com.can.sandik.service;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class Service {

    private CSVReader reader;
    public Service(){
        this.reader = new CSVReader(new FileReader("emps.csv"), ',');
    }

    public void read(){


    }


}
