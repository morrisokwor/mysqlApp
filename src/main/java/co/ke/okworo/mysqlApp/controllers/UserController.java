package co.ke.okworo.mysqlApp.controllers;

import co.ke.okworo.mysqlApp.pojo.ApiResponse;
import co.ke.okworo.mysqlApp.pojo.UserModel;
import co.ke.okworo.mysqlApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/create")
    ResponseEntity<?> createUser(@RequestBody UserModel userModel) {

        if (userService.existsByEmail(userModel.getEmail())){
            return ResponseEntity.badRequest().body(new ApiResponse(false,"FAILED","Email Already Exists"));
        }

        return ResponseEntity.ok(
                new ApiResponse(
                        true,
                        "SUCCESS",
                        userService.createUser(userModel))
        );
    }
//
    @GetMapping("/all")
    ResponseEntity<?> getAllUser(){
        return ResponseEntity.ok(new ApiResponse(true,"SUCCESS",userService.findAll()));
    }
}
