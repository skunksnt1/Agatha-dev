package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Avaliacao;

import br.gov.mpog.gestaoriscos.modelo.dto.AvaliacaoDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class AvaliacaoMapperImpl implements AvaliacaoMapper {

    @Override

    public AvaliacaoDTO avaliacaoToAvaliacaoDTO(Avaliacao avaliacao) {

        if ( avaliacao == null ) {

            return null;
        }

        AvaliacaoDTO avaliacaoDTO = new AvaliacaoDTO();

        avaliacaoDTO.setId( avaliacao.getId() );

        avaliacaoDTO.setExcluido( avaliacao.isExcluido() );

        avaliacaoDTO.setIgnorarRiscoInerente( avaliacao.getIgnorarRiscoInerente() );

        return avaliacaoDTO;
    }

    @Override

    public List<AvaliacaoDTO> avaliacaosToAvaliacaoDTOs(List<Avaliacao> avaliacaos) {

        if ( avaliacaos == null ) {

            return null;
        }

        List<AvaliacaoDTO> list = new ArrayList<AvaliacaoDTO>();

        for ( Avaliacao avaliacao : avaliacaos ) {

            list.add( avaliacaoToAvaliacaoDTO( avaliacao ) );
        }

        return list;
    }

    @Override

    public Avaliacao avaliacaoDTOToAvaliacao(AvaliacaoDTO avaliacaoDTO) {

        if ( avaliacaoDTO == null ) {

            return null;
        }

        Avaliacao avaliacao = new Avaliacao();

        avaliacao.setExcluido( avaliacaoDTO.isExcluido() );

        avaliacao.setId( avaliacaoDTO.getId() );

        avaliacao.setIgnorarRiscoInerente( avaliacaoDTO.getIgnorarRiscoInerente() );

        return avaliacao;
    }

    @Override

    public List<Avaliacao> avaliacaoDTOsToAvaliacaos(List<AvaliacaoDTO> avaliacaoDTOs) {

        if ( avaliacaoDTOs == null ) {

            return null;
        }

        List<Avaliacao> list = new ArrayList<Avaliacao>();

        for ( AvaliacaoDTO avaliacaoDTO : avaliacaoDTOs ) {

            list.add( avaliacaoDTOToAvaliacao( avaliacaoDTO ) );
        }

        return list;
    }
}

