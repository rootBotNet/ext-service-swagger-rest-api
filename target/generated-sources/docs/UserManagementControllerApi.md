# UserManagementControllerApi

All URIs are relative to *https://localhost:8086/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPUT**](UserManagementControllerApi.md#addUsingPUT) | **PUT** /usermanagement/users | add
[**findAllUsingGET**](UserManagementControllerApi.md#findAllUsingGET) | **GET** /usermanagement/users | findAll


<a name="addUsingPUT"></a>
# **addUsingPUT**
> ResponseEntity addUsingPUT(name, phone, password)

add

### Example
```java
// Import classes:
//import springbootservice.consume.ApiException;
//import springbootservice.consume.api.UserManagementControllerApi;


UserManagementControllerApi apiInstance = new UserManagementControllerApi();
String name = "name_example"; // String | name
String phone = "phone_example"; // String | phone
String password = "password_example"; // String | password
try {
    ResponseEntity result = apiInstance.addUsingPUT(name, phone, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementControllerApi#addUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **phone** | **String**| phone |
 **password** | **String**| password |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> List&lt;UserDetails&gt; findAllUsingGET()

findAll

### Example
```java
// Import classes:
//import springbootservice.consume.ApiException;
//import springbootservice.consume.api.UserManagementControllerApi;


UserManagementControllerApi apiInstance = new UserManagementControllerApi();
try {
    List<UserDetails> result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserDetails&gt;**](UserDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

