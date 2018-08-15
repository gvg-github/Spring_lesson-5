package ru.gvg.spring.dto;

import java.util.Date;

/**
 * @author Valeriy Gyrievskikh
 * @since 15.08.2018.
 */
public class DateDTO {
    private Date value;
    public DateDTO(){

    }
    public DateDTO(Date value){
        this.value = value;
    }

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
    }
}
