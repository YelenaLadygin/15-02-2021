package com.company;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Helicopter extends Aircraft {
    private @Getter String m_engine_power;

    public Helicopter(String m_manufacturer, float m_max_speed, float m_max_attitude, String m_engine_power) {
        super(m_manufacturer, m_max_speed, m_max_attitude);
        this.m_engine_power = m_engine_power;
    }
}
