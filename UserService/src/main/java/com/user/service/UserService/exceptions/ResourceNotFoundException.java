package com.user.service.UserService.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    //extra prop+ that u want to add
    public ResourceNotFoundException(){
        super("Resource not found on server!!");

    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
