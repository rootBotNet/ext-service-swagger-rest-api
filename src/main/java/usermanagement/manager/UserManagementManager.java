package usermanagement.manager;

import springbootservice.consume.model.ResponseEntity;
import springbootservice.consume.model.UserDetails;

import java.util.List;

public interface UserManagementManager {
    public ResponseEntity addUsingPUT(String name, String phone, String password);
    public List<UserDetails> findAllUsingGET();
}
