package com.codecool.apple.exceptions;

public class CatastrophicException extends Exception {
    public CatastrophicException(String message, Throwable inner) {
        super(message, inner);
    }
}
