package org.example.petclinic.owner;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

    @NotBlank
    private String email;
    @NotBlank
    private String phone;


    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }


    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
