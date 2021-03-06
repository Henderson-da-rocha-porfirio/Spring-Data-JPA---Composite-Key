package com.tuyo.compositekey.entities;

import java.io.Serializable;

public class ConsumidorId implements Serializable {           // Composite Key
    private static final long serialVersionUID = 1L;         // Classe Key
    private int id;                                          // Haverá dois campos que se tornarão ID. Então a Key Classe deve implementar a Interface Serializable.
    private String email;                                    // Opcional adicionar uma serialVersionUID. E se fizer, pode deixar a Default.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

