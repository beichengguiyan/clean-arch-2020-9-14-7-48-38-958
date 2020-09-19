package com.thoughtworks.cleanarch.domain.contexts.edit;

import com.thoughtworks.cleanarch.domain.core.concepts.ValueObject;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class HistoryBlog implements ValueObject {
    private Date editTime;
    private String title;
    private String content;
}
