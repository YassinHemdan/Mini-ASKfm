package com.example.AskFM.entites;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

@MappedSuperclass
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    @CreationTimestamp
    private String dateCreated;

    @UpdateTimestamp
    private String dateUpdated;

    @CreatedBy
    private String createdBy;

    private String updatedBy;
}
