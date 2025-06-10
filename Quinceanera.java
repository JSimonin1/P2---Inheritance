/*
Name: Joseph Simonin
Course: COP-2805C-03597
Assignment: P2 - Inheritance
Date: 06/05/2025
Description: Write a Java Class named Quinceañera (you may replace the ñ with an English n for purposes of the program). A Quinceañera is a specific type of 
BirthdayParty. The age should be immutably set to 15. Additional attributes will include number of maids of honor, number of toasts performed, and choice of dance music.
Quinceañera should override the parent's toString() method. A Quinceañera is-a BirthdayParty. 

AI Statement: No AI was used in the creation of this Quinceanera class due to previous help in BirthdayParty class.
*/


public class Quinceanera extends BirthdayParty {

// Private Variables
    private int numberMaidsOfHonor;
    private int numberOfToasts;
    private String musicStyle;

// Constructor Method for Quinceanera
    public Quinceanera(String eventDate, String startTime, String endTime, String locationName,
                       String locationAddress, String eventName, int numberOfGuests, String pointOfContact,
                       double price, int age, String cake, String candles, String decorations, 
                       int numberMaidsOfHonor, int numberOfToasts, String musicStyle) {
                                                                                                                            // immutable age of 15 for Quinceanera
        super(eventDate, startTime, endTime, locationName, locationAddress, eventName, numberOfGuests, pointOfContact, price, 15, cake, candles, decorations);
        this.numberMaidsOfHonor = numberMaidsOfHonor;
        this.numberOfToasts = numberOfToasts;
        this.musicStyle = musicStyle;
    }

// Getter/Setter Method - numberMaidsOfHonor
    public int getNumberMaidsOfHonor() { return numberMaidsOfHonor; }
    public void setNumberMaidsOfHonor(int numberMaidsOfHonor) { this.numberMaidsOfHonor = numberMaidsOfHonor; }

// Getter Method - numberOfToasts
    public int getNumberOfToasts() { return numberMaidsOfHonor; }
    public void setNumberOfToasts(int numberOfToasts) { this.numberOfToasts = numberOfToasts; }

// Getter/Setter Method - musicStyle
    public String getMusicStyle() { return musicStyle; }
    public void setMusicStyle(String musicStyle) { this.musicStyle = musicStyle; }

// Method - toString
    public String toString() {
        return super.toString() +
                "\nMaids of honor: " + numberMaidsOfHonor + 
                "\nToasts Performed: " + numberOfToasts + 
                "\nMusic: " + musicStyle;
    }
    
}