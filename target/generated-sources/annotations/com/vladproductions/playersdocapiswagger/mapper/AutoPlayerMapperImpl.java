package com.vladproductions.playersdocapiswagger.mapper;

import com.vladproductions.playersdocapiswagger.dto.ClubDto;
import com.vladproductions.playersdocapiswagger.dto.PlayerDto;
import com.vladproductions.playersdocapiswagger.entity.Club;
import com.vladproductions.playersdocapiswagger.entity.Player;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-12T19:19:02+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
public class AutoPlayerMapperImpl implements AutoPlayerMapper {

    @Override
    public PlayerDto mapToPlayerDto(Player player) {
        if ( player == null ) {
            return null;
        }

        PlayerDto playerDto = new PlayerDto();

        playerDto.setPlayer_id( player.getPlayer_id() );
        playerDto.setNationality( player.getNationality() );
        playerDto.setName( player.getName() );
        playerDto.setAge( player.getAge() );
        playerDto.setEmail( player.getEmail() );
        playerDto.setSalary( player.getSalary() );
        playerDto.setDebutYear( player.getDebutYear() );
        playerDto.setClub( clubToClubDto( player.getClub() ) );

        return playerDto;
    }

    @Override
    public Player mapToPlayer(PlayerDto playerDto) {
        if ( playerDto == null ) {
            return null;
        }

        Player player = new Player();

        player.setPlayer_id( playerDto.getPlayer_id() );
        player.setNationality( playerDto.getNationality() );
        player.setName( playerDto.getName() );
        player.setAge( playerDto.getAge() );
        player.setEmail( playerDto.getEmail() );
        player.setSalary( playerDto.getSalary() );
        player.setDebutYear( playerDto.getDebutYear() );
        player.setClub( clubDtoToClub( playerDto.getClub() ) );

        return player;
    }

    protected ClubDto clubToClubDto(Club club) {
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

    protected Club clubDtoToClub(ClubDto clubDto) {
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
