package co.ke.okworo.mysqlApp.services;

import co.ke.okworo.mysqlApp.pojo.UserModel;
import co.ke.okworo.mysqlApp.entities.Users;
import co.ke.okworo.mysqlApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Users createUser(UserModel payload){

        Users user = new Users();
        user.setEmail(payload.getEmail());
        user.setFirstName(payload.getFirstName());
        user.setOtherNames(payload.getOtherNames());
        user.setTelephone(payload.getTelephone());
        return userRepository.save(user);
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public List<Users> findAll() {
        return userRepository.findAll();
    }
}
