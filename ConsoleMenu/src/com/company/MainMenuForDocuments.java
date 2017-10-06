package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Дмитрий on 03.10.2017.
 */
public class MainMenuForDocuments {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
       System.out.println(" Введите сколько документов вы хотите создать: ");
        int sizeArray = scanner.nextInt();
        Document arrayDocuments [] = new Document[sizeArray];
        Document document [] = new Document[sizeArray];
        DocumentWithObjects documentWithObjects = new DocumentWithObjects();
        while (true){
           Menu.showObjectDocumentMenu();
            int command = scanner.nextInt();
            switch (command){
                case 1: { documentWithObjects.showDocumentsName(document);  } break;
                case 2: { documentWithObjects.createDocument(arrayDocuments, document); } break;
                case 3:{ int numberDeleteDocument = scanner.nextInt();
                    documentWithObjects.deleteDocument(document, numberDeleteDocument); } break;
                case 4: {
                    int numberDoc = scanner.nextInt();
                    Main.DocumentWork(document[numberDoc]);}break;
                case 5: { System.exit(0); }
            }
        }
        // меню должно позволять работать с отдельным документом
    }
}