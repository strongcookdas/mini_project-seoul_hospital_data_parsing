package parser;

import domain.Hospital;


public class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        str = str.replace("\"","");
        String[] splitted = str.split(",");
        return new Hospital(splitted[0],splitted[1],this.districtParse(splitted[1]),splitted[2],Integer.parseInt(splitted[6]),splitted[10],this.subdivisionParser(splitted[10]));
    }
    public String districtParse(String address){
        String[] splitted = address.split(" ");
        return splitted[0]+" "+splitted[1];
    }

    public String subdivisionParser(String name){
        String[] subdivisions = {"내과", "외과", "소아과", "피부과", "성형외과", "정형외과", "산부인과", "관절", "안과", "가정의학과", "비뇨기과", "치과"};
        for (String str: subdivisions) {
            if(name.contains(str))
                return str;
        }
        return null;
    }
}
