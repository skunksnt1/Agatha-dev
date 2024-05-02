package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.CalculoRisco;

import br.gov.mpog.gestaoriscos.modelo.PesoEventoRisco;

import br.gov.mpog.gestaoriscos.modelo.dto.CalculoRiscoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.PesoEventoRiscoDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:19-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class CalculoRiscoMapperImpl implements CalculoRiscoMapper {

    @Autowired

    private PesoEventoRiscoMapper pesoEventoRiscoMapper;

    @Override

    public CalculoRiscoDTO calculoRiscoToCalculoRiscoDTO(CalculoRisco calculoRisco) {

        if ( calculoRisco == null ) {

            return null;
        }

        CalculoRiscoDTO calculoRiscoDTO = new CalculoRiscoDTO();

        calculoRiscoDTO.setExcluido( calculoRisco.isExcluido() );

        calculoRiscoDTO.setId( calculoRisco.getId() );

        calculoRiscoDTO.setMediaPeso( calculoRisco.getMediaPeso() );

        calculoRiscoDTO.setFrequencia( calculoRisco.getFrequencia() );

        calculoRiscoDTO.setNivel( calculoRisco.getNivel() );

        List<PesoEventoRiscoDTO> list = pesoEventoRiscoMapper.pesoEventoRiscosToPesoEventoRiscoDTOs( calculoRisco.getPesos() );

        if ( list != null ) {

            calculoRiscoDTO.setPesos( list );
        }

        return calculoRiscoDTO;
    }

    @Override

    public List<CalculoRiscoDTO> calculoRiscosToCalculoRiscoDTOs(List<CalculoRisco> calculoRiscos) {

        if ( calculoRiscos == null ) {

            return null;
        }

        List<CalculoRiscoDTO> list = new ArrayList<CalculoRiscoDTO>();

        for ( CalculoRisco calculoRisco : calculoRiscos ) {

            list.add( calculoRiscoToCalculoRiscoDTO( calculoRisco ) );
        }

        return list;
    }

    @Override

    public CalculoRisco calculoRiscoDTOToCalculoRisco(CalculoRiscoDTO calculoRiscoDTO) {

        if ( calculoRiscoDTO == null ) {

            return null;
        }

        CalculoRisco calculoRisco = new CalculoRisco();

        calculoRisco.setExcluido( calculoRiscoDTO.isExcluido() );

        calculoRisco.setId( calculoRiscoDTO.getId() );

        calculoRisco.setMediaPeso( calculoRiscoDTO.getMediaPeso() );

        calculoRisco.setFrequencia( calculoRiscoDTO.getFrequencia() );

        calculoRisco.setNivel( calculoRiscoDTO.getNivel() );

        List<PesoEventoRisco> list = pesoEventoRiscoMapper.pesoEventoRiscoDTOsToPesoEventoRiscos( calculoRiscoDTO.getPesos() );

        if ( list != null ) {

            calculoRisco.setPesos( list );
        }

        return calculoRisco;
    }

    @Override

    public List<CalculoRisco> calculoRiscoDTOsToCalculoRiscos(List<CalculoRiscoDTO> calculoRiscoDTOs) {

        if ( calculoRiscoDTOs == null ) {

            return null;
        }

        List<CalculoRisco> list = new ArrayList<CalculoRisco>();

        for ( CalculoRiscoDTO calculoRiscoDTO : calculoRiscoDTOs ) {

            list.add( calculoRiscoDTOToCalculoRisco( calculoRiscoDTO ) );
        }

        return list;
    }
}

