package task13;

public class RegistrationOfHotelGuests {

    public static void main(String[] args) {

        HotelGuests guest1 = new HotelGuests();
        guest1.firstNameAndLastName("Angelika", "Rose");
        guest1.holidayDate("10/06/2024", "24/06/2024");
        guest1.typeOfRoom("With terrace");
        guest1.breakfastDeliveredToTheRoom("Yes");

        HotelGuests guest2 = new HotelGuests();
        guest1.firstNameAndLastName("Andy", "Collins");
        guest1.holidayDate("20/07/2024", "04/08/2024");
        guest1.typeOfRoom("With terrace");
        guest1.breakfastDeliveredToTheRoom("");

        HotelGuests guest3 = new HotelGuests();
        guest1.firstNameAndLastName("Mark", "Johnson");
        guest1.holidayDate("14/07/2024", "21/07/2024");
        guest1.typeOfRoom("");
        guest1.breakfastDeliveredToTheRoom("Yes");
    }
}
