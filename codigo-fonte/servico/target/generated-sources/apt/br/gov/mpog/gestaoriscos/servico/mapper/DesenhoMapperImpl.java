package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Desenho;

import br.gov.mpog.gestaoriscos.modelo.dto.DesenhoDTO;

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

public class DesenhoMapperImpl implements DesenhoMapper {

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Override

    public DesenhoDTO desenhoToDesenhoDTO(Desenho desenho) {

        if ( desenho == null ) {

            return null;
        }

        DesenhoDTO desenhoDTO = new DesenhoDTO();

        desenhoDTO.setId( desenho.getId() );

        desenhoDTO.setExcluido( desenho.isExcluido() );

        desenhoDTO.setDescricao( desenho.getDescricao() );

        desenhoDTO.setSearch( desenho.getSearch() );

        desenhoDTO.setStatus( desenho.isStatus() );

        return desenhoDTO;
    }

    @Override

    public List<DesenhoDTO> desenhosToDesenhoDTOs(List<Desenho> desenhos) {

        if ( desenhos == null ) {

            return null;
        }

        List<DesenhoDTO> list = new ArrayList<DesenhoDTO>();

        for ( Desenho desenho : desenhos ) {

            list.add( desenhoToDesenhoDTO( desenho ) );
        }

        return list;
    }

    @Override

    public Desenho desenhoDTOToDesenho(DesenhoDTO desenhoDTO) {

        if ( desenhoDTO == null ) {

            return null;
        }

        Desenho desenho = new Desenho();

        desenho.setExcluido( desenhoDTO.isExcluido() );

        desenho.setDescricao( desenhoDTO.getDescricao() );

        desenho.setStatus( desenhoDTO.isStatus() );

        desenho.setSearch( desenhoDTO.getSearch() );

        desenho.setOrgao( orgaoMapper.orgaoDTOToOrgao( desenhoDTO.getOrgao() ) );

        desenho.setId( desenhoDTO.getId() );

        return desenho;
    }

    @Override

    public List<Desenho> desenhoDTOsToDesenhos(List<DesenhoDTO> desenhoDTOs) {

        if ( desenhoDTOs == null ) {

            return null;
        }

        List<Desenho> list = new ArrayList<Desenho>();

        for ( DesenhoDTO desenhoDTO : desenhoDTOs ) {

            list.add( desenhoDTOToDesenho( desenhoDTO ) );
        }

        return list;
    }
}

