package com.example.jpaTutorial.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String team;

    /*
     * public Player(String firstName, String lastName, String team) {
     * this.firstName = firstName;
     * this.lastName = lastName;
     * this.team = team;
     * }
     */

    @Override
    public String toString() {
        return "Player [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", team=" + team + "]";
    }

    public static void main(String[] args) {
        Player p = new Player();
        p.setFirstName("dario");
        System.out.println(p.getFirstName());
    }

}
