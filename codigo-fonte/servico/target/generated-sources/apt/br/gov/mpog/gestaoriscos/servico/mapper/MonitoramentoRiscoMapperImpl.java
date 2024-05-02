package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.MonitoramentoRisco;

import br.gov.mpog.gestaoriscos.modelo.dto.MonitoramentoRiscoDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:21-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class MonitoramentoRiscoMapperImpl implements MonitoramentoRiscoMapper {

    @Override

    public List<MonitoramentoRisco> toEntity(List<MonitoramentoRiscoDTO> dtoList) {

        if ( dtoList == null ) {

            return null;
        }

        List<MonitoramentoRisco> list = new ArrayList<MonitoramentoRisco>();

        for ( MonitoramentoRiscoDTO monitoramentoRiscoDTO : dtoList ) {

            list.add( toEntity( monitoramentoRiscoDTO ) );
        }

        return list;
    }

    @Override

    public List<MonitoramentoRiscoDTO> toDto(List<MonitoramentoRisco> entityList) {

        if ( entityList == null ) {

            return null;
        }

        List<MonitoramentoRiscoDTO> list = new ArrayList<MonitoramentoRiscoDTO>();

        for ( MonitoramentoRisco monitoramentoRisco : entityList ) {

            list.add( toDto( monitoramentoRisco ) );
        }

        return list;
    }

    @Override

    public MonitoramentoRisco toEntity(MonitoramentoRiscoDTO dto) {

        if ( dto == null ) {

            return null;
        }

        MonitoramentoRisco monitoramentoRisco_ = new MonitoramentoRisco();

        monitoramentoRisco_.setExcluido( dto.isExcluido() );

        monitoramentoRisco_.setId( dto.getId() );

        monitoramentoRisco_.setFator( dto.getFator() );

        monitoramentoRisco_.setNiveis( String.join(",",dto.getNiveis()) );

        return monitoramentoRisco_;
    }

    @Override

    public MonitoramentoRiscoDTO toDto(MonitoramentoRisco entity) {

        if ( entity == null ) {

            return null;
        }

        MonitoramentoRiscoDTO monitoramentoRiscoDTO_ = new MonitoramentoRiscoDTO();

        monitoramentoRiscoDTO_.setId( entity.getId() );

        monitoramentoRiscoDTO_.setExcluido( entity.isExcluido() );

        monitoramentoRiscoDTO_.setFator( entity.getFator() );

        monitoramentoRiscoDTO_.setNiveis( java.util.Arrays.asList(entity.getNiveis().split(",")) );

        return monitoramentoRiscoDTO_;
    }
}

