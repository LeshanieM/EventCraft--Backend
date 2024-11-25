package edu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public final class Hall {
    private Integer id;
    private String hallName;
    private Integer price;
    private String hallDate;

}
