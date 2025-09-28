package UserModels;

import java.util.List;
import java.util.ArrayList;
import Reservation.ReservationData;

/**
 *User class creates user objects to hold data of each user.
 */

public abstract class User {
    protected String name;
    protected String surname;
    protected String password;
    protected String birthDate;
    protected String email;
    protected String userType;
    private List<ReservationData> reservations = new ArrayList<>(); //To hold reservations of each user

    public User(String name, String surname, String password, String birthDate, String email, String userType) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.birthDate = birthDate;
        this.email = email;
        this.userType = userType;
    }



    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkPassword(String inputPassword) { //To check their password while they are logging in
        return password.equals(inputPassword);
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getUserType() {
        return userType;
    }

    public void addReservation(ReservationData reservation) { //To add reservation which user added to their reservation list
        reservations.add(reservation);
    }
    
    public void removeReservation(ReservationData reservation){ //To remove a reservation that user removed from their reservation list
        reservations.remove(reservation);
    }

    public List<ReservationData> getReservations() {
        return reservations;
    }
}