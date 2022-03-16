package co.ke.okworo.mysqlApp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long users_id;

    private String firstName;

    private String otherNames;

    @Column(unique = true)
    private String email;

    private String telephone;

}
