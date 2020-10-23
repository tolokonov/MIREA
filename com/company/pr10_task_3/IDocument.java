package com.company.pr10_task_3;

abstract class IDocument {
    New_ new_;
    Open open;
    Save save;
    Exit exit;

    public abstract String getDescription();

    public String toString() {
        return "New_: " + new_.toString() + "\n"
                + "Open: " + open.toString() + "\n"
                + "Save: " + save.toString() + "\n"
                + "Exit: " + exit.toString();
    }
}

class TextDocument extends IDocument{
    TextDocument(File textDocumentFactory) {
        new_ = textDocumentFactory.operationNew();
        open = textDocumentFactory.operationOpen();
        save = textDocumentFactory.operationSave();
        exit = textDocumentFactory.operationExit();
    }

    @Override
    public String getDescription() {
        return "It is a text document\n" + super.toString();
    }
}

class ImageDocument extends IDocument{
    ImageDocument(File textDocumentFactory) {
        new_ = textDocumentFactory.operationNew();
        open = textDocumentFactory.operationOpen();
        save = textDocumentFactory.operationSave();
        exit = textDocumentFactory.operationExit();
    }

    @Override
    public String getDescription() {
        return "It is an image document\n" + super.toString();
    }
}

class MusicDocument extends IDocument{
    MusicDocument(File textDocumentFactory) {
        new_ = textDocumentFactory.operationNew();
        open = textDocumentFactory.operationOpen();
        save = textDocumentFactory.operationSave();
        exit = textDocumentFactory.operationExit();
    }

    @Override
    public String getDescription() {
        return "It is a music document\n" + super.toString();
    }
}