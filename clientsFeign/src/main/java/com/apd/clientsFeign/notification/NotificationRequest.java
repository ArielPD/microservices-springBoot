package com.apd.clientsFeign.notification;

public record NotificationRequest(
    Integer toCustomerId,
    String toCustomerName,
    String message) {
}
