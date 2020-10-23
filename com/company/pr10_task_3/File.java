package com.company.pr10_task_3;

public interface File {
    New_ operationNew();
    Open operationOpen();
    Save operationSave();
    Exit operationExit();
}

interface New_{
    String toString();
}

class TextNew_ implements New_{
    @Override
    public String toString() {
        return "new Text File";
    }
}

class ImageNew_ implements New_{
    @Override
    public String toString() {
        return "new Image File";
    }
}

class MusicNew_ implements New_{
    @Override
    public String toString() {
        return "new Music File";
    }
}

interface Open{
    String toString();
}

class TextOpen implements Open{
    @Override
    public String toString() {
        return "open Text File";
    }
}

class ImageOpen implements Open{
    @Override
    public String toString() {
        return "open Image File";
    }
}

class MusicOpen implements Open{
    @Override
    public String toString() {
        return "open Music File";
    }
}

interface Save{
    String toString();
}

class TextSave implements Save{
    @Override
    public String toString() {
        return "new Text File";
    }
}

class ImageSave implements Save{
    @Override
    public String toString() {
        return "new Image File";
    }
}

class MusicSave implements Save{
    @Override
    public String toString() {
        return "new Music File";
    }
}

interface Exit{
    String toString();
}

class TextExit implements Exit{
    @Override
    public String toString() {
        return "new Text File";
    }
}

class ImageExit implements Exit{
    @Override
    public String toString() {
        return "new Image File";
    }
}

class MusicExit implements Exit{
    @Override
    public String toString() {
        return "new Music File";
    }
}