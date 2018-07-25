package domain;

import enums.UserType;

import java.util.Date;

public class User {
    private Long id;
    private String firstName;
    private String secondName;
    private Date birthDate;
    private HomeAddress adrress;
    private UserType type;
    private Boolean active;

    public Boolean getActive() {return active; }

    public void setActive(Boolean active) {this.active = active;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public HomeAddress getAdrress() {
        return adrress;
    }

    public void setAdrress(HomeAddress adrress) {
        this.adrress = adrress;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
