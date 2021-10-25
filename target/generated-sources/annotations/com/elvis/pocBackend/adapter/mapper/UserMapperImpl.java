package com.elvis.pocBackend.adapter.mapper;

import com.elvis.pocBackend.adapter.rest.dto.AddressDto;
import com.elvis.pocBackend.adapter.rest.dto.AddressTypeDto;
import com.elvis.pocBackend.adapter.rest.dto.EmailDto;
import com.elvis.pocBackend.adapter.rest.dto.TelephoneDto;
import com.elvis.pocBackend.adapter.rest.dto.UserDto;
import com.elvis.pocBackend.domain.model.Address;
import com.elvis.pocBackend.domain.model.AddressType;
import com.elvis.pocBackend.domain.model.Email;
import com.elvis.pocBackend.domain.model.Telephone;
import com.elvis.pocBackend.domain.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-22T12:54:24-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setName( user.getName() );
        userDto.setAge( user.getAge() );
        userDto.setEmails( emailListToEmailDtoList( user.getEmails() ) );
        userDto.setTelephones( telephoneListToTelephoneDtoList( user.getTelephones() ) );
        userDto.setAddresses( addressListToAddressDtoList( user.getAddresses() ) );

        return userDto;
    }

    @Override
    public User userDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setName( userDto.getName() );
        if ( userDto.getAge() != null ) {
            user.setAge( userDto.getAge() );
        }
        user.setEmails( emailDtoListToEmailList( userDto.getEmails() ) );
        user.setTelephones( telephoneDtoListToTelephoneList( userDto.getTelephones() ) );
        user.setAddresses( addressDtoListToAddressList( userDto.getAddresses() ) );

        return user;
    }

    protected EmailDto emailToEmailDto(Email email) {
        if ( email == null ) {
            return null;
        }

        EmailDto emailDto = new EmailDto();

        emailDto.setId( email.getId() );
        emailDto.setEmail( email.getEmail() );
        emailDto.setUserId( userToUserDto( email.getUserId() ) );

        return emailDto;
    }

    protected List<EmailDto> emailListToEmailDtoList(List<Email> list) {
        if ( list == null ) {
            return null;
        }

        List<EmailDto> list1 = new ArrayList<EmailDto>( list.size() );
        for ( Email email : list ) {
            list1.add( emailToEmailDto( email ) );
        }

        return list1;
    }

    protected TelephoneDto telephoneToTelephoneDto(Telephone telephone) {
        if ( telephone == null ) {
            return null;
        }

        TelephoneDto telephoneDto = new TelephoneDto();

        telephoneDto.setId( telephone.getId() );
        telephoneDto.setNumber( telephone.getNumber() );
        telephoneDto.setUserId( userToUserDto( telephone.getUserId() ) );

        return telephoneDto;
    }

    protected List<TelephoneDto> telephoneListToTelephoneDtoList(List<Telephone> list) {
        if ( list == null ) {
            return null;
        }

        List<TelephoneDto> list1 = new ArrayList<TelephoneDto>( list.size() );
        for ( Telephone telephone : list ) {
            list1.add( telephoneToTelephoneDto( telephone ) );
        }

        return list1;
    }

    protected AddressTypeDto addressTypeToAddressTypeDto(AddressType addressType) {
        if ( addressType == null ) {
            return null;
        }

        AddressTypeDto addressTypeDto;

        switch ( addressType ) {
            case COMMERCIAL: addressTypeDto = AddressTypeDto.COMMERCIAL;
            break;
            case CORRESPONDENCE: addressTypeDto = AddressTypeDto.CORRESPONDENCE;
            break;
            case HOME: addressTypeDto = AddressTypeDto.HOME;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + addressType );
        }

        return addressTypeDto;
    }

    protected AddressDto addressToAddressDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        addressDto.setId( address.getId() );
        addressDto.setType( addressTypeToAddressTypeDto( address.getType() ) );
        addressDto.setAddress( address.getAddress() );
        addressDto.setAddressName( address.getAddressName() );
        addressDto.setCity( address.getCity() );
        addressDto.setState( address.getState() );
        addressDto.setPostcode( address.getPostcode() );
        addressDto.setUserId( userToUserDto( address.getUserId() ) );

        return addressDto;
    }

    protected List<AddressDto> addressListToAddressDtoList(List<Address> list) {
        if ( list == null ) {
            return null;
        }

        List<AddressDto> list1 = new ArrayList<AddressDto>( list.size() );
        for ( Address address : list ) {
            list1.add( addressToAddressDto( address ) );
        }

        return list1;
    }

    protected Email emailDtoToEmail(EmailDto emailDto) {
        if ( emailDto == null ) {
            return null;
        }

        Email email = new Email();

        email.setId( emailDto.getId() );
        email.setEmail( emailDto.getEmail() );
        email.setUserId( userDtoToUser( emailDto.getUserId() ) );

        return email;
    }

    protected List<Email> emailDtoListToEmailList(List<EmailDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Email> list1 = new ArrayList<Email>( list.size() );
        for ( EmailDto emailDto : list ) {
            list1.add( emailDtoToEmail( emailDto ) );
        }

        return list1;
    }

    protected Telephone telephoneDtoToTelephone(TelephoneDto telephoneDto) {
        if ( telephoneDto == null ) {
            return null;
        }

        Telephone telephone = new Telephone();

        telephone.setId( telephoneDto.getId() );
        telephone.setNumber( telephoneDto.getNumber() );
        telephone.setUserId( userDtoToUser( telephoneDto.getUserId() ) );

        return telephone;
    }

    protected List<Telephone> telephoneDtoListToTelephoneList(List<TelephoneDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Telephone> list1 = new ArrayList<Telephone>( list.size() );
        for ( TelephoneDto telephoneDto : list ) {
            list1.add( telephoneDtoToTelephone( telephoneDto ) );
        }

        return list1;
    }

    protected AddressType addressTypeDtoToAddressType(AddressTypeDto addressTypeDto) {
        if ( addressTypeDto == null ) {
            return null;
        }

        AddressType addressType;

        switch ( addressTypeDto ) {
            case COMMERCIAL: addressType = AddressType.COMMERCIAL;
            break;
            case HOME: addressType = AddressType.HOME;
            break;
            case CORRESPONDENCE: addressType = AddressType.CORRESPONDENCE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + addressTypeDto );
        }

        return addressType;
    }

    protected Address addressDtoToAddress(AddressDto addressDto) {
        if ( addressDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDto.getId() );
        address.setType( addressTypeDtoToAddressType( addressDto.getType() ) );
        address.setAddress( addressDto.getAddress() );
        address.setAddressName( addressDto.getAddressName() );
        address.setCity( addressDto.getCity() );
        address.setState( addressDto.getState() );
        address.setPostcode( addressDto.getPostcode() );
        address.setUserId( userDtoToUser( addressDto.getUserId() ) );

        return address;
    }

    protected List<Address> addressDtoListToAddressList(List<AddressDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Address> list1 = new ArrayList<Address>( list.size() );
        for ( AddressDto addressDto : list ) {
            list1.add( addressDtoToAddress( addressDto ) );
        }

        return list1;
    }
}
