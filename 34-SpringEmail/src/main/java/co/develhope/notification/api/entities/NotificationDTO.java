package co.develhope.notification.api.entities;

import lombok.Data;

@Data
public class NotificationDTO {

    /** User id to send data */
    private String userId;
    /** Title of the notification */
    private String title;
    /** Text of the notification */
    private String text;
}
