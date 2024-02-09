package task13c;

import task13b.HotelGuests;

import java.util.ArrayList;
import java.util.List;

public class RegistrationOfHotelGuests {

    public static void main(String[] args) {

        HotelGuests guest1 = new task13b.HotelGuests("Angelika", "Rose");
        guest1.setFirstDay("10/06/2024");
        guest1.setLastDay("24/06/2024");
        guest1.setTypeOfRoom("With terrace");
        guest1.setYesOrNot("Yes");

        HotelGuests guest2 = new task13b.HotelGuests("Andy", "Collins");
        guest2.setFirstDay("20/07/2024");
        guest2.setLastDay("04/08/2024");
        guest2.setTypeOfRoom("With terrace");
        guest2.setYesOrNot("");

        HotelGuests guest3 = new task13b.HotelGuests("Mark", "Johnson");
        guest3.setFirstDay("14/07/2024");
        guest3.setLastDay("21/07/2024");
        guest3.setTypeOfRoom("");
        guest3.setYesOrNot("Yes");

        List<HotelGuests> guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);

        for (int i = 0; i < guests.size(); i++) {
            guests.get(i).firstNameAndLastName();
            guests.get(i).holidayDate();
            guests.get(i).typeOfRoom();
            guests.get(i).breakfastDeliveredToTheRoom();
        }

        for (HotelGuests guestsInfo : guests) {
            guestsInfo.firstNameAndLastName();
            guestsInfo.holidayDate();
            guestsInfo.typeOfRoom();
            guestsInfo.breakfastDeliveredToTheRoom();
        }
    }
}
