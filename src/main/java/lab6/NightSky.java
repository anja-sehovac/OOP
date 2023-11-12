package lab6;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint=0;
    }

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();
        for (int i = 0; i < getWidth(); i++) {
            double n = random.nextDouble();
            if (n <= getDensity()) {
                System.out.print("*");
                starsInLastPrint++;
            }
        }
        System.out.println();
    }

    public void print(){
        this.starsInLastPrint=0;
        int h=getHeight();
        for (int i=0; i<h; i++){
            this.printLine();
        }
    }



}
