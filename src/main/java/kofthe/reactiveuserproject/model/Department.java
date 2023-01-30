package kofthe.reactiveuserproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department")
public class Department {
    private int id;
    private String name;
    private int userId;
    private String loc;
}
