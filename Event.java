/*
Name: Joseph Simonin
Course: COP-2805C-03597
Assignment: P2 - Inheritance
Date: 06/05/2025
Description: Write a Java Class named Event. he first class is Event. Events should at a minimum have a date, start and end time, location name, location address, event
name, number of guests, point of contact, and price. You may add additional attributes. Event should have a public toString() method.

AI Statement: AI was used as a learning assistant while building this Event class. Mainly used to ensure properly built constructors. 20% AI, 80% me
*/


public class Event {

// Private Variables
    private String eventDate;  // date of the event
    private String startTime; // start time of the event
    private String endTime; // end time of the event
    private String locationName; // location name of the event
    private String locationAddress; // location address of the event
    private String eventName; // Name of the event
    private int numberOfGuests; // number of guest attending the event
    private String pointOfContact; // name and number of event host
    private double price; // cost of event

// Constructor Method for no-arg constructor 
    public Event() {

    }

// Constructor Mehtod for new event 
    public Event(String eventDate, String startTime, String endTime, String locationName,
                 String locationAddress, String eventName, int numberOfGuests, String pointOfContact,
                 double price ) {
        this.eventDate = eventDate; // assigns date for event
        this.startTime = startTime; // assigns start time
        this.endTime = endTime; // assigns end time
        this.locationName = locationName; // assigns location name
        this.locationAddress = locationAddress; // assings location address
        this.eventName = eventName; // assigns name to event
        this.numberOfGuests = numberOfGuests; // assigns # of guests
        this.pointOfContact = pointOfContact; // assigns point of contact (host of event)
        this.price = price; // assigns price of event
    }

// Getter/Setter Method - eventDate
    public String getEventDate() { return eventDate; }
    public void setEventDate(String eventDate) { this.eventDate = eventDate; }

// Getter/Setter Method - startTime
    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }
    
// Getter/Setter Method - endTime
    public String getEndTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }
    
// Getter/Setter Method - locationName
    public String getLocationName() { return locationName; }
    public void setLocationName(String locationName) { this.locationName = locationName; }
    
// Getter/Setter Method - locationAddress
    public String getLocationAddress() { return locationAddress; }
    public void setLocationAddress(String locationAddress) { this.locationAddress = locationAddress; }
    
// Getter/Setter Method - eventName
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }
    
// Getter/Setter Method - numberOfGuests
    public int getNumberOfGuests() { return numberOfGuests; }
    public void setNumberOfGuests(int numberOfGuests) { this.numberOfGuests = numberOfGuests; }
    
// Getter/Setter Method - pointOfContact
    public String getPointOfContact() { return pointOfContact; }
    public void setPointOfContact(String pointOfContact) { this.pointOfContact = pointOfContact; }
    
// Getter/Setter Method - price
    public String getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
// Method - toString
   public String toString() {
    return  "***********************************" +
            "\nName: " + eventName +
            "\nDate: " + eventDate +
            "\nStart Time: " + startTime +
            "\nEnd Time: " + endTime +
            "\nPlace: " + locationName +
            "\nAddress: " + locationAddress +
            "\nExpected Guests: " + numberOfGuests + 
            "\nContact Info: " + pointOfContact +
            "\nPrice: $" + price;
   }
}
