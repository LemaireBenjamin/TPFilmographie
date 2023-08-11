package fr.eni.film.tpfilmographie.bo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


import java.util.ArrayList;

public class Member {
    private int id;
    @NotBlank(message="Le prénom ne peut être vide")
    @NotNull(message = "L'email ne peut pas être nul")
    private String firstName;
    @NotBlank(message="Le nom ne peut être vide")
    @NotNull(message = "L'email ne peut pas être nul")
    private String lastName;
    @Email
    @NotNull(message = "L'email ne peut pas être nul")
    private String emailAdress;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")
    @NotNull(message = "L'email ne peut pas être nul")
    private String password;
    private boolean admin;
    private ArrayList<Opinion> opinions;


    public Member(int id, String firstName, String lastName, String emailAdress, String password, boolean admin, ArrayList<Opinion> opinions) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAdress = emailAdress;
        this.password = password;
        this.admin = admin;
        this.opinions = opinions;
    }

    public Member() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public ArrayList<Opinion> getOpinions() {
        return opinions;
    }

    public void setOpinions(ArrayList<Opinion> opinions) {
        this.opinions = opinions;
    }
}
