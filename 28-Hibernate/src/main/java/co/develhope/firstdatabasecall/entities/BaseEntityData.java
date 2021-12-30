package co.develhope.firstdatabasecall.entities;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntityData  {


    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;


    @ManyToOne(fetch = FetchType.LAZY)
    private User createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    private User updatedBy;
}
