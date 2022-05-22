package ru.cmit.orderservice.controller.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequest {
    @JsonProperty(required = true)
    @NotBlank
    private String login;

    @JsonProperty(required = true)
    @NotBlank
    private String name;

    @JsonProperty(required = true)
    @NotBlank
    private String surname;

    @JsonProperty(required = true)
    @NotBlank
    private LocalDate date_of_birth;
}
