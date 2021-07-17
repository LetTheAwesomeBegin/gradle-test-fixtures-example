package com.pattycake.example.town;

import com.pattycake.example.Simpsons;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    
    @Test
    void getFirstName_givenBart_expectBartholomew() {
        // Fails: java.lang.NoClassDefFoundError: com/pattycake/example/Simpsons
        Assertions.assertThat(Simpsons.bart().getFirstName()).isEqualTo("Bartholomew");
    }

    @Test
    void getFirstName_givenBART_expectBartholomew() {
        // Fails: java.lang.NoClassDefFoundError: com/pattycake/example/Simpsons
        Assertions.assertThat(Simpsons.BART.getFirstName()).isEqualTo("Bartholomew");
    }

    @Test
    void getFirstName_givenBART_FIRST_NAME_expectBartholomew() {
        // Passes
        Assertions.assertThat(Simpsons.BART_FIRST_NAME).isEqualTo("Bartholomew");
    }

}
