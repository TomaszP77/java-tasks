package task13c;

public class HotelGuests {

    private String firstName;
    private String lastName;
    private String firstDay;
    private String lastDay;
    private String typeOfRoom;
    private String yesOrNot;


    public HotelGuests(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public void setYesOrNot(String yesOrNot) {
        this.yesOrNot = yesOrNot;
    }

    public void firstNameAndLastName() {
        System.out.println(firstName + " " + lastName);
    }

    public void holidayDate() {
        System.out.println("First day" + " " + firstDay + " - " + "Last day" + " " + lastDay);
    }

    public void typeOfRoom() {
        if (typeOfRoom.equals("With terrace")) {
            System.out.println("Room number from 1 to 10");
        } else if (typeOfRoom.equals("Without terrace ")) {
            System.out.println("Room number from 11 to 20");
        } else {
            System.out.println("Enter the value: With terrace or Without terrace");
        }
    }

    public void breakfastDeliveredToTheRoom() {
        if (yesOrNot.equals("Yes")) {
            System.out.println("Breakfast delivered to the room option");
        } else if (yesOrNot.equals("No")) {
            System.out.println("Standard breakfast in the restaurant");
        } else {
            System.out.println("Enter a value: Yes or No");
        }
    }
}
