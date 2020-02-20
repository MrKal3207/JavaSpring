package com.mr.kal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LombokModel {
    @NotNull
    @NotEmpty
    @JsonProperty("name")
    @ApiModelProperty(example = "Ten", required = true)
    private String name;
    @NotNull
    @NotEmpty
    @JsonProperty("value")
    @ApiModelProperty(example = "Ten", required = true)
    private String value;
}
