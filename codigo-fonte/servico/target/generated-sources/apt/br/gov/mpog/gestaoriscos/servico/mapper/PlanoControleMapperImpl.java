package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.PlanoControle;

import br.gov.mpog.gestaoriscos.modelo.dto.PlanoControleDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:19-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class PlanoControleMapperImpl implements PlanoControleMapper {

    @Autowired

    private ControleMapper controleMapper;

    @Autowired

    private TipoControleMapper tipoControleMapper;

    @Autowired

    private ObjetivoControleMapper objetivoControleMapper;

    @Autowired

    private EventoRiscoMapper eventoRiscoMapper;

    @Override

    public PlanoControleDTO planoControleToPlanoControleDTO(PlanoControle planoControle) {

        if ( planoControle == null ) {

            return null;
        }

        PlanoControleDTO planoControleDTO = new PlanoControleDTO();

        planoControleDTO.setId( planoControle.getId() );

        planoControleDTO.setExcluido( planoControle.isExcluido() );

        planoControleDTO.setControle( controleMapper.controleToControleDTO( planoControle.getControle() ) );

        planoControleDTO.setTipoControle( tipoControleMapper.tipoControleToTipoControleDTO( planoControle.getTipoControle() ) );

        planoControleDTO.setObjetivo( objetivoControleMapper.objetivoControleToObjetivoControleDTO( planoControle.getObjetivo() ) );

        planoControleDTO.setAreaResponsavel( planoControle.getAreaResponsavel() );

        planoControleDTO.setResponsavel( planoControle.getResponsavel() );

        planoControleDTO.setInterveniente( planoControle.getInterveniente() );

        planoControleDTO.setImplementacao( planoControle.getImplementacao() );

        planoControleDTO.setDtInicio( planoControle.getDtInicio() );

        planoControleDTO.setDtConclusao( planoControle.getDtConclusao() );

        return planoControleDTO;
    }

    @Override

    public List<PlanoControleDTO> planoControlesToPlanoControleDTOs(List<PlanoControle> planoControles) {

        if ( planoControles == null ) {

            return null;
        }

        List<PlanoControleDTO> list = new ArrayList<PlanoControleDTO>();

        for ( PlanoControle planoControle : planoControles ) {

            list.add( planoControleToPlanoControleDTO( planoControle ) );
        }

        return list;
    }

    @Override

    public PlanoControle planoControleDTOToPlanoControle(PlanoControleDTO planoControleDTO) {

        if ( planoControleDTO == null ) {

            return null;
        }

        PlanoControle planoControle = new PlanoControle();

        planoControle.setExcluido( planoControleDTO.isExcluido() );

        planoControle.setEventoRisco( eventoRiscoMapper.eventoRiscoDTOToEventoRisco( planoControleDTO.getEventoRisco() ) );

        planoControle.setId( planoControleDTO.getId() );

        planoControle.setControle( controleMapper.controleDTOToControle( planoControleDTO.getControle() ) );

        planoControle.setTipoControle( tipoControleMapper.tipoControleDTOToTipoControle( planoControleDTO.getTipoControle() ) );

        planoControle.setObjetivo( objetivoControleMapper.objetivoControleDTOToObjetivoControle( planoControleDTO.getObjetivo() ) );

        planoControle.setAreaResponsavel( planoControleDTO.getAreaResponsavel() );

        planoControle.setResponsavel( planoControleDTO.getResponsavel() );

        planoControle.setInterveniente( planoControleDTO.getInterveniente() );

        planoControle.setImplementacao( planoControleDTO.getImplementacao() );

        planoControle.setDtInicio( planoControleDTO.getDtInicio() );

        planoControle.setDtConclusao( planoControleDTO.getDtConclusao() );

        return planoControle;
    }

    @Override

    public List<PlanoControle> planoControleDTOsToPlanoControles(List<PlanoControleDTO> planoControleDTOS) {

        if ( planoControleDTOS == null ) {

            return null;
        }

        List<PlanoControle> list = new ArrayList<PlanoControle>();

        for ( PlanoControleDTO planoControleDTO : planoControleDTOS ) {

            list.add( planoControleDTOToPlanoControle( planoControleDTO ) );
        }

        return list;
    }
}

