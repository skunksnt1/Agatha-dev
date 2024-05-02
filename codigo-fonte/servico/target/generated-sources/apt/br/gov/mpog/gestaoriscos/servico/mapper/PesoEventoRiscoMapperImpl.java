package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.PesoEventoRisco;

import br.gov.mpog.gestaoriscos.modelo.dto.PesoEventoRiscoDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class PesoEventoRiscoMapperImpl implements PesoEventoRiscoMapper {

    @Override

    public PesoEventoRiscoDTO pesoEventoRiscoToPesoEventoRiscoDTO(PesoEventoRisco pesoEventoRisco) {

        if ( pesoEventoRisco == null ) {

            return null;
        }

        PesoEventoRiscoDTO pesoEventoRiscoDTO = new PesoEventoRiscoDTO();

        pesoEventoRiscoDTO.setExcluido( pesoEventoRisco.isExcluido() );

        pesoEventoRiscoDTO.setId( pesoEventoRisco.getId() );

        pesoEventoRiscoDTO.setPeso( pesoEventoRisco.getPeso() );

        return pesoEventoRiscoDTO;
    }

    @Override

    public List<PesoEventoRiscoDTO> pesoEventoRiscosToPesoEventoRiscoDTOs(List<PesoEventoRisco> pesoEventoRiscos) {

        if ( pesoEventoRiscos == null ) {

            return null;
        }

        List<PesoEventoRiscoDTO> list = new ArrayList<PesoEventoRiscoDTO>();

        for ( PesoEventoRisco pesoEventoRisco : pesoEventoRiscos ) {

            list.add( pesoEventoRiscoToPesoEventoRiscoDTO( pesoEventoRisco ) );
        }

        return list;
    }

    @Override

    public PesoEventoRisco pesoEventoRiscoDTOToPesoEventoRisco(PesoEventoRiscoDTO pesoEventoRiscoDTO) {

        if ( pesoEventoRiscoDTO == null ) {

            return null;
        }

        PesoEventoRisco pesoEventoRisco = new PesoEventoRisco();

        pesoEventoRisco.setExcluido( pesoEventoRiscoDTO.isExcluido() );

        pesoEventoRisco.setId( pesoEventoRiscoDTO.getId() );

        pesoEventoRisco.setPeso( pesoEventoRiscoDTO.getPeso() );

        return pesoEventoRisco;
    }

    @Override

    public List<PesoEventoRisco> pesoEventoRiscoDTOsToPesoEventoRiscos(List<PesoEventoRiscoDTO> pesoEventoRiscoDTOs) {

        if ( pesoEventoRiscoDTOs == null ) {

            return null;
        }

        List<PesoEventoRisco> list = new ArrayList<PesoEventoRisco>();

        for ( PesoEventoRiscoDTO pesoEventoRiscoDTO : pesoEventoRiscoDTOs ) {

            list.add( pesoEventoRiscoDTOToPesoEventoRisco( pesoEventoRiscoDTO ) );
        }

        return list;
    }
}

