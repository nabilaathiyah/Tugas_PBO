package id.ac.uin.student.student.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty (message = "First name is required")
    @Column(nullable = false, name = "first_name")
    private String firstname;

    @NotEmpty(message = "Last name is required")
    @Column(nullable = false, name = "last_name")
    private String lastname;

    @NotEmpty(message = "email is required")
    @Column(nullable = false, name = "email", unique = true)
    private String email;

    @NotEmpty(message = "Phone number is required")
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @NotEmpty(message = "Jurusan is required")
    @Column(nullable = false, unique = true)
    private String jurusan;


}
