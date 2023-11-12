package lab6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class PromissoryNote {
    HashMap<String, Double> debts = new HashMap<>();
    public void setLoan(String toWhom, double value){
        this.debts.put(toWhom,value);
    }
    public double howMuchIsTheDebt(String whose) {
        for (String key : this.debts.keySet()) {
            if (key.equals(whose)){
                return this.debts.get(whose);
            }
        }
        return 0.0;
    }

}

class Main {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();

        // Store names and nicknames in the HashMap
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");

        String mattisNickname = nicknames.get("matti");
        System.out.println("Matti's nickname is: " + mattisNickname);
    }
}

class Dictionary{
    HashMap<String, String> map = new HashMap<>();
    public void add(String word, String translation){
        this.map.put(word, translation);
    }
    public String translate(String word){
        if (this.map.containsKey(word)){
            return this.map.get(word);}
        else return "null";
    }
    public int amountOfWords(){
        int num=0;
        for (String key : this.map.keySet()){
            num++;
        }
        return num;
    }
    public ArrayList<String> translationList(){
        ArrayList<String> translations = new ArrayList<>();
        for (String key : this.map.keySet()){
            translations.add(key + " = " + this.map.get(key));
        }
        return translations;
    }
}

class TextUserInterface{
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }


}