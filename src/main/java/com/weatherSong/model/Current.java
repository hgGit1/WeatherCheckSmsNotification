package com.weatherSong.model;

public class Current {

    private float last_updated_epoch;
    private String last_updated;
    private float temp_c;
    private float temp_f;
    private float is_day;
    Condition ConditionObject;
    private float wind_mph;
    private float wind_kph;
    private float wind_degree;
    private String wind_dir;
    private float pressure_mb;
    private float pressure_in;
    private float precip_mm;
    private float precip_in;
    private float humidity;
    private float cloud;
    private float feelslike_c;
    private float feelslike_f;
    private float windchill_c;
    private float windchill_f;
    private float heatindex_c;
    private float heatindex_f;
    private float dewpoint_c;
    private float dewpoint_f;
    private float vis_km;
    private float vis_miles;
    private float uv;
    private float gust_mph;
    private float gust_kph;


    // Getter Methods

    public float getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public float getTemp_c() {
        return temp_c;
    }

    public float getTemp_f() {
        return temp_f;
    }

    public float getIs_day() {
        return is_day;
    }

    public Condition getCondition() {
        return ConditionObject;
    }

    public float getWind_mph() {
        return wind_mph;
    }

    public float getWind_kph() {
        return wind_kph;
    }

    public float getWind_degree() {
        return wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public float getPressure_mb() {
        return pressure_mb;
    }

    public float getPressure_in() {
        return pressure_in;
    }

    public float getPrecip_mm() {
        return precip_mm;
    }

    public float getPrecip_in() {
        return precip_in;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getCloud() {
        return cloud;
    }

    public float getFeelslike_c() {
        return feelslike_c;
    }

    public float getFeelslike_f() {
        return feelslike_f;
    }

    public float getWindchill_c() {
        return windchill_c;
    }

    public float getWindchill_f() {
        return windchill_f;
    }

    public float getHeatindex_c() {
        return heatindex_c;
    }

    public float getHeatindex_f() {
        return heatindex_f;
    }

    public float getDewpoint_c() {
        return dewpoint_c;
    }

    public float getDewpoint_f() {
        return dewpoint_f;
    }

    public float getVis_km() {
        return vis_km;
    }

    public float getVis_miles() {
        return vis_miles;
    }

    public float getUv() {
        return uv;
    }

    public float getGust_mph() {
        return gust_mph;
    }

    public float getGust_kph() {
        return gust_kph;
    }

    // Setter Methods

    public void setLast_updated_epoch(float last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public void setTemp_c(float temp_c) {
        this.temp_c = temp_c;
    }

    public void setTemp_f(float temp_f) {
        this.temp_f = temp_f;
    }

    public void setIs_day(float is_day) {
        this.is_day = is_day;
    }

    public void setCondition(Condition conditionObject) {
        this.ConditionObject = conditionObject;
    }

    public void setWind_mph(float wind_mph) {
        this.wind_mph = wind_mph;
    }

    public void setWind_kph(float wind_kph) {
        this.wind_kph = wind_kph;
    }

    public void setWind_degree(float wind_degree) {
        this.wind_degree = wind_degree;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public void setPressure_mb(float pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public void setPressure_in(float pressure_in) {
        this.pressure_in = pressure_in;
    }

    public void setPrecip_mm(float precip_mm) {
        this.precip_mm = precip_mm;
    }

    public void setPrecip_in(float precip_in) {
        this.precip_in = precip_in;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setCloud(float cloud) {
        this.cloud = cloud;
    }

    public void setFeelslike_c(float feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public void setFeelslike_f(float feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public void setWindchill_c(float windchill_c) {
        this.windchill_c = windchill_c;
    }

    public void setWindchill_f(float windchill_f) {
        this.windchill_f = windchill_f;
    }

    public void setHeatindex_c(float heatindex_c) {
        this.heatindex_c = heatindex_c;
    }

    public void setHeatindex_f(float heatindex_f) {
        this.heatindex_f = heatindex_f;
    }

    public void setDewpoint_c(float dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public void setDewpoint_f(float dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }

    public void setVis_km(float vis_km) {
        this.vis_km = vis_km;
    }

    public void setVis_miles(float vis_miles) {
        this.vis_miles = vis_miles;
    }

    public void setUv(float uv) {
        this.uv = uv;
    }

    public void setGust_mph(float gust_mph) {
        this.gust_mph = gust_mph;
    }

    public void setGust_kph(float gust_kph) {
        this.gust_kph = gust_kph;
    }

}
