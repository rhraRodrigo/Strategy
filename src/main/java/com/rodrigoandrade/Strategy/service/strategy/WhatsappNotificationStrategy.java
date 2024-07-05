package com.rodrigoandrade.Strategy.service.strategy;

import com.rodrigoandrade.Strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * Concrete Strategy
 */
public class WhatsappNotificationStrategy implements NotificationStrategy {

    private final Logger logger = LoggerFactory.getLogger(WhatsappNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Notificacao [{}] enviada para o Whatsapp [{}]", message, destination);
    }
}
