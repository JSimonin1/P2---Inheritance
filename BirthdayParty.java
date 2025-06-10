/*
Name: Joseph Simonin
Course: COP-2805C-03597
Assignment: P2 - Inheritance
Date: 06/05/2025
Description: Write a Java Class named BirthdayParty. A BirthdayParty is-a Event, but should also include appropriate attributes and methods for age, cake, candles, and
decorations. BirthdayParty should override the parent's toString() method.

AI Statement: AI was used as a learning assistant while building this BirthdayParty class. Mainly used to ensure properly called parent constructor using super().
20% AI, 80% me
*/


public class BirthdayParty extends Event {

// Private Variables
    private int age;
    private String cake;
    private String candles;
    private String decorations;

// Constructor Method for BirthdayParty
    public BirthdayParty(String eventDate, String startTime, String endTime, String locationName,
                 String locationAddress, String eventName, int numberOfGuests, String pointOfContact,
                 double price, int age, String cake, String candles, String decorations) {
        super(eventDate, startTime, endTime, locationName, locationAddress, eventName, numberOfGuests, pointOfContact, price);
        this.age = age;
        this.cake = cake;
        this.candles = candles;
        this.decorations = decorations;
    }

// Getter/Setter Method - age
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

// Getter/Setter Method - cake
    public String getCake() { return cake; }
    public void setCake(String cake) { this.cake = cake; }

// Getter/Setter Method - candles
    public String getCandles() { return candles; }
    public void setCandles(String candles) { this.candles = candles; }
    
// Getter/Setter Method - decorations
    public String getDecorations() { return decorations; }
    public void setDecorations(String decorations) { this.decorations = decorations; }

// Method - toString
    public String toString() {
        return super.toString() + 
               "\nAge: " + age +
               "\nCake: " + cake +
               "\nCandles: " + candles +
               "\nDecorations: " + decorations;
    }
}
