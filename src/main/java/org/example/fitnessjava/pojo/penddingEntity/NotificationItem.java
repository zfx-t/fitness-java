package org.example.fitnessjava.pojo.penddingEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Integer receiverUserId;

    @Enumerated(EnumType.STRING)
    private NotificationType type;

    private String title;
    private String content;

    private Boolean isRead;

    private String actionLink;
    private String createdAt;
}
