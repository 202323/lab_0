package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        if (value == null) {
            return new ArrayList<>();
        }
        ArrayList<String> resultArray = new ArrayList<>();
        for (int i = 0; i < value.length() + 1; i++) {
            resultArray.add(value.substring(i));
        }
        return resultArray;
    }
}