package com.can.sandik.service;

import com.can.sandik.mapper.ConstituencyFieldSetMapper;
import com.can.sandik.model.Constituency;
import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import jakarta.annotation.Resource;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.FileSystemResource;

public class Service {

    private CSVReader reader;
    public Service(){
        Resource resource = (Resource) new FileSystemResource("resources/election.csv");

        FlatFileItemReader<Constituency> itemReader = new FlatFileItemReader<>();
        itemReader.setResource(new FileSystemResource("resources/players.csv"));
        DefaultLineMapper<Constituency> lineMapper = new DefaultLineMapper<>();
//DelimitedLineTokenizer defaults to comma as its delimiter
        lineMapper.setLineTokenizer(new DelimitedLineTokenizer());
        lineMapper.setFieldSetMapper(new ConstituencyFieldSetMapper());
        itemReader.setLineMapper(lineMapper);
        itemReader.open(new ExecutionContext());
        try{
            Object c = itemReader.read();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public void read(){


    }


}
