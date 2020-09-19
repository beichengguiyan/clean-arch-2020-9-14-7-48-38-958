package com.thoughtworks.cleanarch.domain.contexts.publish;

import com.thoughtworks.cleanarch.domain.core.concepts.ValueObject;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Comment implements ValueObject {
    private String commentator;
    private String commentTime;
    private String commentContent;

}
