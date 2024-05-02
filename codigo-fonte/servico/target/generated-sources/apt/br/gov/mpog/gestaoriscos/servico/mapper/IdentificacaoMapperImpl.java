package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Identificacao;

import br.gov.mpog.gestaoriscos.modelo.dto.IdentificacaoDTO;

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

public class IdentificacaoMapperImpl implements IdentificacaoMapper {

    @Override

    public IdentificacaoDTO identificacaoToIdentificacaoDTO(Identificacao identificacao) {

        if ( identificacao == null ) {

            return null;
        }

        IdentificacaoDTO identificacaoDTO = new IdentificacaoDTO();

        identificacaoDTO.setId( identificacao.getId() );

        identificacaoDTO.setExcluido( identificacao.isExcluido() );

        return identificacaoDTO;
    }

    @Override

    public List<IdentificacaoDTO> identificacaosToIdentificacaoDTOs(List<Identificacao> identificacaos) {

        if ( identificacaos == null ) {

            return null;
        }

        List<IdentificacaoDTO> list = new ArrayList<IdentificacaoDTO>();

        for ( Identificacao identificacao : identificacaos ) {

            list.add( identificacaoToIdentificacaoDTO( identificacao ) );
        }

        return list;
    }

    @Override

    public Identificacao identificacaoDTOToIdentificacao(IdentificacaoDTO identificacaoDTO) {

        if ( identificacaoDTO == null ) {

            return null;
        }

        Identificacao identificacao = new Identificacao();

        identificacao.setExcluido( identificacaoDTO.isExcluido() );

        identificacao.setId( identificacaoDTO.getId() );

        return identificacao;
    }

    @Override

    public List<Identificacao> identificacaoDTOsToIdentificacaos(List<IdentificacaoDTO> identificacaoDTOs) {

        if ( identificacaoDTOs == null ) {

            return null;
        }

        List<Identificacao> list = new ArrayList<Identificacao>();

        for ( IdentificacaoDTO identificacaoDTO : identificacaoDTOs ) {

            list.add( identificacaoDTOToIdentificacao( identificacaoDTO ) );
        }

        return list;
    }
}

