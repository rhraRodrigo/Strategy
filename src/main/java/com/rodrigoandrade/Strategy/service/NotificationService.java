package com.rodrigoandrade.Strategy.service;

import com.rodrigoandrade.Strategy.service.strategy.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

/***
 * Context
 */

@Service
public class NotificationService {

    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
            "discord", new DiscordNotificationStrategy(),
            "instagram", new InstagramNotificationStrategy(),
            "twitter", new TwitterNotificationStrategy(),
            "email", new EmailNotificationStrategy(),
            "whatsapp", new WhatsappNotificationStrategy()
    );

    public void notify(String channel, String destination, String message) {
        mapStrategy.get(channel).sendNotification(destination, message);
    }

}
