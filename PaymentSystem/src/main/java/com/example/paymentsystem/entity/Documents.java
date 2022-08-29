package com.example.paymentsystem.entity;

import com.example.paymentsystem.dto.enums.DocumentCategory;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Documents extends BaseEntity{

    private String documentName;
    private String imageName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDateTime;

    private DocumentCategory category;
    private Boolean isApproved;
    private Long payTackUserID;

    @Temporal(TemporalType.TIMESTAMP)
    private Date approvedDateTime;

    private Long approveUserId;
}
