package com.pattycake.example;

import java.util.Arrays;
import java.util.List;

public class Simpsons {
    public static final Person HOMER = new Person("Homer", "Simpson");
    public static final Person MARGE = new Person("Marjorie", "Simpson");
    public static final Person BART = new Person("Bartholomew", "Simpson");
    public static final Person LISA = new Person("Elisabeth Marie", "Simpson");
    public static final Person MAGGIE = new Person("Margaret Eve", "Simpson");
    public static final String BART_FIRST_NAME = "Bartholomew";
    
    private static final List<Person> FAMILY = Arrays.asList(
        HOMER,
        MARGE,
        BART,
        LISA,
        MAGGIE
    );

    public static Person homer() { return HOMER; }

    public static Person marge() { return MARGE; }

    public static Person bart() { return BART; }

    public static Person lisa() { return LISA; }

    public static Person maggie() { return MAGGIE; }

    public static List<Person> getFamily() {
        return FAMILY;
    }
    
}
