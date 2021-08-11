package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.AddressType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private Long id;

    @Enumerated(EnumType.STRING)
    private AddressType type;

    @NotEmpty
    @Size(min = 8, max = 9)
    private String zipCode;

    @NotEmpty
    @Size(min = 5, max = 50)
    private String addressName;

    @NotEmpty
    @Size(min = 1, max = 15)
    private String number;

    @Size(min = 0, max = 30)
    private String complement;

    @NotEmpty
    @Size(min = 5, max = 50)
    private String city;

    @NotEmpty
    @Size(min = 2, max = 3)
    private String state;

    @NotEmpty
    @Size(min = 5, max = 20)
    private String country;
}
