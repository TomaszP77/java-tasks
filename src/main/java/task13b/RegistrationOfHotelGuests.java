package task13b;

public class RegistrationOfHotelGuests {

    public static void main(String[] args) {

        HotelGuests guest1 = new HotelGuests("Angelika", "Rose");
        guest1.setFirstDay("10/06/2024");
        guest1.setLastDay("24/06/2024");
        guest1.setTypeOfRoom("With terrace");
        guest1.setYesOrNot("Yes");

        HotelGuests guest2 = new HotelGuests("Andy", "Collins");
        guest2.setFirstDay("20/07/2024");
        guest2.setLastDay("04/08/2024");
        guest2.setTypeOfRoom("With terrace");
        guest2.setYesOrNot("");

        HotelGuests guest3 = new HotelGuests("Mark", "Johnson");
        guest3.setFirstDay("14/07/2024");
        guest3.setLastDay("21/07/2024");
        guest3.setTypeOfRoom("");
        guest3.setYesOrNot("Yes");

        HotelGuests guests[] = new HotelGuests[3];
        guests[0] = guest1;
        guests[1] = guest2;
        guests[2] = guest3;

        for (int i = 0; i < guests.length; i++) {
            guests[i].firstNameAndLastName();
            guests[i].holidayDate();
            guests[i].typeOfRoom();
            guests[i].breakfastDeliveredToTheRoom();
        }
    }
}
