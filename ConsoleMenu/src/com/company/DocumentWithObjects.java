package com.company;
/**
 * Created by Дмитрий on 03.10.2017.
 */

import java.util.Scanner;
public class DocumentWithObjects {
   static int count = 0;
    String nameDocument = "Name document";
    void showDocumentsName(Document document[]){
        for (int i = 0; i < document.length ; i++ ){
           String lineToOut =  document[i] == null ? "____" : "№" + (i + 1) + " " + nameDocument;
           System.out.println(i + ": " + lineToOut);
        }
    }
    void createDocument(Document  document [], Document  document2 []){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < document2.length; i++) {
            if (count >= document2.length) {
                System.err.println("Нет места");
                break;
            }
            if (document2[i] == null && count < document2.length) {
                nameDocument = scanner.next();
                document[i] = new Document();
                document2[i] = document[i];
                count++;
                break;
            }
        }
    }
    void deleteDocument(Document document [], int numberDocument){
        for (int i = 0; i< document.length; i++){
            document[numberDocument + i] = document[ numberDocument + i + 1];
        }
        document[document.length - 1] = null;
        count --;
    }

}