package edu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Band {
    private Integer id;
    private String bandName;
    private Integer UserID;
    private String bDate;
}
