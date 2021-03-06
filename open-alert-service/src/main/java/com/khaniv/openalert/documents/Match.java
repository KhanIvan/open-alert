package com.khaniv.openalert.documents;

import com.khaniv.openalert.dto.enums.OperatorMatchStatus;
import com.khaniv.openalert.dto.enums.UserMatchStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Document
@SuperBuilder
@NoArgsConstructor
public class Match extends BaseDocument {
    @Indexed
    @NonNull
    private UUID lostPersonId;
    @Indexed
    @NonNull
    private UUID seenPersonId;
    @NonNull
    private Double probability;
    private OperatorMatchStatus operatorMatchStatus;
    private UserMatchStatus userMatchStatus;
    private Boolean viewedByUser;
    private Boolean viewedByOperator;
}
