package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Evento;

import br.gov.mpog.gestaoriscos.modelo.dto.EventoDTO;

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

public class EventoMapperImpl implements EventoMapper {

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Override

    public EventoDTO eventoToEventoDTO(Evento evento) {

        if ( evento == null ) {

            return null;
        }

        EventoDTO eventoDTO = new EventoDTO();

        eventoDTO.setId( evento.getId() );

        eventoDTO.setExcluido( evento.isExcluido() );

        eventoDTO.setDescricao( evento.getDescricao() );

        eventoDTO.setSearch( evento.getSearch() );

        eventoDTO.setStatus( evento.isStatus() );

        return eventoDTO;
    }

    @Override

    public List<EventoDTO> eventosToEventoDTOs(List<Evento> eventos) {

        if ( eventos == null ) {

            return null;
        }

        List<EventoDTO> list = new ArrayList<EventoDTO>();

        for ( Evento evento : eventos ) {

            list.add( eventoToEventoDTO( evento ) );
        }

        return list;
    }

    @Override

    public Evento eventoDTOToEvento(EventoDTO eventoDTO) {

        if ( eventoDTO == null ) {

            return null;
        }

        Evento evento = new Evento();

        evento.setExcluido( eventoDTO.isExcluido() );

        evento.setDescricao( eventoDTO.getDescricao() );

        evento.setStatus( eventoDTO.isStatus() );

        evento.setSearch( eventoDTO.getSearch() );

        evento.setOrgao( orgaoMapper.orgaoDTOToOrgao( eventoDTO.getOrgao() ) );

        evento.setId( eventoDTO.getId() );

        return evento;
    }

    @Override

    public List<Evento> eventoDTOsToEventos(List<EventoDTO> eventoDTOs) {

        if ( eventoDTOs == null ) {

            return null;
        }

        List<Evento> list = new ArrayList<Evento>();

        for ( EventoDTO eventoDTO : eventoDTOs ) {

            list.add( eventoDTOToEvento( eventoDTO ) );
        }

        return list;
    }
}

