package ru.netology.domain;
public class NotFoundException extends RuntimeException {

    public NotFoundException(String s) {
        super(s);
    }
}
