package com.company.pr10_task_3;

interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen();
}

class TextDocumentFactory implements ICreateDocument {
    @Override
    public IDocument createNew() {
        File textDocumentFactory = new TextDocumentOperationsFactory();

        return new TextDocument(textDocumentFactory);
    }

    @Override
    public IDocument createOpen() {
        File textDocumentFactory = new TextDocumentOperationsFactory();

        return new TextDocument(textDocumentFactory);
    }
}

class ImageDocumentFactory implements ICreateDocument {
    @Override
    public IDocument createNew() {
        File imageDocumentFactory = new ImageDocumentOperationsFactory();

        return new ImageDocument(imageDocumentFactory);
    }

    @Override
    public IDocument createOpen() {
        File imageDocumentFactory = new ImageDocumentOperationsFactory();

        return new ImageDocument(imageDocumentFactory);
    }
}

class MusicDocumentFactory implements ICreateDocument {
    @Override
    public IDocument createNew() {
        File musicDocumentFactory = new MusicDocumentOperationsFactory();

        return new MusicDocument(musicDocumentFactory);
    }

    @Override
    public IDocument createOpen() {
        File musicDocumentFactory = new MusicDocumentOperationsFactory();

        return new MusicDocument(musicDocumentFactory);
    }
}

class TextDocumentOperationsFactory implements File {
    @Override
    public New_ operationNew() {
        return new TextNew_();
    }

    @Override
    public Open operationOpen() {
        return new TextOpen();
    }

    @Override
    public Save operationSave() {
        return new TextSave();
    }

    @Override
    public Exit operationExit() {
        return new TextExit();
    }
}

class ImageDocumentOperationsFactory implements File {
    @Override
    public New_ operationNew() {
        return new ImageNew_();
    }

    @Override
    public Open operationOpen() {
        return new ImageOpen();
    }

    @Override
    public Save operationSave() {
        return new ImageSave();
    }

    @Override
    public Exit operationExit() {
        return new ImageExit();
    }
}

class MusicDocumentOperationsFactory implements File {
    @Override
    public New_ operationNew() {
        return new MusicNew_();
    }

    @Override
    public Open operationOpen() {
        return new MusicOpen();
    }

    @Override
    public Save operationSave() {
        return new MusicSave();
    }

    @Override
    public Exit operationExit() {
        return new MusicExit();
    }
}