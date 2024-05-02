package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.RespostaRisco;

import br.gov.mpog.gestaoriscos.modelo.dto.RespostaRiscoDTO;

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

public class RespostaRiscoMapperImpl implements RespostaRiscoMapper {

    @Override

    public RespostaRiscoDTO respostaRiscoToRespostaRiscoDTO(RespostaRisco respostaRisco) {

        if ( respostaRisco == null ) {

            return null;
        }

        RespostaRiscoDTO respostaRiscoDTO = new RespostaRiscoDTO();

        respostaRiscoDTO.setId( respostaRisco.getId() );

        respostaRiscoDTO.setExcluido( respostaRisco.isExcluido() );

        respostaRiscoDTO.setNome( respostaRisco.getNome() );

        return respostaRiscoDTO;
    }

    @Override

    public List<RespostaRiscoDTO> respostaRiscosToRespostaRiscoDTOs(List<RespostaRisco> respostaRiscos) {

        if ( respostaRiscos == null ) {

            return null;
        }

        List<RespostaRiscoDTO> list = new ArrayList<RespostaRiscoDTO>();

        for ( RespostaRisco respostaRisco : respostaRiscos ) {

            list.add( respostaRiscoToRespostaRiscoDTO( respostaRisco ) );
        }

        return list;
    }

    @Override

    public RespostaRisco respostaRiscoDTOToRespostaRisco(RespostaRiscoDTO respostaRiscoDTO) {

        if ( respostaRiscoDTO == null ) {

            return null;
        }

        RespostaRisco respostaRisco = new RespostaRisco();

        respostaRisco.setExcluido( respostaRiscoDTO.isExcluido() );

        respostaRisco.setNome( respostaRiscoDTO.getNome() );

        respostaRisco.setId( respostaRiscoDTO.getId() );

        return respostaRisco;
    }

    @Override

    public List<RespostaRisco> respostaRiscoDTOsToRespostaRiscos(List<RespostaRiscoDTO> respostaRiscoDTOS) {

        if ( respostaRiscoDTOS == null ) {

            return null;
        }

        List<RespostaRisco> list = new ArrayList<RespostaRisco>();

        for ( RespostaRiscoDTO respostaRiscoDTO : respostaRiscoDTOS ) {

            list.add( respostaRiscoDTOToRespostaRisco( respostaRiscoDTO ) );
        }

        return list;
    }
}

