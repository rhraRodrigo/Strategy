package com.rodrigoandrade.Strategy.service;

/***
 * Strategy
 */
public interface NotificationStrategy {

    void sendNotification(String destination, String message);
}
