package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.ControleEvento;

import br.gov.mpog.gestaoriscos.modelo.dto.ControleEventoDTO;

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

public class ControleEventoMapperImpl implements ControleEventoMapper {

    @Autowired

    private ControleMapper controleMapper;

    @Autowired

    private DesenhoMapper desenhoMapper;

    @Autowired

    private OperacaoMapper operacaoMapper;

    @Override

    public ControleEventoDTO controleEventoToControleEventoDTO(ControleEvento controleEvento) {

        if ( controleEvento == null ) {

            return null;
        }

        ControleEventoDTO controleEventoDTO = new ControleEventoDTO();

        controleEventoDTO.setId( controleEvento.getId() );

        controleEventoDTO.setExcluido( controleEvento.isExcluido() );

        controleEventoDTO.setControle( controleMapper.controleToControleDTO( controleEvento.getControle() ) );

        controleEventoDTO.setDesenho( desenhoMapper.desenhoToDesenhoDTO( controleEvento.getDesenho() ) );

        controleEventoDTO.setOperacao( operacaoMapper.operacaoToOperacaoDTO( controleEvento.getOperacao() ) );

        return controleEventoDTO;
    }

    @Override

    public List<ControleEventoDTO> controleEventosToControleEventoDTOs(List<ControleEvento> controleEventos) {

        if ( controleEventos == null ) {

            return null;
        }

        List<ControleEventoDTO> list = new ArrayList<ControleEventoDTO>();

        for ( ControleEvento controleEvento : controleEventos ) {

            list.add( controleEventoToControleEventoDTO( controleEvento ) );
        }

        return list;
    }

    @Override

    public ControleEvento controleEventoDTOToControleEvento(ControleEventoDTO controleEventoDTO) {

        if ( controleEventoDTO == null ) {

            return null;
        }

        ControleEvento controleEvento = new ControleEvento();

        controleEvento.setExcluido( controleEventoDTO.isExcluido() );

        controleEvento.setId( controleEventoDTO.getId() );

        controleEvento.setControle( controleMapper.controleDTOToControle( controleEventoDTO.getControle() ) );

        controleEvento.setDesenho( desenhoMapper.desenhoDTOToDesenho( controleEventoDTO.getDesenho() ) );

        controleEvento.setOperacao( operacaoMapper.operacaoDTOToOperacao( controleEventoDTO.getOperacao() ) );

        return controleEvento;
    }

    @Override

    public List<ControleEvento> controleEventoDTOsToControleEventos(List<ControleEventoDTO> controleEventoDTOs) {

        if ( controleEventoDTOs == null ) {

            return null;
        }

        List<ControleEvento> list = new ArrayList<ControleEvento>();

        for ( ControleEventoDTO controleEventoDTO : controleEventoDTOs ) {

            list.add( controleEventoDTOToControleEvento( controleEventoDTO ) );
        }

        return list;
    }
}

