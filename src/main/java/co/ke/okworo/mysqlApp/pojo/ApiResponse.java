package co.ke.okworo.mysqlApp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {

    private Boolean success;

    private String message;

    private Object data;
}
