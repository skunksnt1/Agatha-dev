package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.EventoCausa;

import br.gov.mpog.gestaoriscos.modelo.dto.EventoCausaDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class EventoCausaMapperImpl implements EventoCausaMapper {

    @Autowired

    private CausaMapper causaMapper;

    @Override

    public EventoCausaDTO eventoCausaToEventoCausaDTO(EventoCausa eventoCausa) {

        if ( eventoCausa == null ) {

            return null;
        }

        EventoCausaDTO eventoCausaDTO = new EventoCausaDTO();

        eventoCausaDTO.setId( eventoCausa.getId() );

        eventoCausaDTO.setExcluido( eventoCausa.isExcluido() );

        eventoCausaDTO.setCausa( causaMapper.causaToCausaDTO( eventoCausa.getCausa() ) );

        return eventoCausaDTO;
    }

    @Override

    public List<EventoCausaDTO> eventoCausasToEventoCausaDTOs(List<EventoCausa> eventoCausas) {

        if ( eventoCausas == null ) {

            return null;
        }

        List<EventoCausaDTO> list = new ArrayList<EventoCausaDTO>();

        for ( EventoCausa eventoCausa : eventoCausas ) {

            list.add( eventoCausaToEventoCausaDTO( eventoCausa ) );
        }

        return list;
    }

    @Override

    public EventoCausa eventoCausaDTOToEventoCausa(EventoCausaDTO eventoCausaDTO) {

        if ( eventoCausaDTO == null ) {

            return null;
        }

        EventoCausa eventoCausa = new EventoCausa();

        eventoCausa.setExcluido( eventoCausaDTO.isExcluido() );

        eventoCausa.setId( eventoCausaDTO.getId() );

        eventoCausa.setCausa( causaMapper.causaDTOToCausa( eventoCausaDTO.getCausa() ) );

        return eventoCausa;
    }

    @Override

    public List<EventoCausa> eventoCausaDTOsToEventoCausas(List<EventoCausaDTO> eventoCausaDTOs) {

        if ( eventoCausaDTOs == null ) {

            return null;
        }

        List<EventoCausa> list = new ArrayList<EventoCausa>();

        for ( EventoCausaDTO eventoCausaDTO : eventoCausaDTOs ) {

            list.add( eventoCausaDTOToEventoCausa( eventoCausaDTO ) );
        }

        return list;
    }
}

