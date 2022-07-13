package com.elsoprojekt.webProjekt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class registerValid {
    //Valódi feltételek nem így néznének ki, kipróbálásra van.
    @NotNull
    @Size(min = 4, max=12)
    @NotBlank(message="Felhasználónevet kötelező megadni!")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{4,}$",
            message = "Felhasználónévben lennie kell legalább 1 betűnek, 1 számnak!")
    private String userValid;

    @NotNull
    @Size(min = 4,  max=12)
    @NotBlank(message = "Jelszavat közelező megadni!")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$", message = "Jelszónak tartalmaznia kell legalább 1 nagy betűt, és egy számot.")
    private String password;

    @Override
    public String toString() {
        return "registerValid{" +
                "name='" + userValid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserValid() {
        return userValid;
    }

    public void setUserValid(String userValid) {
        this.userValid = userValid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
