package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.EventoConsequencia;

import br.gov.mpog.gestaoriscos.modelo.dto.EventoConsequenciaDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:21-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class EventoConsequenciaMapperImpl implements EventoConsequenciaMapper {

    @Autowired

    private ConsequenciaMapper consequenciaMapper;

    @Override

    public EventoConsequenciaDTO eventoConsequenciaToEventoConsequenciaDTO(EventoConsequencia eventoConsequencia) {

        if ( eventoConsequencia == null ) {

            return null;
        }

        EventoConsequenciaDTO eventoConsequenciaDTO = new EventoConsequenciaDTO();

        eventoConsequenciaDTO.setId( eventoConsequencia.getId() );

        eventoConsequenciaDTO.setExcluido( eventoConsequencia.isExcluido() );

        eventoConsequenciaDTO.setConsequencia( consequenciaMapper.consequenciaToConsequenciaDTO( eventoConsequencia.getConsequencia() ) );

        return eventoConsequenciaDTO;
    }

    @Override

    public List<EventoConsequenciaDTO> eventoConsequenciasToEventoConsequenciaDTOs(List<EventoConsequencia> eventoConsequencias) {

        if ( eventoConsequencias == null ) {

            return null;
        }

        List<EventoConsequenciaDTO> list = new ArrayList<EventoConsequenciaDTO>();

        for ( EventoConsequencia eventoConsequencia : eventoConsequencias ) {

            list.add( eventoConsequenciaToEventoConsequenciaDTO( eventoConsequencia ) );
        }

        return list;
    }

    @Override

    public EventoConsequencia eventoConsequenciaDTOToEventoConsequencia(EventoConsequenciaDTO eventoConsequenciaDTO) {

        if ( eventoConsequenciaDTO == null ) {

            return null;
        }

        EventoConsequencia eventoConsequencia = new EventoConsequencia();

        eventoConsequencia.setExcluido( eventoConsequenciaDTO.isExcluido() );

        eventoConsequencia.setId( eventoConsequenciaDTO.getId() );

        eventoConsequencia.setConsequencia( consequenciaMapper.consequenciaDTOToConsequencia( eventoConsequenciaDTO.getConsequencia() ) );

        return eventoConsequencia;
    }

    @Override

    public List<EventoConsequencia> eventoConsequenciaDTOsToEventoConsequencias(List<EventoConsequenciaDTO> eventoConsequenciaDTOs) {

        if ( eventoConsequenciaDTOs == null ) {

            return null;
        }

        List<EventoConsequencia> list = new ArrayList<EventoConsequencia>();

        for ( EventoConsequenciaDTO eventoConsequenciaDTO : eventoConsequenciaDTOs ) {

            list.add( eventoConsequenciaDTOToEventoConsequencia( eventoConsequenciaDTO ) );
        }

        return list;
    }
}

