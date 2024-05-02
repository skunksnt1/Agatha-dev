package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Perfil;

import br.gov.mpog.gestaoriscos.modelo.dto.PerfilDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:22-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class PerfilMapperImpl implements PerfilMapper {

    @Override

    public PerfilDTO perfilToPerfilDTO(Perfil perfil) {

        if ( perfil == null ) {

            return null;
        }

        PerfilDTO perfilDTO = new PerfilDTO();

        perfilDTO.setId( perfil.getId() );

        perfilDTO.setNome( perfil.getNome() );

        perfilDTO.setPrioridade( perfil.getPrioridade() );

        return perfilDTO;
    }

    @Override

    public List<PerfilDTO> perfilsToPerfilDTOs(List<Perfil> perfils) {

        if ( perfils == null ) {

            return null;
        }

        List<PerfilDTO> list = new ArrayList<PerfilDTO>();

        for ( Perfil perfil : perfils ) {

            list.add( perfilToPerfilDTO( perfil ) );
        }

        return list;
    }

    @Override

    public Perfil perfilDTOToPerfil(PerfilDTO perfilDTO) {

        if ( perfilDTO == null ) {

            return null;
        }

        Perfil perfil = new Perfil();

        perfil.setId( perfilDTO.getId() );

        perfil.setNome( perfilDTO.getNome() );

        perfil.setPrioridade( perfilDTO.getPrioridade() );

        return perfil;
    }

    @Override

    public List<Perfil> perfilDTOsToPerfils(List<PerfilDTO> perfilDTOs) {

        if ( perfilDTOs == null ) {

            return null;
        }

        List<Perfil> list = new ArrayList<Perfil>();

        for ( PerfilDTO perfilDTO : perfilDTOs ) {

            list.add( perfilDTOToPerfil( perfilDTO ) );
        }

        return list;
    }
}

