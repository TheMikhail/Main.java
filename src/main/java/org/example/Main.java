package org.example;

import java.io.File;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.json.simple.JSONObject;

class CaseMenu {
    private final Scanner scanner;

    public CaseMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println("1. Добавление машины;");
        System.out.println("2. Просмотр таблицы;");
        System.out.println("3. Выход из приложения;");
    }


public class JsonParser{

        public Root parse() {
            try {
                ObjectMapper objectMapper = new ObjectMapper();

                File file = new File("src/main/resources/Car.json");


                Root root = objectMapper.readValue(file, Root.class);
                //System.out.println(root.auto1990.manual.gas.sedan.japanAuto.honda);

                JsonNode jsonNode = objectMapper.valueToTree(root);


                String key = jsonNode.fieldNames().next();
                //String value = jsonNode.get(key).asText();

               if (key != null) {

                    System.out.println(key);
                    //System.out.println(value);


                } else {
                    System.out.println("Ключ 'key' не найден в JSON.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
}
    public class JsonParserStruct2{
        public RootTest parse() {

            String fileName = "src/main/resources/CarTest.json";
            ObjectMapper objectMapper = new ObjectMapper();

           /* try {
                JsonNode jsonNode = objectMapper.readTree(new File(fileName));
                JsonNode jsonValues = jsonNode.get("Машины 1990-х годов");
               // System.out.println(jsonValues);

                JsonNode CarValues = jsonValues.get(0);
                String CarKeyMark = jsonValues.get(0).fieldNames().next();//марка
                String CarKeyMarket = jsonValues.get(1).fieldNames().next();//страна произоводитель
                String CarKeyBody = jsonValues.get(1).fieldNames().next();//тип кузова
                String CarKeyFuel = jsonValues.get(1).fieldNames().next();//тип топлива
                String CarKeyGearbox = jsonValues.get(1).fieldNames().next();//тип КПП
                // вывод ключа и значения по индексу указанному в get(0)
                System.out.println("1 машина: " + CarValues.get("Марка").asText());
                System.out.println("Ключ: " + CarKeyMark);

                // если мне нужно вывести конкретное значение объекта
                // System.out.println("First car mark: " + Car.get("mark").asText());
                // вывод элемента массива с номером указанным в get(0)
                // System.out.println("First car mark: " + Car.toString());


                ObjectNode objectNode = (ObjectNode) jsonNode;
                ArrayNode arrayNode = (ArrayNode) objectNode.get("Машины 1990-х годов");
                ObjectNode newObjectNode = objectMapper.createObjectNode();
                //добавление нового элемента в массив с ключом и значением
                newObjectNode.put(CarKeyMark, "newValue");
                newObjectNode.put(CarKeyMarket, "newValue2");
                arrayNode.add(newObjectNode);
                // вывод на консоль System.out.println(objectMapper.writeValueAsString(jsonNode));
                objectMapper.writeValue(new File(fileName),jsonNode);


                
            } catch (IOException e) {
                e.printStackTrace();
            }*/



            return null;
        }
    }

    public void start() throws IOException {

        JsonParser parser = new JsonParser();
        Root root = new Root();
        JsonParserStruct2 parserStruct2 = new JsonParserStruct2();

        CreateCar newcar = new CreateCar();

        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("Вы нажали 1");

                        // Map<String, Object> employee = objectMapper.readValue(file, new TypeReference<>(){});
                        newcar.newCar();
                        //parser.parse();

                        break;
                    case 2:
                        System.out.println("Вы нажали 2");

                        parserStruct2.parse();

                        break;
                    case 3:

                        System.out.println("Завершение программы...");
                        break;
                    default:

                        System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 3);
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {

        new CaseMenu(new Scanner(System.in)).start();


    }
}