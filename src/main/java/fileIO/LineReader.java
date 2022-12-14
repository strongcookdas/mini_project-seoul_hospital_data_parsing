package fileIO;

import domain.Hospital;
import parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T>{
    Parser<T> parser;
    boolean isRemoveColumnName = true;

    public LineReader(Parser parser){
        this.parser=parser;
    }

    public List<T> readLines(String filename)throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        List<T>result = new ArrayList<>();
        String str;
        if(isRemoveColumnName){
            br.readLine();
        }
        while((str=br.readLine())!=null){
            result.add(parser.parse(str));
        }
        return result;
    }
}
