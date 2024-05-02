package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.AgrupamentoTaxonomia;

import br.gov.mpog.gestaoriscos.modelo.Taxonomia;

import br.gov.mpog.gestaoriscos.modelo.dto.AgrupamentoTaxonomiaDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.TaxonomiaDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:21-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class AgrupamentoTaxonomiaMapperImpl implements AgrupamentoTaxonomiaMapper {

    @Autowired

    private TaxonomiaMapper taxonomiaMapper;

    @Override

    public AgrupamentoTaxonomiaDTO agrupamentoTaxonomiaToAgrupamentoTaxonomiaDTO(AgrupamentoTaxonomia agrupamentoTaxonomia) {

        if ( agrupamentoTaxonomia == null ) {

            return null;
        }

        AgrupamentoTaxonomiaDTO agrupamentoTaxonomiaDTO = new AgrupamentoTaxonomiaDTO();

        agrupamentoTaxonomiaDTO.setId( agrupamentoTaxonomia.getId() );

        agrupamentoTaxonomiaDTO.setTaxonomia( taxonomiaMapper.taxonomiaToTaxonomiaDTO( agrupamentoTaxonomia.getTaxonomia() ) );

        agrupamentoTaxonomiaDTO.setExcluido( agrupamentoTaxonomia.isExcluido() );

        List<TaxonomiaDTO> list = taxonomiaMapper.taxonomiasToTaxonomiaDTOs( agrupamentoTaxonomia.getTaxonomias() );

        if ( list != null ) {

            agrupamentoTaxonomiaDTO.setTaxonomias( list );
        }

        return agrupamentoTaxonomiaDTO;
    }

    @Override

    public List<AgrupamentoTaxonomiaDTO> agrupamentoTaxonomiasToAgrupamentoTaxonomiaDTOs(List<AgrupamentoTaxonomia> agrupamentoTaxonomias) {

        if ( agrupamentoTaxonomias == null ) {

            return null;
        }

        List<AgrupamentoTaxonomiaDTO> list = new ArrayList<AgrupamentoTaxonomiaDTO>();

        for ( AgrupamentoTaxonomia agrupamentoTaxonomia : agrupamentoTaxonomias ) {

            list.add( agrupamentoTaxonomiaToAgrupamentoTaxonomiaDTO( agrupamentoTaxonomia ) );
        }

        return list;
    }

    @Override

    public AgrupamentoTaxonomia agrupamentoTaxonomiaDTOToAgrupamentoTaxonomia(AgrupamentoTaxonomiaDTO agrupamentoTaxonomiaDTO) {

        if ( agrupamentoTaxonomiaDTO == null ) {

            return null;
        }

        AgrupamentoTaxonomia agrupamentoTaxonomia = new AgrupamentoTaxonomia();

        agrupamentoTaxonomia.setId( agrupamentoTaxonomiaDTO.getId() );

        agrupamentoTaxonomia.setExcluido( agrupamentoTaxonomiaDTO.isExcluido() );

        agrupamentoTaxonomia.setTaxonomia( taxonomiaMapper.taxonomiaDTOToTaxonomia( agrupamentoTaxonomiaDTO.getTaxonomia() ) );

        List<Taxonomia> list = taxonomiaMapper.taxonomiaDTOsToTaxonomias( agrupamentoTaxonomiaDTO.getTaxonomias() );

        if ( list != null ) {

            agrupamentoTaxonomia.setTaxonomias( list );
        }

        return agrupamentoTaxonomia;
    }

    @Override

    public List<AgrupamentoTaxonomia> agrupamentoTaxonomiaDTOsToAgrupamentoTaxonomias(List<AgrupamentoTaxonomiaDTO> agrupamentoTaxonomiaDTOs) {

        if ( agrupamentoTaxonomiaDTOs == null ) {

            return null;
        }

        List<AgrupamentoTaxonomia> list = new ArrayList<AgrupamentoTaxonomia>();

        for ( AgrupamentoTaxonomiaDTO agrupamentoTaxonomiaDTO : agrupamentoTaxonomiaDTOs ) {

            list.add( agrupamentoTaxonomiaDTOToAgrupamentoTaxonomia( agrupamentoTaxonomiaDTO ) );
        }

        return list;
    }
}

