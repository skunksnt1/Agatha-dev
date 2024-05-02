package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.StatusTaxonomia;

import br.gov.mpog.gestaoriscos.modelo.dto.StatusTaxonomiaDTO;

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

public class StatusTaxonomiaMapperImpl implements StatusTaxonomiaMapper {

    @Override

    public StatusTaxonomiaDTO statusTaxonomiaToStatusTaxonomiaDTO(StatusTaxonomia statusTaxonomia) {

        if ( statusTaxonomia == null ) {

            return null;
        }

        StatusTaxonomiaDTO statusTaxonomiaDTO = new StatusTaxonomiaDTO();

        statusTaxonomiaDTO.setId( statusTaxonomia.getId() );

        statusTaxonomiaDTO.setExcluido( statusTaxonomia.isExcluido() );

        statusTaxonomiaDTO.setNome( statusTaxonomia.getNome() );

        return statusTaxonomiaDTO;
    }

    @Override

    public List<StatusTaxonomiaDTO> statusTaxonomiasToStatusTaxonomiaDTOs(List<StatusTaxonomia> statusTaxonomias) {

        if ( statusTaxonomias == null ) {

            return null;
        }

        List<StatusTaxonomiaDTO> list = new ArrayList<StatusTaxonomiaDTO>();

        for ( StatusTaxonomia statusTaxonomia : statusTaxonomias ) {

            list.add( statusTaxonomiaToStatusTaxonomiaDTO( statusTaxonomia ) );
        }

        return list;
    }

    @Override

    public StatusTaxonomia statusTaxonomiaDTOToStatusTaxonomia(StatusTaxonomiaDTO statusTaxonomiaDTO) {

        if ( statusTaxonomiaDTO == null ) {

            return null;
        }

        StatusTaxonomia statusTaxonomia = new StatusTaxonomia();

        statusTaxonomia.setExcluido( statusTaxonomiaDTO.isExcluido() );

        statusTaxonomia.setNome( statusTaxonomiaDTO.getNome() );

        statusTaxonomia.setId( statusTaxonomiaDTO.getId() );

        return statusTaxonomia;
    }

    @Override

    public List<StatusTaxonomia> statusTaxonomiaDTOsToStatusTaxonomias(List<StatusTaxonomiaDTO> statusTaxonomiaDTOs) {

        if ( statusTaxonomiaDTOs == null ) {

            return null;
        }

        List<StatusTaxonomia> list = new ArrayList<StatusTaxonomia>();

        for ( StatusTaxonomiaDTO statusTaxonomiaDTO : statusTaxonomiaDTOs ) {

            list.add( statusTaxonomiaDTOToStatusTaxonomia( statusTaxonomiaDTO ) );
        }

        return list;
    }
}

