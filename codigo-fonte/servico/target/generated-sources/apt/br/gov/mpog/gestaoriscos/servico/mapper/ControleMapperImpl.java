package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Controle;

import br.gov.mpog.gestaoriscos.modelo.dto.ControleDTO;

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

public class ControleMapperImpl implements ControleMapper {

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Override

    public ControleDTO controleToControleDTO(Controle controle) {

        if ( controle == null ) {

            return null;
        }

        ControleDTO controleDTO = new ControleDTO();

        controleDTO.setId( controle.getId() );

        controleDTO.setExcluido( controle.isExcluido() );

        controleDTO.setDescricao( controle.getDescricao() );

        controleDTO.setSearch( controle.getSearch() );

        controleDTO.setStatus( controle.isStatus() );

        return controleDTO;
    }

    @Override

    public List<ControleDTO> controlesToControleDTOs(List<Controle> controles) {

        if ( controles == null ) {

            return null;
        }

        List<ControleDTO> list = new ArrayList<ControleDTO>();

        for ( Controle controle : controles ) {

            list.add( controleToControleDTO( controle ) );
        }

        return list;
    }

    @Override

    public Controle controleDTOToControle(ControleDTO controleDTO) {

        if ( controleDTO == null ) {

            return null;
        }

        Controle controle = new Controle();

        controle.setExcluido( controleDTO.isExcluido() );

        controle.setDescricao( controleDTO.getDescricao() );

        controle.setStatus( controleDTO.isStatus() );

        controle.setSearch( controleDTO.getSearch() );

        controle.setOrgao( orgaoMapper.orgaoDTOToOrgao( controleDTO.getOrgao() ) );

        controle.setId( controleDTO.getId() );

        return controle;
    }

    @Override

    public List<Controle> controleDTOsToControles(List<ControleDTO> controleDTOs) {

        if ( controleDTOs == null ) {

            return null;
        }

        List<Controle> list = new ArrayList<Controle>();

        for ( ControleDTO controleDTO : controleDTOs ) {

            list.add( controleDTOToControle( controleDTO ) );
        }

        return list;
    }
}

