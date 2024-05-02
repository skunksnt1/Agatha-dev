package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.NaturezaJuridica;

import br.gov.mpog.gestaoriscos.modelo.dto.NaturezaJuridicaDTO;

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

public class NaturezaJuridicaMapperImpl implements NaturezaJuridicaMapper {

    @Override

    public NaturezaJuridicaDTO naturezaJuridicaToNaturezaJuridicaDTO(NaturezaJuridica naturezaJuridica) {

        if ( naturezaJuridica == null ) {

            return null;
        }

        NaturezaJuridicaDTO naturezaJuridicaDTO = new NaturezaJuridicaDTO();

        naturezaJuridicaDTO.setId( naturezaJuridica.getId() );

        naturezaJuridicaDTO.setNome( naturezaJuridica.getNome() );

        return naturezaJuridicaDTO;
    }

    @Override

    public List<NaturezaJuridicaDTO> naturezaJuridicasToNaturezaJuridicaDTOs(List<NaturezaJuridica> naturezaJuridicas) {

        if ( naturezaJuridicas == null ) {

            return null;
        }

        List<NaturezaJuridicaDTO> list = new ArrayList<NaturezaJuridicaDTO>();

        for ( NaturezaJuridica naturezaJuridica : naturezaJuridicas ) {

            list.add( naturezaJuridicaToNaturezaJuridicaDTO( naturezaJuridica ) );
        }

        return list;
    }

    @Override

    public NaturezaJuridica naturezaJuridicaDTOToNaturezaJuridica(NaturezaJuridicaDTO naturezaJuridicaDTO) {

        if ( naturezaJuridicaDTO == null ) {

            return null;
        }

        NaturezaJuridica naturezaJuridica = new NaturezaJuridica();

        naturezaJuridica.setId( naturezaJuridicaDTO.getId() );

        naturezaJuridica.setNome( naturezaJuridicaDTO.getNome() );

        return naturezaJuridica;
    }

    @Override

    public List<NaturezaJuridica> naturezaJuridicaDTOsToNaturezaJuridicas(List<NaturezaJuridicaDTO> naturezaJuridicaDTOs) {

        if ( naturezaJuridicaDTOs == null ) {

            return null;
        }

        List<NaturezaJuridica> list = new ArrayList<NaturezaJuridica>();

        for ( NaturezaJuridicaDTO naturezaJuridicaDTO : naturezaJuridicaDTOs ) {

            list.add( naturezaJuridicaDTOToNaturezaJuridica( naturezaJuridicaDTO ) );
        }

        return list;
    }
}

