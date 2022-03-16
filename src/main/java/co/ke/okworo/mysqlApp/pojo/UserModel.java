package co.ke.okworo.mysqlApp.pojo;

import lombok.Data;

@Data
public class UserModel {

    private Long users_id;

    private String firstName;

    private String otherNames;

    private String email;

    private String telephone;
}
