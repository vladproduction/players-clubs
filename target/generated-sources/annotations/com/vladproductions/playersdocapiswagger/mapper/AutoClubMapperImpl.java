package com.vladproductions.playersdocapiswagger.mapper;

import com.vladproductions.playersdocapiswagger.dto.ClubDto;
import com.vladproductions.playersdocapiswagger.entity.Club;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-12T19:19:02+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
public class AutoClubMapperImpl implements AutoClubMapper {

    @Override
    public ClubDto mapToClubDto(Club club) {
        if ( club == null ) {
            return null;
        }

        ClubDto clubDto = new ClubDto();

        clubDto.setClub_id( club.getClub_id() );
        clubDto.setTitle( club.getTitle() );
        clubDto.setCountry( club.getCountry() );
        clubDto.setLeague( club.getLeague() );

        return clubDto;
    }

    @Override
    public Club mapToClub(ClubDto clubDto) {
        if ( clubDto == null ) {
            return null;
        }

        Club club = new Club();

        club.setClub_id( clubDto.getClub_id() );
        club.setTitle( clubDto.getTitle() );
        club.setCountry( clubDto.getCountry() );
        club.setLeague( clubDto.getLeague() );

        return club;
    }
}
