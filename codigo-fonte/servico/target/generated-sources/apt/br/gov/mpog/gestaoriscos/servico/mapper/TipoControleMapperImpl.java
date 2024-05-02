package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.TipoControle;

import br.gov.mpog.gestaoriscos.modelo.dto.TipoControleDTO;

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

public class TipoControleMapperImpl implements TipoControleMapper {

    @Override

    public TipoControleDTO tipoControleToTipoControleDTO(TipoControle tipoControle) {

        if ( tipoControle == null ) {

            return null;
        }

        TipoControleDTO tipoControleDTO = new TipoControleDTO();

        tipoControleDTO.setId( tipoControle.getId() );

        tipoControleDTO.setExcluido( tipoControle.isExcluido() );

        tipoControleDTO.setNome( tipoControle.getNome() );

        return tipoControleDTO;
    }

    @Override

    public List<TipoControleDTO> tipoControlesToTipoControleDTOs(List<TipoControle> tipoControles) {

        if ( tipoControles == null ) {

            return null;
        }

        List<TipoControleDTO> list = new ArrayList<TipoControleDTO>();

        for ( TipoControle tipoControle : tipoControles ) {

            list.add( tipoControleToTipoControleDTO( tipoControle ) );
        }

        return list;
    }

    @Override

    public TipoControle tipoControleDTOToTipoControle(TipoControleDTO tipoControleDTO) {

        if ( tipoControleDTO == null ) {

            return null;
        }

        TipoControle tipoControle = new TipoControle();

        tipoControle.setExcluido( tipoControleDTO.isExcluido() );

        tipoControle.setNome( tipoControleDTO.getNome() );

        tipoControle.setId( tipoControleDTO.getId() );

        return tipoControle;
    }

    @Override

    public List<TipoControle> tipoControleDTOsToTipoControles(List<TipoControleDTO> tipoControleDTOs) {

        if ( tipoControleDTOs == null ) {

            return null;
        }

        List<TipoControle> list = new ArrayList<TipoControle>();

        for ( TipoControleDTO tipoControleDTO : tipoControleDTOs ) {

            list.add( tipoControleDTOToTipoControle( tipoControleDTO ) );
        }

        return list;
    }
}

