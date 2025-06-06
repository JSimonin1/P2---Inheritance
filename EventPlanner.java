/*
Name: Joseph Simonin
Course: COP-2805C-03597
Assignment: P2 - Inheritance
Date: 06/05/2025
Description: Write a Java Class named EventPlanner. EventPlanner will include a runnable main() method.
When run, the program should print out the course, assignment, current date, and student name to the screen. Then prompt the user for the number of events to create. 
Then create an array of type Event sufficient to hold the number of events given by the user. For each item in the array, prompt the user for the event type, choosing
from the three types. Accept the user’s responses and create an object of that type and assign it to the array. After all user-supplied objects are created, loop through
the array and print out the event planning report showing the state of each event.

AI Statement: AI assistance was used to create this EventPlanner class. Mainly used to understand why certain logic in Scanner input was failing. 20% AI, 80% me
*/

import java.util.Scanner; 
import java.time.LocalDate; // newer method for date/time

public class EventPlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Student, Class Info
        System.out.println("Course: COP-2805C-03597 \nAssignment: P2-Inheritance \nCurrent Date:" + LocalDate.now() + "\nStudent Name: Joseph Simonin");

// User instructions variable for # of evetns to plan
        System.out.print("\nPlease enter the number of events to plan: ");
        int numberOfEvents = input.nextInt();
        input.nextLine(); // consume new line

// Events Array
        Event[] events = new Event[numberOfEvents];
        for (int i = 0; i < numberOfEvents; i ++) {
            System.out.print("\nSelect the Event type to plan: \n1)Event \n2)Birthday Party \n3)Quinceanera \nUser Response: ");
            int selection = input.nextInt();
            input.nextLine(); // consume new line

// User Q/A 
// User Input variables 
            System.out.print("\nEvent Name: ");
            String eventName = input.nextLine();
            System.out.print("Date: ");
            String eventDate = input.nextLine();
            System.out.print("Start Time: ");
            String startTime = input.nextLine();
            System.out.print("End Time: ");
            String endTime = input.nextLine();
            System.out.print("Location Name: ");
            String locationName = input.nextLine();
            System.out.print("Location Address: ");
            String locationAddress = input.nextLine();
            System.out.print("Number of Guests: ");
            int numberOfGuests = input.nextInt();
            input.nextLine(); // consumes new line
            System.out.print("Contact Info: ");
            String pointOfContact = input.nextLine();
            System.out.print("Price: $");
            double price = input.nextDouble();
            input.nextLine(); // consume new line 

// Switch Statements

// Event
            if (selection == 1) {
                events[i] = new Event(eventDate, startTime, endTime, locationName, locationAddress, eventName, numberOfGuests, pointOfContact, price);

// BirthdayParty    
            } else if (selection == 2) {
                System.out.print("Age: ");
                int age = input.nextInt();
                input.nextLine();
                System.out.print("What kind of Cake: ");
                String cake = input.nextLine();
                System.out.print("What kind of Candles: ");
                String candles = input.nextLine();
                System.out.print("What kind of Decorations: ");
                String decorations = input.nextLine();

                events[i] = new BirthdayParty(eventDate, startTime, endTime, locationName, locationAddress, eventName, numberOfGuests, pointOfContact, price,
                                             age, cake, candles, decorations);

// Quinceanera
            } else if (selection == 3) {
                int age = 15;
                System.out.print("What kind of Cake: ");
                String cake = input.nextLine();
                System.out.print("What kind of Candles: ");
                String candles = input.nextLine();
                System.out.print("What kind of Decorations: ");
                String decorations = input.nextLine();
                System.out.print("How many Maids of Honor: ");
                int numberMaidsOfHonor = input.nextInt();
                System.out.print("Number of Toasts: ");
                int numberOfToasts = input.nextInt();
                input.nextLine();
                System.out.print("Dance Music Style: ");
                String musicStyle = input.nextLine();

                events[i] = new Quinceanera(eventDate, startTime, endTime, locationName, locationAddress, eventName, numberOfGuests, pointOfContact, price, 
                                             age, cake, candles, decorations, numberMaidsOfHonor, numberOfToasts, musicStyle);

// Incorrect entry Catcher
            } else {
                System.out.println("Incorrect entry detected. Please try again.");
                i--; // incorrect entry re-prompter
            }
        }

// Planning Report PrintOut
        System.out.println("\n***********************************" +
                           "\n         EVENT INFORMATION         ");
        for (int i = 0; i < events.length; i ++) {
            System.out.println( events[i].toString());
        }
        System.out.println("***********************************" +
                            "\n       End EVENT INFORMATION       " + 
                            "\n***********************************");
    input.close();
    }
}
