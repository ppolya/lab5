package models;

import annotations.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Ticket {

    @GreaterThan(0)
    @Unique
    @AutoGenerated
    private int id;

    @NonNull
    @NonEmpty
    private String name;

    @NonNull
    private Coordinates coordinates;

    @NonNull
    @AutoGenerated
    private LocalDateTime creationDate;

    @GreaterThan(0)
    private int price;

    private TicketType type; //Поле может быть null
    private Venue venue; //Поле может быть null

    public Ticket(int id, String name, LocalDateTime creationDate, Coordinates coordinates, int price, TicketType type, Venue venue) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.price = price;
        this.type = type;
        this.venue = venue;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TicketType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", price=" + price +
                ", type=" + type +
                ", venue=" + venue +
                '}';
    }
}