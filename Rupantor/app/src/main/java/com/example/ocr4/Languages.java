package com.example.ocr4;

public class Languages {

    private static String[] langsRU = {"Arabic","Bengali", "English", "Hindi","Indonesian", "Irish", "Italian", "Japanese", "Javanese", "Kannada"};
    private static String[] langCodesRU = {"ar", "bn", "en","hi","id", "ga", "it", "ja", "jv", "kn"};

    private static String[] langsEN = {"Arabic","Bengali", "English", "Hindi","Indonesian", "Irish", "Italian", "Japanese", "Javanese", "Kannada"};
    private static String[] langCodesEN = {"ar", "bn", "en","hi","id", "ga", "it", "ja", "jv", "kn"};
    public static String[] getLangsRU(){
        return langsRU;
    }

    public static String[] getLangsEN(){
        return langsEN;
    }

    public static String getLangCodeRU(int i){
        return langCodesRU[i];
    }

	public static String getLangCodeEN(int i){
        return langCodesEN[i];
    }    
};
