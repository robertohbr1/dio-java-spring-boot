package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.AddressDTO;
import one.digitalinnovation.personapi.entity.Address;
import one.digitalinnovation.personapi.enums.AddressType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class AddressUtils {
    private static final AddressType ADDRESS_TYPE = AddressType.HOME;
    private static final long ADDRESS_ID = 1L;
    private static final String ZIP_CODE = "90000-000";
    private static final String ADDRESS_NAME = "RUA DA PATRIA";
    private static final String ADDRESS_NUMBER = "123";
    private static final String ADDRESS_COMPLEMENT = "BL 12";
    private static final String ADDRESS_CITY = "PORTO ALEGRE";
    private static final String ADDRESS_STATE = "RS";
    private static final String ADDRESS_COUNTRY = "BRAZIL";

    public static AddressDTO createFakeDTO() {
        return AddressDTO.builder()
                .type(ADDRESS_TYPE)
                .zipCode(ZIP_CODE)
                .addressName(ADDRESS_NAME)
                .number(ADDRESS_NUMBER)
                .complement(ADDRESS_COMPLEMENT)
                .city(ADDRESS_CITY)
                .state(ADDRESS_STATE)
                .country(ADDRESS_COUNTRY)
                .build();
    }

    public static Address createFakeEntity() {
        return Address.builder()
                .id(ADDRESS_ID)
                .type(ADDRESS_TYPE)
                .zipCode(ZIP_CODE)
                .addressName(ADDRESS_NAME)
                .number(ADDRESS_NUMBER)
                .complement(ADDRESS_COMPLEMENT)
                .city(ADDRESS_CITY)
                .state(ADDRESS_STATE)
                .country(ADDRESS_COUNTRY)
                .build();
    }
}

