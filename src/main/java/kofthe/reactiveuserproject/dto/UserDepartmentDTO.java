package kofthe.reactiveuserproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDepartmentDTO {
    private int userId;
    private String userName;
    private int age;
    private double salary;
    private int departmentId;
    private String departmentName;
    private String loc;
}
