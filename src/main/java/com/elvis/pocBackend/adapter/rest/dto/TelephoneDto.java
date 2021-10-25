package com.elvis.pocBackend.adapter.rest.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class TelephoneDto {
    @ApiModelProperty(value = "The ID of the telephone", position = 0)
    private Integer id;


    @Valid
    @NotNull(message = "The telephone number cannot be null")
    @Size(max = 255, message = "The telephone number should have at maximum 255 chars")
    @ApiModelProperty(value = "The number of the user", position = 1)
    private String number;


    @Valid
    @ApiModelProperty(value = "The ID of the user being referenced in telephone", position = 2)
    private UserDto userId;
}
