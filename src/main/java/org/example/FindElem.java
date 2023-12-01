package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class FindElem {

    String fileName = "src/main/resources/CarTest.json";
    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode;

    {
        try {

            jsonNode = objectMapper.readTree(new File(fileName));



        }
        catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public void suggestive_questions(){



    }
}
