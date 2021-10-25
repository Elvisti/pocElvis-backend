package com.elvis.pocBackend.adapter.rest.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class EmailDto {

    @ApiModelProperty(value = "The ID of the email", position = 0)
    private Integer id;

    @Valid
    @NotEmpty(message = "The email of the user cannot be null")
    @Size(max = 255, message = "The email of the user should have at maximum 255 chars")
    @ApiModelProperty(value = "The email of the user", position = 1)
    private String email;

    @Valid
    @ApiModelProperty(value = "The ID of the user being referenced in email", position = 2)
    private UserDto userId;
}
