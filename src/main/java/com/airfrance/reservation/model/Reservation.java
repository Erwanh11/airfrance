package com.airfrance.reservation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String ticketReference;

    @NotBlank
    private String passengerName;

    @NotNull
    private LocalDateTime departureDateTime;

    @NotBlank
    private String departureCity;

    @NotBlank
    private String arrivalCity;


    public Reservation() {
    }

    public Reservation(String ticketReference, String passengerName, LocalDateTime departureDateTime, String departureCity, String arrivalCity) {
        this.ticketReference = ticketReference;
        this.passengerName = passengerName;
        this.departureDateTime = departureDateTime;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketReference() {
        return ticketReference;
    }

    public void setTicketReference(String ticketReference) {
        this.ticketReference = ticketReference;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", ticketReference='" + ticketReference + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", departureDateTime=" + departureDateTime +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                '}';
    }
}
