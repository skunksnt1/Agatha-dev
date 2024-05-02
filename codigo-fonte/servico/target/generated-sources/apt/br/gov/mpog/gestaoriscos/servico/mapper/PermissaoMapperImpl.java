package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Permissao;

import br.gov.mpog.gestaoriscos.modelo.Usuario;

import br.gov.mpog.gestaoriscos.modelo.dto.PermissaoDTO;

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

public class PermissaoMapperImpl implements PermissaoMapper {

    @Autowired

    private UsuarioMapper usuarioMapper;

    @Autowired

    private PerfilMapper perfilMapper;

    @Override

    public PermissaoDTO permissaoToPermissaoDTO(Permissao permissao) {

        if ( permissao == null ) {

            return null;
        }

        PermissaoDTO permissaoDTO = new PermissaoDTO();

        permissaoDTO.setUsuarioNome( permissaoUsuarioNome( permissao ) );

        permissaoDTO.setId( permissao.getId() );

        permissaoDTO.setPerfil( perfilMapper.perfilToPerfilDTO( permissao.getPerfil() ) );

        permissaoDTO.setExcluido( permissao.isExcluido() );

        permissaoDTO.setDtCadastro( permissao.getDtCadastro() );

        return permissaoDTO;
    }

    @Override

    public List<PermissaoDTO> permissaosToPermissaoDTOs(List<Permissao> permissaos) {

        if ( permissaos == null ) {

            return null;
        }

        List<PermissaoDTO> list = new ArrayList<PermissaoDTO>();

        for ( Permissao permissao : permissaos ) {

            list.add( permissaoToPermissaoDTO( permissao ) );
        }

        return list;
    }

    @Override

    public Permissao permissaoDTOToPermissao(PermissaoDTO permissaoDTO) {

        if ( permissaoDTO == null ) {

            return null;
        }

        Permissao permissao = new Permissao();

        permissao.setId( permissaoDTO.getId() );

        permissao.setUsuario( usuarioMapper.usuarioDTOToUsuario( permissaoDTO.getUsuario() ) );

        permissao.setPerfil( perfilMapper.perfilDTOToPerfil( permissaoDTO.getPerfil() ) );

        permissao.setExcluido( permissaoDTO.isExcluido() );

        permissao.setDtCadastro( permissaoDTO.getDtCadastro() );

        return permissao;
    }

    @Override

    public List<Permissao> permissaoDTOsToPermissaos(List<PermissaoDTO> permissaoDTOs) {

        if ( permissaoDTOs == null ) {

            return null;
        }

        List<Permissao> list = new ArrayList<Permissao>();

        for ( PermissaoDTO permissaoDTO : permissaoDTOs ) {

            list.add( permissaoDTOToPermissao( permissaoDTO ) );
        }

        return list;
    }

    private String permissaoUsuarioNome(Permissao permissao) {

        if ( permissao == null ) {

            return null;
        }

        Usuario usuario = permissao.getUsuario();

        if ( usuario == null ) {

            return null;
        }

        String nome = usuario.getNome();

        if ( nome == null ) {

            return null;
        }

        return nome;
    }
}

