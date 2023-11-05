package lab5;

import java.util.ArrayList;

public class Boxes {
    interface ToBeStored{
        double weight();
    }
    class Book implements ToBeStored{
        private String writer;
        private String name;
        private double weight;

        public Book(String writer, String name, double weight) {
            this.writer = writer;
            this.name = name;
            this.weight = weight;
        }

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double weight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString(){
            return (getWriter()+": "+getName());
        }
    }

    class CD implements ToBeStored{
        private String artist;
        private String title;
        private int year;
        private double weight;

        public CD(String artist, String title, int year) {
            this.artist = artist;
            this.title = title;
            this.year = year;
            this.weight=0.1;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double weight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
        @Override
        public String toString(){
            return (getArtist()+": "+getTitle()+" ("+getYear()+")");
        }
    }

    class Box implements ToBeStored{
        private double maxWeight;
        private ArrayList<ToBeStored> things;

        public Box(double maxWeight) {

            this.maxWeight = maxWeight;
            this.things= new ArrayList<ToBeStored>();
        }

        public void setThings(ArrayList<ToBeStored> things){
            this.things = things;
        }

        public ArrayList<ToBeStored> getThings(){
            return this.things;
        }

        @Override
        public double weight() {
            double currentWeight = 0;
            for (ToBeStored item : this.things){
                currentWeight += item.weight();
            }
            return currentWeight;
        }

        public void add(ToBeStored thing){
            if ((this.weight() + thing.weight()) <= this.maxWeight){
                this.things.add(thing);
            }
        }

        @Override
        public String toString(){
            return "Box: " + this.things.size() + " things, total weight: " + this.weight() + " kg";
        }
    }
}
