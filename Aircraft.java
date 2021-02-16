package com.company;

import lombok.Getter;
import lombok.ToString;

import java.util.Date;
@ToString
public class Aircraft {

    private @Getter final String m_manufacturer;
    private @Getter float m_max_speed;
    private @Getter float m_max_attitude;
    private @Getter final Date m_production_date;

    public Aircraft(String m_manufacturer, float m_max_speed, float m_max_attitude ) {
        this.m_manufacturer = m_manufacturer;
        this.m_max_speed = m_max_speed;
        this.m_max_attitude = m_max_attitude;
        this.m_production_date = getM_production_date();

    }
}

