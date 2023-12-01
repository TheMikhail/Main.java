package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CreateCar {

    public class CaseMenu {
        private final Scanner scanner;

        public CaseMenu(Scanner scanner) {
            this.scanner = scanner;
        }

        private void printMenu() {
            System.out.println("1. Добавление машины;");
            System.out.println("2. Создание массива из чисел Фибоначчи;");
            System.out.println("3. Выход из приложения;");
        }

        public void start() {

            if (this.scanner != null) {
                int key;
                do {
                    printMenu();
                    System.out.print("Введите номер меню: ");
                    key = this.scanner.nextInt();
                    switch (key) {
                        case 1:

                            break;
                        case 2:

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
    public CreateCar newCar() throws IOException {
        Scanner in = new Scanner(System.in);
        String fileName = "src/main/resources/CarTest.json";
        ObjectMapper objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper.readTree(new File(fileName));
            JsonNode jsonValues = jsonNode.get("Машины 1990-х годов");

            JsonNode CarValue = jsonValues.get(0);
            Iterator<String> CarKey = CarValue.fieldNames();

            String CarKeyMark = CarKey.next();//марка
            String CarKeyMarket = CarKey.next();//страна произоводитель
            String CarKeyBody = CarKey.next();//тип кузова
            String CarKeyFuel = CarKey.next();//тип топлива
            String CarKeyGearbox = CarKey.next();//тип КПП


            ObjectNode objectNode = (ObjectNode) jsonNode;
            ArrayNode arrayNode = (ArrayNode) objectNode.get("Машины 1990-х годов");
            ObjectNode newObjectNode = objectMapper.createObjectNode();
            //добавление нового элемента в массив с ключом и значением
            //newObjectNode.put(CarKeyMark, "newValue");
            //newObjectNode.put(CarKeyMarket, "newValue2");
            arrayNode.add(newObjectNode);
            // вывод на консоль System.out.println(objectMapper.writeValueAsString(jsonNode));



            System.out.println("Введите марку машины");
            String carValueMark = in.nextLine();
            newObjectNode.put(CarKeyMark, carValueMark);
            objectMapper.writeValue(new File(fileName),jsonNode);

            System.out.println("Введите страну производитель машины");
            String carValueMarket = in.nextLine();
            newObjectNode.put(CarKeyMarket, carValueMarket);
            objectMapper.writeValue(new File(fileName),jsonNode);

            int keyBody;
                System.out.print("Выберите тип кузова машины: 1 - Если это седан, 2 - Если это микроавтобус, 3 - Если это купэ, 4 - Если это универсал ");
                keyBody = in.nextInt();
                switch (keyBody) {
                    case 1:
                        newObjectNode.put(CarKeyBody, "Седан");
                        objectMapper.writeValue(new File(fileName),jsonNode);
                        break;
                    case 2:

                        newObjectNode.put(CarKeyBody, "Микроавтобус");
                        objectMapper.writeValue(new File(fileName),jsonNode);
                        break;
                    case 3:
                        newObjectNode.put(CarKeyBody, "Купэ");
                        objectMapper.writeValue(new File(fileName),jsonNode);
                        break;
                    case 4:
                        newObjectNode.put(CarKeyBody, "Универсал");
                        objectMapper.writeValue(new File(fileName),jsonNode);
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                }


        int keyFuel;
            System.out.print("Выберите тип топлива машины: 1 - Если это бензин, 2 - Если это дизель ");
            keyFuel = in.nextInt();
            switch (keyFuel) {
                case 1:
                    newObjectNode.put(CarKeyFuel, "Бензин");
                    objectMapper.writeValue(new File(fileName),jsonNode);
                    break;
                case 2:

                    newObjectNode.put(CarKeyFuel, "Дизель");
                    objectMapper.writeValue(new File(fileName),jsonNode);
                    break;
                default:
                    System.out.println("Вы ввели неверное значение меню...\n");
            }



        int keyGearbox;
            System.out.print("Выберите тип коробки машины: 1 - Если это МКПП, 2 - Если это АКПП ");
            keyGearbox = in.nextInt();
            switch (keyGearbox) {
                case 1:
                    newObjectNode.put(CarKeyGearbox, "МКПП");
                    objectMapper.writeValue(new File(fileName),jsonNode);
                    break;
                case 2:

                    newObjectNode.put(CarKeyGearbox, "АКПП");
                    objectMapper.writeValue(new File(fileName),jsonNode);
                    break;
                default:
                    System.out.println("Вы ввели неверное значение меню...\n");
            }


        return null;
    }

}
