package task13a;

public class RegistrationOfHotelGuests {

    public static void main(String[] args) {

        HotelGuests guest1 = new HotelGuests("Angelika", "Rose");
        guest1.firstNameAndLastName();
        guest1.holidayDate("10/06/2024", "24/06/2024");
        guest1.typeOfRoom("With terrace");
        guest1.breakfastDeliveredToTheRoom("Yes");

        HotelGuests guest2 = new HotelGuests("Andy", "Collins");
        guest2.firstNameAndLastName();
        guest2.holidayDate("20/07/2024", "04/08/2024");
        guest2.typeOfRoom("With terrace");
        guest2.breakfastDeliveredToTheRoom("");

        HotelGuests guest3 = new HotelGuests("Mark", "Johnson");
        guest3.firstNameAndLastName();
        guest3.holidayDate("14/07/2024", "21/07/2024");
        guest3.typeOfRoom("");
        guest3.breakfastDeliveredToTheRoom("Yes");
    }
}
