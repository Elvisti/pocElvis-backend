package com.elvis.pocBackend.adapter.rest.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class AddressDto {
    @ApiModelProperty(value = "The ID of the address", position = 0)
    private Integer id;

    @Valid
    @NotNull(message = "The type of the address cannot be null")
    @ApiModelProperty(value = "The type of the address", position = 1)
    private AddressTypeDto type;

    @Valid
    @NotEmpty(message = "The address of the user cannot be null")
    @Size(max = 255, message = "The address of the user should have at maximum 3096 chars")
    @ApiModelProperty(value = "The address of the user", position = 2)
    private String address;

    @Valid
    @Size(max = 1024, message = "The address name of the user should have at maximum 1024 chars")
    @ApiModelProperty(value = "The address name of the user", position = 3)
    private String addressName;

    @Valid
    @NotEmpty(message = "The city of the user cannot be null")
    @Size(max = 255, message = "The city of the user should have at maximum 255 chars")
    @ApiModelProperty(value = "The city of the user", position = 4)
    private String city;

    @Valid
    @Size(max = 255, message = "The state of the user should have at maximum 255 chars")
    @ApiModelProperty(value = "The state of the user", position = 5)
    private String state;

    @Valid
    @Size(max = 255, message = "The postcode of the user should have at maximum 255 chars")
    @ApiModelProperty(value = "The postcode of the user", position = 6)
    private String postcode;


    @Valid
    @ApiModelProperty(value = "The ID of the user being referenced in address", position = 7)
    private UserDto userId;
}
