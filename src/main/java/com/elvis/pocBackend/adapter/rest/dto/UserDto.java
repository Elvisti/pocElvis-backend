package com.elvis.pocBackend.adapter.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class UserDto {
    @ApiModelProperty(value = "The ID of the user", position = 0)
    private Integer id;

    @Valid
    @Size(max = 255, message = "The name should have at maximum 255 chars")
    @NotEmpty(message = "The name cannot be null")
    @ApiModelProperty(value = "The name of the user", position = 1)
    private String name;

    @ApiModelProperty(value = "The age of the user", position = 2)
    private Integer age;

    @Valid
    @NotNull(message = "Emails cannot be null")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty(value = "Email list for user", position = 3)
    private List<EmailDto> emails;

    @Valid
    @NotNull(message = "Telephones cannot be null")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty(value = "Telephone list for user", position = 4)
    private List<TelephoneDto> telephones;

    @Valid
    @NotNull(message = "Addresses cannot be null")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty(value = "Address list for user", position = 5)
    private List<AddressDto> addresses;
}
