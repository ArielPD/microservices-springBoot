package com.apd.customer;

public record CustomerRegistrationRequest (
    String firstName,
    String lastName,
    String email) {

}
