package com.company.pr10_task_3;

public class Test {
    public static void main(String[] args) {
        IDocument iDocument;
        ICreateDocument iCreateDocument = new TextDocumentFactory();

        System.out.println("Создадим текстовый документ");

        iDocument = iCreateDocument.createNew();
        System.out.println(iDocument.getDescription());
        System.out.println();

        iCreateDocument = new MusicDocumentFactory();
        System.out.println("Создадим аудио документ");

        iDocument = iCreateDocument.createOpen();
        System.out.println(iDocument.getDescription());
        System.out.println();

        iCreateDocument = new ImageDocumentFactory();
        System.out.println("Создадим изображение");

        iDocument = iCreateDocument.createOpen();
        System.out.println(iDocument.getDescription());
    }
}