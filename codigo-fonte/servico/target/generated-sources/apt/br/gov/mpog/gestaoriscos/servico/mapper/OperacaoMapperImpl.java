package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Operacao;

import br.gov.mpog.gestaoriscos.modelo.dto.OperacaoDTO;

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

public class OperacaoMapperImpl implements OperacaoMapper {

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Override

    public OperacaoDTO operacaoToOperacaoDTO(Operacao operacao) {

        if ( operacao == null ) {

            return null;
        }

        OperacaoDTO operacaoDTO = new OperacaoDTO();

        operacaoDTO.setId( operacao.getId() );

        operacaoDTO.setExcluido( operacao.isExcluido() );

        operacaoDTO.setDescricao( operacao.getDescricao() );

        operacaoDTO.setSearch( operacao.getSearch() );

        operacaoDTO.setStatus( operacao.isStatus() );

        return operacaoDTO;
    }

    @Override

    public List<OperacaoDTO> operacaosToOperacaoDTOs(List<Operacao> operacaos) {

        if ( operacaos == null ) {

            return null;
        }

        List<OperacaoDTO> list = new ArrayList<OperacaoDTO>();

        for ( Operacao operacao : operacaos ) {

            list.add( operacaoToOperacaoDTO( operacao ) );
        }

        return list;
    }

    @Override

    public Operacao operacaoDTOToOperacao(OperacaoDTO operacaoDTO) {

        if ( operacaoDTO == null ) {

            return null;
        }

        Operacao operacao = new Operacao();

        operacao.setExcluido( operacaoDTO.isExcluido() );

        operacao.setDescricao( operacaoDTO.getDescricao() );

        operacao.setStatus( operacaoDTO.isStatus() );

        operacao.setSearch( operacaoDTO.getSearch() );

        operacao.setOrgao( orgaoMapper.orgaoDTOToOrgao( operacaoDTO.getOrgao() ) );

        operacao.setId( operacaoDTO.getId() );

        return operacao;
    }

    @Override

    public List<Operacao> operacaoDTOsToOperacaos(List<OperacaoDTO> operacaoDTOs) {

        if ( operacaoDTOs == null ) {

            return null;
        }

        List<Operacao> list = new ArrayList<Operacao>();

        for ( OperacaoDTO operacaoDTO : operacaoDTOs ) {

            list.add( operacaoDTOToOperacao( operacaoDTO ) );
        }

        return list;
    }
}

