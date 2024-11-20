package edu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {
    private Integer id;
    private String fullName;
    private Integer nic;
    private String address;
}
