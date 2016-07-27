package com.polydevops.unit_conversion_calculator.throwable;

/**
 * Exception thrown when an invalid conversion (e.g. trying to convert grams to milliliters)
 * is attempted
 */
public class InvalidConversionException extends Exception {

    public InvalidConversionException(String detailMessage) {
        super(detailMessage);
    }

}
