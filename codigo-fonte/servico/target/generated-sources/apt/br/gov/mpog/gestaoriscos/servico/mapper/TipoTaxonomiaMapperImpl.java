package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.TipoTaxonomia;

import br.gov.mpog.gestaoriscos.modelo.dto.TipoTaxonomiaDTO;

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

public class TipoTaxonomiaMapperImpl implements TipoTaxonomiaMapper {

    @Override

    public TipoTaxonomiaDTO tipoTaxonomiaToTipoTaxonomiaDTO(TipoTaxonomia tipoTaxonomia) {

        if ( tipoTaxonomia == null ) {

            return null;
        }

        TipoTaxonomiaDTO tipoTaxonomiaDTO = new TipoTaxonomiaDTO();

        tipoTaxonomiaDTO.setId( tipoTaxonomia.getId() );

        tipoTaxonomiaDTO.setExcluido( tipoTaxonomia.isExcluido() );

        tipoTaxonomiaDTO.setNome( tipoTaxonomia.getNome() );

        return tipoTaxonomiaDTO;
    }

    @Override

    public List<TipoTaxonomiaDTO> tipoTaxonomiasToTipoTaxonomiaDTOs(List<TipoTaxonomia> tipoTaxonomias) {

        if ( tipoTaxonomias == null ) {

            return null;
        }

        List<TipoTaxonomiaDTO> list = new ArrayList<TipoTaxonomiaDTO>();

        for ( TipoTaxonomia tipoTaxonomia : tipoTaxonomias ) {

            list.add( tipoTaxonomiaToTipoTaxonomiaDTO( tipoTaxonomia ) );
        }

        return list;
    }

    @Override

    public TipoTaxonomia tipoTaxonomiaDTOToTipoTaxonomia(TipoTaxonomiaDTO tipoTaxonomiaDTO) {

        if ( tipoTaxonomiaDTO == null ) {

            return null;
        }

        TipoTaxonomia tipoTaxonomia = new TipoTaxonomia();

        tipoTaxonomia.setExcluido( tipoTaxonomiaDTO.isExcluido() );

        tipoTaxonomia.setNome( tipoTaxonomiaDTO.getNome() );

        tipoTaxonomia.setId( tipoTaxonomiaDTO.getId() );

        return tipoTaxonomia;
    }

    @Override

    public List<TipoTaxonomia> tipoTaxonomiaDTOsToTipoTaxonomias(List<TipoTaxonomiaDTO> tipoTaxonomiaDTOs) {

        if ( tipoTaxonomiaDTOs == null ) {

            return null;
        }

        List<TipoTaxonomia> list = new ArrayList<TipoTaxonomia>();

        for ( TipoTaxonomiaDTO tipoTaxonomiaDTO : tipoTaxonomiaDTOs ) {

            list.add( tipoTaxonomiaDTOToTipoTaxonomia( tipoTaxonomiaDTO ) );
        }

        return list;
    }
}

