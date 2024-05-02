package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.TipoMatriz;

import br.gov.mpog.gestaoriscos.modelo.dto.TipoMatrizDTO;

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

public class TipoMatrizMapperImpl implements TipoMatrizMapper {

    @Override

    public TipoMatrizDTO tipoMatrizToTipoMatrizDTO(TipoMatriz tipoMatriz) {

        if ( tipoMatriz == null ) {

            return null;
        }

        TipoMatrizDTO tipoMatrizDTO = new TipoMatrizDTO();

        tipoMatrizDTO.setId( tipoMatriz.getId() );

        tipoMatrizDTO.setExcluido( tipoMatriz.isExcluido() );

        tipoMatrizDTO.setNome( tipoMatriz.getNome() );

        return tipoMatrizDTO;
    }

    @Override

    public List<TipoMatrizDTO> tipoMatrizsToTipoMatrizDTOs(List<TipoMatriz> tipoMatrizs) {

        if ( tipoMatrizs == null ) {

            return null;
        }

        List<TipoMatrizDTO> list = new ArrayList<TipoMatrizDTO>();

        for ( TipoMatriz tipoMatriz : tipoMatrizs ) {

            list.add( tipoMatrizToTipoMatrizDTO( tipoMatriz ) );
        }

        return list;
    }

    @Override

    public TipoMatriz tipoMatrizDTOToTipoMatriz(TipoMatrizDTO tipoMatrizDTO) {

        if ( tipoMatrizDTO == null ) {

            return null;
        }

        TipoMatriz tipoMatriz = new TipoMatriz();

        tipoMatriz.setExcluido( tipoMatrizDTO.isExcluido() );

        tipoMatriz.setNome( tipoMatrizDTO.getNome() );

        tipoMatriz.setId( tipoMatrizDTO.getId() );

        return tipoMatriz;
    }

    @Override

    public List<TipoMatriz> tipoMatrizDTOsToTipoMatrizs(List<TipoMatrizDTO> tipoMatrizDTOs) {

        if ( tipoMatrizDTOs == null ) {

            return null;
        }

        List<TipoMatriz> list = new ArrayList<TipoMatriz>();

        for ( TipoMatrizDTO tipoMatrizDTO : tipoMatrizDTOs ) {

            list.add( tipoMatrizDTOToTipoMatriz( tipoMatrizDTO ) );
        }

        return list;
    }
}

