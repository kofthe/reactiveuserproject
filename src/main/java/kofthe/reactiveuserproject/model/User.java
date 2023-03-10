package kofthe.reactiveuserproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    private int id;
    private String name;
    private int age;
    private double salary;

}
