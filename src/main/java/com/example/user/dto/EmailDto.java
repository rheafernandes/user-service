package com.example.user.dto;

import com.example.user.models.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailDto implements Serializable {
    private int id;

    private String mail;

    public Email toEntity() {
        return new Email(this.id, this.mail);
    }
}
