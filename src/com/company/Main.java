package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type: ");
        String type = scanner.nextLine();
        String number = randomString(type);
        orderArray(number, "Asc");
    }

    public static String randomString(String typeText){
        String numbers = "0123456789";
        String randomText = "";
        for (int i=0; i<numbers.length(); i++){
            int randomIndex = randomPosition(0, numbers.length()-1);
            randomText += String.valueOf(numbers.charAt(randomIndex));
        }
        return typeString(typeText, randomText);
    }

    public static int randomPosition(int min, int max){
        return (int) Math.floor(Math.random()*(max-min+1)+min);
    }

    public static String typeString(String typeText, String randomText){
        if (typeText.equals("TipoA")){
            randomText = "54" + randomText;
        }else if(typeText.equals("TipoB")){
            randomText = "08" + randomText;
        }
        return randomText;
    }

    public static void orderArray(String number, String order){
        String[] stringNumbers = number.split("");
        int[] intNumbers = new int[stringNumbers.length];

        for (int i=0; i< stringNumbers.length; i++){
            intNumbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        if (order.equals("Asc")){
            sortAsc(intNumbers);
        }else if(order.equals("Desc")){
            sortDesc(intNumbers);
        }
    }

        public static void sortAsc(int[] array){
            int aux;
            for (int i=0; i<array.length; i++){
                for(int j=0; j< array.length; j++){
                    if(array[j] > array[j+1]){
                        aux = array[j];
                        array[j] = array[j+1];
                        array[j+1] = aux;
                    }
                }
            }
            for (int i=0; i<array.length; i++){
                System.out.print(array[i]+ " ");
            }
        }

        public static void sortDesc(int[] array){
        int aux;
            for (int i=0; i<array.length; i++){
                for(int j=0; j< array.length; j++){
                    if(array[j] < array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                    }
                }
            }
            for (int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
            }
        }
}


