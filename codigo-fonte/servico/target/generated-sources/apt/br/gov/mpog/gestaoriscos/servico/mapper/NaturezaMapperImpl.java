package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Natureza;

import br.gov.mpog.gestaoriscos.modelo.dto.NaturezaDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:22-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class NaturezaMapperImpl implements NaturezaMapper {

    @Override

    public NaturezaDTO naturezaToNaturezaDTO(Natureza natureza) {

        if ( natureza == null ) {

            return null;
        }

        NaturezaDTO naturezaDTO = new NaturezaDTO();

        naturezaDTO.setId( natureza.getId() );

        naturezaDTO.setExcluido( natureza.isExcluido() );

        naturezaDTO.setDescricao( natureza.getDescricao() );

        naturezaDTO.setSearch( natureza.getSearch() );

        naturezaDTO.setStatus( natureza.isStatus() );

        return naturezaDTO;
    }

    @Override

    public List<NaturezaDTO> naturezasToNaturezaDTOs(List<Natureza> naturezas) {

        if ( naturezas == null ) {

            return null;
        }

        List<NaturezaDTO> list = new ArrayList<NaturezaDTO>();

        for ( Natureza natureza : naturezas ) {

            list.add( naturezaToNaturezaDTO( natureza ) );
        }

        return list;
    }

    @Override

    public Natureza naturezaDTOToNatureza(NaturezaDTO naturezaDTO) {

        if ( naturezaDTO == null ) {

            return null;
        }

        Natureza natureza = new Natureza();

        natureza.setExcluido( naturezaDTO.isExcluido() );

        natureza.setDescricao( naturezaDTO.getDescricao() );

        natureza.setStatus( naturezaDTO.isStatus() );

        natureza.setSearch( naturezaDTO.getSearch() );

        natureza.setId( naturezaDTO.getId() );

        return natureza;
    }

    @Override

    public List<Natureza> naturezaDTOsToNaturezas(List<NaturezaDTO> naturezaDTOs) {

        if ( naturezaDTOs == null ) {

            return null;
        }

        List<Natureza> list = new ArrayList<Natureza>();

        for ( NaturezaDTO naturezaDTO : naturezaDTOs ) {

            list.add( naturezaDTOToNatureza( naturezaDTO ) );
        }

        return list;
    }
}

