# ext-service-swagger-rest-api
This is the external jar api which was generated from the yaml file which we generated from the json file using the swagger plugin on the UserManagementController.
We have generated an consume and expose repository from the spring-boot-swagger-rest-service-v1.yml file.
Usually the expose file will be altered from the consume file to fit the clients models and implementation and mapstruct can then be used to map objects between the consume and expose repositories. This will enable the client to still work even after that the service objects from the consume side might have changed.
