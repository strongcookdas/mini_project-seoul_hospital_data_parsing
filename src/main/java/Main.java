import domain.Hospital;
import fileIO.LineReader;
import parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args)throws IOException {
        LineReader<Hospital> lr = new LineReader<>(new HospitalParser());
        List<Hospital> list = lr.readLines("./seoul_hospital.csv");
        for (Hospital hospital:list) {
            System.out.println(hospital.toString());
        }
    }
}
