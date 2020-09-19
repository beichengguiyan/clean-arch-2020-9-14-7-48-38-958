package com.thoughtworks.cleanarch.domain.core.exception;

public class DomainException extends Exception {
    public DomainException() {
        super();
    }

    public DomainException(String message) {
        super(message);
    }
}
