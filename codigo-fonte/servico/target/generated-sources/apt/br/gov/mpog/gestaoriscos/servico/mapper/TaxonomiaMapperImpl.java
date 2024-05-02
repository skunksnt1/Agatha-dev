package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Taxonomia;

import br.gov.mpog.gestaoriscos.modelo.dto.TaxonomiaDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:22-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class TaxonomiaMapperImpl implements TaxonomiaMapper {

    @Autowired

    private TipoTaxonomiaMapper tipoTaxonomiaMapper;

    @Autowired

    private StatusTaxonomiaMapper statusTaxonomiaMapper;

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Autowired

    private EventoMapper eventoMapper;

    @Autowired

    private CausaMapper causaMapper;

    @Autowired

    private ConsequenciaMapper consequenciaMapper;

    @Autowired

    private ControleMapper controleMapper;

    @Override

    public TaxonomiaDTO taxonomiaToTaxonomiaDTO(Taxonomia taxonomia) {

        if ( taxonomia == null ) {

            return null;
        }

        TaxonomiaDTO taxonomiaDTO = new TaxonomiaDTO();

        taxonomiaDTO.setExcluido( taxonomia.isExcluido() );

        taxonomiaDTO.setId( taxonomia.getId() );

        taxonomiaDTO.setDescricao( taxonomia.getDescricao() );

        taxonomiaDTO.setSearch( taxonomia.getSearch() );

        taxonomiaDTO.setDtCadastro( taxonomia.getDtCadastro() );

        taxonomiaDTO.setJustificativa( taxonomia.getJustificativa() );

        taxonomiaDTO.setTipo( tipoTaxonomiaMapper.tipoTaxonomiaToTipoTaxonomiaDTO( taxonomia.getTipo() ) );

        taxonomiaDTO.setStatus( statusTaxonomiaMapper.statusTaxonomiaToStatusTaxonomiaDTO( taxonomia.getStatus() ) );

        taxonomiaDTO.setOrgao( orgaoMapper.orgaoToOrgaoDTO( taxonomia.getOrgao() ) );

        taxonomiaDTO.setEvento( eventoMapper.eventoToEventoDTO( taxonomia.getEvento() ) );

        taxonomiaDTO.setCausa( causaMapper.causaToCausaDTO( taxonomia.getCausa() ) );

        taxonomiaDTO.setConsequencia( consequenciaMapper.consequenciaToConsequenciaDTO( taxonomia.getConsequencia() ) );

        taxonomiaDTO.setControle( controleMapper.controleToControleDTO( taxonomia.getControle() ) );

        return taxonomiaDTO;
    }

    @Override

    public List<TaxonomiaDTO> taxonomiasToTaxonomiaDTOs(List<Taxonomia> taxonomias) {

        if ( taxonomias == null ) {

            return null;
        }

        List<TaxonomiaDTO> list = new ArrayList<TaxonomiaDTO>();

        for ( Taxonomia taxonomia : taxonomias ) {

            list.add( taxonomiaToTaxonomiaDTO( taxonomia ) );
        }

        return list;
    }

    @Override

    public Taxonomia taxonomiaDTOToTaxonomia(TaxonomiaDTO taxonomiaDTO) {

        if ( taxonomiaDTO == null ) {

            return null;
        }

        Taxonomia taxonomia = new Taxonomia();

        taxonomia.setExcluido( taxonomiaDTO.isExcluido() );

        taxonomia.setId( taxonomiaDTO.getId() );

        taxonomia.setDescricao( taxonomiaDTO.getDescricao() );

        taxonomia.setSearch( taxonomiaDTO.getSearch() );

        taxonomia.setDtCadastro( taxonomiaDTO.getDtCadastro() );

        taxonomia.setJustificativa( taxonomiaDTO.getJustificativa() );

        taxonomia.setTipo( tipoTaxonomiaMapper.tipoTaxonomiaDTOToTipoTaxonomia( taxonomiaDTO.getTipo() ) );

        taxonomia.setStatus( statusTaxonomiaMapper.statusTaxonomiaDTOToStatusTaxonomia( taxonomiaDTO.getStatus() ) );

        taxonomia.setOrgao( orgaoMapper.orgaoDTOToOrgao( taxonomiaDTO.getOrgao() ) );

        taxonomia.setEvento( eventoMapper.eventoDTOToEvento( taxonomiaDTO.getEvento() ) );

        taxonomia.setCausa( causaMapper.causaDTOToCausa( taxonomiaDTO.getCausa() ) );

        taxonomia.setConsequencia( consequenciaMapper.consequenciaDTOToConsequencia( taxonomiaDTO.getConsequencia() ) );

        taxonomia.setControle( controleMapper.controleDTOToControle( taxonomiaDTO.getControle() ) );

        return taxonomia;
    }

    @Override

    public List<Taxonomia> taxonomiaDTOsToTaxonomias(List<TaxonomiaDTO> taxonomiaDTOs) {

        if ( taxonomiaDTOs == null ) {

            return null;
        }

        List<Taxonomia> list = new ArrayList<Taxonomia>();

        for ( TaxonomiaDTO taxonomiaDTO : taxonomiaDTOs ) {

            list.add( taxonomiaDTOToTaxonomia( taxonomiaDTO ) );
        }

        return list;
    }
}

