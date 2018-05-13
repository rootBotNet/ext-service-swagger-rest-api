package usermanagement.manager;

import org.springframework.stereotype.Component;
import springbootservice.consume.api.UserManagementControllerApi;
import springbootservice.consume.model.ResponseEntity;
import springbootservice.consume.model.UserDetails;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class UserManagementManagerImpl implements UserManagementManager {

    private UserManagementControllerApi api;

    private String basePath = "http://localhost:8086/api";

    @PostConstruct
    private void setupApiClient(){
        api = new UserManagementControllerApi();
        api.getApiClient().setBasePath(basePath);
    }

    @Override
    public ResponseEntity addUsingPUT(String name, String phone, String password) {
        api.addUsingPUT(name, phone,password);
        return null;
    }

    @Override
    public List<UserDetails> findAllUsingGET() {
        return  api.findAllUsingGET();
    }
}
