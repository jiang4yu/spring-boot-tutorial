package io.github.dunwu.springboot.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityInfo {

    private String city;

    private String citykey;

    private String parent;

    private String updateTime;

}
