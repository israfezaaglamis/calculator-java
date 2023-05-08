package org.example;

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                int number1,number2;
                int select;

                Scanner input = new Scanner(System.in);
                System.out.println("İşlem yapmak istediğiniz ilk sayıyı giriniz");
                number1 = input.nextInt();
                System.out.println("İşlem yapmak istediğiniz ikinci sayıyı giriniz");
                number2 = input.nextInt();

                System.out.println("Yapmak istediğiniz işlemi seçiniz;\n " +
                        "1- Toplama \n" +
                        "2- Çıkarma \n" +
                        "3- Bölme   \n" +
                        "4- Çarpma");

                select = input.nextInt();
                System.out.println("Seçtiğiniz işlem : "+ select);

                switch (select){
                    case 1:
                        System.out.println("Sonuç : "+ (number1 + number2));
                        break;
                    case 2:
                        System.out.println("Sonuç : "+ (number1 - number2));
                        break;
                    case 3:
                        System.out.println("Sonuç : "+ (number1 / number2));
                        break;
                    case 4:
                        System.out.println("Sonuç : "+ (number1 * number2));
                        break;
                    default:
                        System.out.println("Seçim yaparken listeye bağlı kalınız");
                }





            }
        }

