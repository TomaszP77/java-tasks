package task13;

public class HotelGuests {

    public void firstNameAndLastName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    public void holidayDate(String firstDay, String lastDay) {
        System.out.println("First day" + " " + firstDay + " - " + "Last day" + " " + lastDay);
    }

    public void typeOfRoom(String typeOfRoom) {
        if (typeOfRoom.equals("With terrace")) {
            System.out.println("Room number from 1 to 10");
        } else if (typeOfRoom.equals("Without terrace ")) {
            System.out.println("Room number from 11 to 20");
        } else {
            System.out.println("Enter the value: With terrace or Without terrace");
        }
    }

    public void breakfastDeliveredToTheRoom(String yesOrNot) {
        if (yesOrNot.equals("Yes")) {
            System.out.println("Breakfast delivered to the room option");
        } else if (yesOrNot.equals("No")) {
            System.out.println("Standard breakfast in the restaurant");
        } else {
            System.out.println("Enter a value: Yes or No");
        }
    }
}
