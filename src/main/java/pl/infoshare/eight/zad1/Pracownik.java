package pl.infoshare.eight.zad1;

import java.time.LocalDate;
import java.util.Date;

public class Pracownik {
    private LocalDate dateOfBirth;
    private String name;
    private String lastName;
    private String department;

    public Pracownik(LocalDate dateOfBirth, String name, String lastName, String department) {
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }
}
