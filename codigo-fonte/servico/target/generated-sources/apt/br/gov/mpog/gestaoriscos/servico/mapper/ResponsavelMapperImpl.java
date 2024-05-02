package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Responsavel;

import br.gov.mpog.gestaoriscos.modelo.dto.ResponsavelDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class ResponsavelMapperImpl implements ResponsavelMapper {

    @Autowired

    private UsuarioMapper usuarioMapper;

    @Override

    public ResponsavelDTO responsavelToResponsavelDTO(Responsavel responsavel) {

        if ( responsavel == null ) {

            return null;
        }

        ResponsavelDTO responsavelDTO = new ResponsavelDTO();

        responsavelDTO.setId( responsavel.getId() );

        responsavelDTO.setUsuario( usuarioMapper.usuarioToUsuarioDTO( responsavel.getUsuario() ) );

        responsavelDTO.setExcluido( responsavel.isExcluido() );

        return responsavelDTO;
    }

    @Override

    public List<ResponsavelDTO> responsavelToResponsavelDTOs(List<Responsavel> responsavel) {

        if ( responsavel == null ) {

            return null;
        }

        List<ResponsavelDTO> list = new ArrayList<ResponsavelDTO>();

        for ( Responsavel responsavel_ : responsavel ) {

            list.add( responsavelToResponsavelDTO( responsavel_ ) );
        }

        return list;
    }

    @Override

    public Responsavel responsavelDTOToResponsavel(ResponsavelDTO responsavelDTO) {

        if ( responsavelDTO == null ) {

            return null;
        }

        Responsavel responsavel = new Responsavel();

        responsavel.setId( responsavelDTO.getId() );

        responsavel.setExcluido( responsavelDTO.isExcluido() );

        responsavel.setUsuario( usuarioMapper.usuarioDTOToUsuario( responsavelDTO.getUsuario() ) );

        return responsavel;
    }

    @Override

    public List<Responsavel> responsavelDTOsToResponsavels(List<ResponsavelDTO> responsavelDTOs) {

        if ( responsavelDTOs == null ) {

            return null;
        }

        List<Responsavel> list = new ArrayList<Responsavel>();

        for ( ResponsavelDTO responsavelDTO : responsavelDTOs ) {

            list.add( responsavelDTOToResponsavel( responsavelDTO ) );
        }

        return list;
    }
}

