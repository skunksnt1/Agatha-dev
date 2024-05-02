package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Acompanhamento;

import br.gov.mpog.gestaoriscos.modelo.ArquivoAnexo;

import br.gov.mpog.gestaoriscos.modelo.PlanoControle;

import br.gov.mpog.gestaoriscos.modelo.dto.AcompanhamentoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.ArquivoAnexoDTO;

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

public class AcompanhamentoMapperImpl implements AcompanhamentoMapper {

    @Autowired

    private ArquivoAnexoMapper arquivoAnexoMapper;

    @Override

    public List<Acompanhamento> toEntity(List<AcompanhamentoDTO> dtoList) {

        if ( dtoList == null ) {

            return null;
        }

        List<Acompanhamento> list = new ArrayList<Acompanhamento>();

        for ( AcompanhamentoDTO acompanhamentoDTO : dtoList ) {

            list.add( toEntity( acompanhamentoDTO ) );
        }

        return list;
    }

    @Override

    public List<AcompanhamentoDTO> toDto(List<Acompanhamento> entityList) {

        if ( entityList == null ) {

            return null;
        }

        List<AcompanhamentoDTO> list = new ArrayList<AcompanhamentoDTO>();

        for ( Acompanhamento acompanhamento : entityList ) {

            list.add( toDto( acompanhamento ) );
        }

        return list;
    }

    @Override

    public Acompanhamento toEntity(AcompanhamentoDTO acompanhamentoDTO) {

        if ( acompanhamentoDTO == null ) {

            return null;
        }

        Acompanhamento acompanhamento_ = new Acompanhamento();

        PlanoControle planoControle = new PlanoControle();

        acompanhamento_.setPlanoControle( planoControle );

        planoControle.setId( acompanhamentoDTO.getPlanoControleId() );

        acompanhamento_.setExcluido( acompanhamentoDTO.isExcluido() );

        acompanhamento_.setId( acompanhamentoDTO.getId() );

        acompanhamento_.setDtCadastro( acompanhamentoDTO.getDtCadastro() );

        acompanhamento_.setStatus( acompanhamentoDTO.getStatus() );

        acompanhamento_.setImplementado( acompanhamentoDTO.getImplementado() );

        acompanhamento_.setJustificativa( acompanhamentoDTO.getJustificativa() );

        List<ArquivoAnexo> list = arquivoAnexoMapper.arquivoAnexoDTOsToArquivoAnexos( acompanhamentoDTO.getAnexos() );

        if ( list != null ) {

            acompanhamento_.setAnexos( list );
        }

        return acompanhamento_;
    }

    @Override

    public AcompanhamentoDTO toDto(Acompanhamento acompanhamento) {

        if ( acompanhamento == null ) {

            return null;
        }

        AcompanhamentoDTO acompanhamentoDTO_ = new AcompanhamentoDTO();

        acompanhamentoDTO_.setPlanoControleId( acompanhamentoPlanoControleId( acompanhamento ) );

        acompanhamentoDTO_.setId( acompanhamento.getId() );

        acompanhamentoDTO_.setExcluido( acompanhamento.isExcluido() );

        acompanhamentoDTO_.setStatus( acompanhamento.getStatus() );

        acompanhamentoDTO_.setDtCadastro( acompanhamento.getDtCadastro() );

        acompanhamentoDTO_.setJustificativa( acompanhamento.getJustificativa() );

        acompanhamentoDTO_.setImplementado( acompanhamento.getImplementado() );

        List<ArquivoAnexoDTO> list = arquivoAnexoMapper.arquivoAnexosToArquivoAnexoDTOs( acompanhamento.getAnexos() );

        if ( list != null ) {

            acompanhamentoDTO_.setAnexos( list );
        }

        return acompanhamentoDTO_;
    }

    private Long acompanhamentoPlanoControleId(Acompanhamento acompanhamento) {

        if ( acompanhamento == null ) {

            return null;
        }

        PlanoControle planoControle = acompanhamento.getPlanoControle();

        if ( planoControle == null ) {

            return null;
        }

        Long id = planoControle.getId();

        if ( id == null ) {

            return null;
        }

        return id;
    }
}

